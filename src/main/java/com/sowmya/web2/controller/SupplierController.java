package com.sowmya.web2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sowmya.web2.dao.SupplierDao;
import com.sowmya.web2.model.Supplier;

@Controller
public class SupplierController 
{
	@Autowired
	SupplierDao supDao;
	@RequestMapping("/supplier")
	public ModelAndView m4()
	{
		ModelAndView mv=new ModelAndView("showsupplier","sup",new Supplier());
		List supList=supDao.getAllSupplies();
		mv.addObject("supplierinfo",supList);
		return mv;
	}
	@RequestMapping(value="/addSupplier",method=RequestMethod.POST)
	public ModelAndView saveCategory(@ModelAttribute("sup") Supplier sup)
	{
		supDao.insert(sup);
		List supList=supDao.getAllSupplies();
		ModelAndView mv=new ModelAndView("showsupplier","supplierinfo",supList);
		return mv;
	}
	@RequestMapping("/deletesup")
	public ModelAndView deleteSupplier(@RequestParam("supid") int supplierId)
	{
		supDao.deleteSupplier(supplierId);
		List supList=supDao.getAllSupplies();
		ModelAndView mv=new ModelAndView("showsupplier","sup",new Supplier());
		mv.addObject("supplierinfo",supList);
		return mv;
	}
	@RequestMapping("/editsup")
	public ModelAndView editSupplier(@RequestParam("supid") int supplierId)
	{
	Supplier supplier=supDao.editSupplier(supplierId);
	List supList=supDao.getAllSupplies();
	ModelAndView mv=new ModelAndView("showsupplier","sup",supplier);
	mv.addObject("supplierinfo",supList);
	return mv;
	}
}
