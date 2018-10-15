package com.sowmya.web2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sowmya.web2.dao.ProductDao;
import com.sowmya.web2.model.Product;
@Controller
public class homeController 
{
	@Autowired
	ProductDao productDao;

	@RequestMapping("/uh")
	public ModelAndView m1()
	{

		ModelAndView modelAndView=new ModelAndView("userhome","pro",new Product());
		List proList=productDao.getAllProducts();
		modelAndView.addObject("productInfo",proList);
		return modelAndView;
	}
	@RequestMapping("/admin")
	String m2()
	{
		
		return "admin";
	}
	}
