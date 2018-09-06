package com.sowmya.web2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sowmya.web2.dao.CategoryDao;
import com.sowmya.web2.model.Category;

@Controller
public class CategoryController 
{
	@Autowired
	CategoryDao cDao;
	@RequestMapping("/category")
public ModelAndView m3()
{
	ModelAndView mv=new ModelAndView("showcategory","cat",new Category());
	List catList=cDao.getAllCategory();
	mv.addObject("categoryinfo",catList);
	return mv;
}
@RequestMapping(value="/addCategory",method=RequestMethod.POST)
public ModelAndView saveCategory(@ModelAttribute("cat") Category cat)
{
	cDao.insert(cat);
	List catList=cDao.getAllCategory();
	ModelAndView mv=new ModelAndView("showcategory","categoryinfo",catList);
	return mv;
}
@RequestMapping("/deletecat")
public ModelAndView deleteCategrory(@RequestParam("catid") int categoryId)
{
	cDao.deleteCategory(categoryId);
	List catList=cDao.getAllCategory();
	ModelAndView mv=new ModelAndView("showcategory","cat",new Category());
	mv.addObject("categoryinfo",catList);
return mv;
}
@RequestMapping("/editcat")
public ModelAndView editCategory(@RequestParam("catid") int categoryId)
{
	Category category=cDao.editCategory(categoryId);
	List catList=cDao.getAllCategory();
	
	ModelAndView mv=new ModelAndView("showcategory","cat",category);
	mv.addObject("categoryinfo",catList);
	return mv;
}
}
