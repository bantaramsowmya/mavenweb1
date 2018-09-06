package com.sowmya.web2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sowmya.web2.model.Product;
@Controller
public class NewController {
	Product p=new Product();
	

		@RequestMapping("/product")
		public ModelAndView m1()
		{
			p.setProductId(101);
			p.setProductName("lenovo");
			p.setProductCategory("abc");
			ModelAndView mv1=new ModelAndView("pro1","v1",p);
			return mv1;
		}
}

