package com.sowmya.web2.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sowmya.web2.dao.OrderDao;

@Controller
public class OrderController 
{
	@Autowired
	HttpSession httpsession;
	@Autowired
	OrderDao orderdao;
@RequestMapping(value="/CancelOrder" ,method=RequestMethod.POST)
public ModelAndView cancelOrder(HttpSession httpSession)
{
	String cartuser=(String)httpsession.getAttribute("uname");
     orderdao.deleteOrder(cartuser);
	ModelAndView modelAndView=new ModelAndView("cart");
	return modelAndView;
}
}
