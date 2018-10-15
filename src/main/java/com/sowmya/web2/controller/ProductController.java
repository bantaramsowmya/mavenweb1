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

import com.sowmya.web2.dao.CategoryDao;
import com.sowmya.web2.dao.ProductDao;
import com.sowmya.web2.dao.SupplierDao;
import com.sowmya.web2.model.Product;

@Controller
public class ProductController 
{
	@Autowired
	ProductDao productDao;
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	SupplierDao supplierDao;
	@RequestMapping("/product1")
public ModelAndView productList()
{

	ModelAndView modelAndView=new ModelAndView("showproducts","pro",new Product());
	List proList=productDao.getAllProducts();
	modelAndView.addObject("productInfo",proList);
	List catList=categoryDao.getAllCategory();
	modelAndView.addObject("categoryInfo",catList);
	List supList=supplierDao.getAllSupplies();
	modelAndView.addObject("supplierInfo",supList);
	return modelAndView;
}
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute("pro") Product pro)
	{
		
		List proList=productDao.getAllProducts();
		try
		{
		MultipartFile proImg=pro.getProductImg();
		System.out.println(proImg.getClass().getName());
		int  id=(int)(Math.random()*100000);
		pro.setProductId(id);
		productDao.insert(pro);
		File f=new File("D://workspace\\mavenweb1\\src\\main\\webapp\\resources\\"+String.valueOf(id)+".jpg");
		FileOutputStream fos=new FileOutputStream(f);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
			bos.write(proImg.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelAndView modelAndView=new ModelAndView("showproducts","productInfo",proList);
		
		return modelAndView;
	}
	@RequestMapping("/deletepro")
	public ModelAndView deleteProduct(@RequestParam("proid") int productId)
	{
		productDao.deleteProduct(productId);
		List proList=productDao.getAllProducts();
		ModelAndView modelAndView=new ModelAndView("showproducts","pro",new Product());
		modelAndView.addObject("productInfo",proList);
		return modelAndView;
		
	}
	@RequestMapping("/editpro")
	public ModelAndView editProduct(@RequestParam("proid") int productId)
	{
		Product product=productDao.editProduct(productId);
		List proList=productDao.getAllProducts();
		ModelAndView modelAndView=new ModelAndView("showproducts","pro",product);
		modelAndView.addObject("productinfo",product);
		return modelAndView;
		
	}
	@RequestMapping("/showmoredetails")
	public ModelAndView showMoreDetails(@RequestParam("proid") int productId)
	{
		Product product=productDao.showMoreDetails(productId);
	
		ModelAndView modelAndView=new ModelAndView("showmoredetails","pro",product);
		return modelAndView;
	}

	
}
