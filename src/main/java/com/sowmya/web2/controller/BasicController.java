package com.sowmya.web2.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sowmya.web2.dao.ProductDao;
import com.sowmya.web2.model.Product;

@Controller
public class BasicController 
{
	@Autowired
	ProductDao pdao;
	@RequestMapping("/product1")
public ModelAndView m2()
{

	ModelAndView mv=new ModelAndView("showproducts","pro",new Product());
	List proList=pdao.getAllProducts();
	mv.addObject("productInfo",proList);
	return mv;
}
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute("pro") Product pro)
	{
		
		List proList=pdao.getAllProducts();
		try
		{
		MultipartFile proImg=pro.getProductImg();
		System.out.println(proImg.getClass().getName());
		int  id=(int)(Math.random()*100000);
		pro.setProductId(id);
		pdao.insert(pro);
		File f=new File("D://workspace\\mavenweb1\\src\\main\\webapp\\resources\\"+String.valueOf(id)+".jpg");
		FileOutputStream fos=new FileOutputStream(f);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
			bos.write(proImg.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		ModelAndView mv=new ModelAndView("showproducts","productInfo",proList);
		
		return mv;
	}
	@RequestMapping("/deletepro")
	public ModelAndView deleteProduct(@RequestParam("proid") int productId)
	{
		pdao.deleteProduct(productId);
		List proList=pdao.getAllProducts();
		ModelAndView mv=new ModelAndView("showproducts","pro",new Product());
		mv.addObject("productInfo",proList);
		return mv;
		
	}
	@RequestMapping("/editpro")
	public ModelAndView editProduct(@RequestParam("proid") int productId)
	{
		Product product=pdao.editProduct(productId);
		List proList=pdao.getAllProducts();
		ModelAndView mv=new ModelAndView("showproducts","pro",product);
		mv.addObject("productinfo",product);
		return mv;
		
	}
	
}
