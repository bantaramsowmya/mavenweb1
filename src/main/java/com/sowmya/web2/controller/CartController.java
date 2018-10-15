package com.sowmya.web2.controller;

import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sowmya.web2.dao.CartDao;
import com.sowmya.web2.dao.ProductDao;
import com.sowmya.web2.model.Cart;
@Controller
public class CartController 
{
@Autowired
CartDao cartDao;
@Autowired
ProductDao productDao;
@Autowired
HttpSession session;
@RequestMapping("/addtocart")
public ModelAndView insert(@RequestParam("productId") int productId,@RequestParam("quantity") int quantity)
{
	
	String username=(String) session.getAttribute("uname");
	cartDao.insertCart(productId, quantity, username);
	List proList=productDao.getAllProducts();
	ModelAndView modelAndView=new ModelAndView("userhome","productInfo",proList);
	return modelAndView;
	
}
@RequestMapping("/cart1")
public ModelAndView cartDetails()
{
	String username=(String) session.getAttribute("uname");
	List cartList=cartDao.getAllCartDetails(username);
	ModelAndView modelAndView=new ModelAndView("cart","cartinfo",cartList);
		return modelAndView;
}

}
