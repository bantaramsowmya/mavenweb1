package com.sowmya.web2.controller;

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
CartDao cDao;
@Autowired
ProductDao pdao;
@Autowired
HttpSession session;
@RequestMapping("/addtocart")
public ModelAndView insert(@RequestParam("productId") int productId,@RequestParam("quantity") int quantity,String username)
{
	
	String un=(String) session.getAttribute("uname");
	cDao.insertCart(productId, quantity, un);
	List proList=pdao.getAllProducts();
	ModelAndView mv=new ModelAndView("userhome","productInfo",proList);
	return mv;
	
}
@RequestMapping("/cart1")
public ModelAndView cartDetails()
{
	String un=(String) session.getAttribute("uname");
	List cartList=cDao.getAllCartDetails(un);
	ModelAndView mv=new ModelAndView("cart","cartinfo",cartList);
	return mv;
}

	
}

