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
	ProductDao pdao;

	@RequestMapping("/uh")
	public ModelAndView m1()
	{

		ModelAndView mv=new ModelAndView("userhome","pro",new Product());
		List proList=pdao.getAllProducts();
		mv.addObject("productInfo",proList);
		return mv;
	}
	@RequestMapping("/admin")
	String m2()
	{
		
		return "admin";
	}
	@RequestMapping("/showmoredetails")
	public ModelAndView showMoreDetails(@RequestParam("proid") int productId)
	{
		Product product=pdao.showMoreDetails(productId);
	
		ModelAndView mv=new ModelAndView("showmoredetails","pro",product);
	
		
	
		
		return mv;
	}
}
