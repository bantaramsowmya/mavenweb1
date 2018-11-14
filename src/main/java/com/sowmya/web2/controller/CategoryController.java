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
	CategoryDao categoryDao;
	@RequestMapping("/category")
public ModelAndView categoryList()
{
	ModelAndView modelAndView=new ModelAndView("showcategory","cat",new Category());
	List catList=categoryDao.getAllCategory();
	modelAndView.addObject("categoryinfo",catList);
	return modelAndView;
}
@RequestMapping(value="/addCategory",method=RequestMethod.POST)
public ModelAndView saveCategory(@ModelAttribute("cat") Category cat)
{
	categoryDao.insert(cat);
	List catList=categoryDao.getAllCategory();
	ModelAndView modelAndView=new ModelAndView("showcategory","categoryinfo",catList);
	return modelAndView;
}
@RequestMapping("/deletecat")
public ModelAndView deleteCategrory(@RequestParam("catid") int categoryId)
{
	categoryDao.deleteCategory(categoryId);
	List catList=categoryDao.getAllCategory();
	ModelAndView modelAndView=new ModelAndView("showcategory","cat",new Category());
	modelAndView.addObject("categoryinfo",catList);
return modelAndView;
}
@RequestMapping("/editcat")
public ModelAndView editCategory(@RequestParam("catid") int categoryId)
{
	Category category=categoryDao.editCategory(categoryId);
	List catList=categoryDao.getAllCategory();
	
	ModelAndView modelAndView=new ModelAndView("showcategory","cat",category);
	modelAndView.addObject("categoryinfo",catList);
	return modelAndView;
}
}
