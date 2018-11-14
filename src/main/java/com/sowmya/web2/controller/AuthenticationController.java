package com.sowmya.web2.controller;



import java.util.List;

import javax.security.auth.login.LoginContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sowmya.web2.dao.AuthenticationDao;
import com.sowmya.web2.dao.ProductDao;

import com.sowmya.web2.model.Register;

@Controller
public class AuthenticationController 
{
@Autowired
AuthenticationDao authenticationDao;
@Autowired
ProductDao productDao;
@RequestMapping("/Register")
public ModelAndView m1() 
{
	ModelAndView modelandview=new ModelAndView("Register","reg",new Register());
	return modelandview;
}
@RequestMapping("/Register1")
public ModelAndView insertRegister(@ModelAttribute("reg") Register reg)
{
	boolean result=authenticationDao.insertRegisterDetails(reg);
	List proList=productDao.getAllProducts();
	ModelAndView modelAndView=new ModelAndView("userhome","productInfo",proList);
	modelAndView.addObject("regresult",result);
	return modelAndView;
}
//@RequestMapping("/Login")
public ModelAndView m2()
{
	return new ModelAndView("Login");
}

//@RequestMapping("/Login1")
public ModelAndView insertLogin(@RequestParam("em") String email,@RequestParam("pwd") String passWord)
{
	boolean result=authenticationDao.login(email, passWord);
	
	System.out.println(result);
	List proList=productDao.getAllProducts();
	ModelAndView modelAndView=new ModelAndView("userhome","productInfo",proList);
	return modelAndView;
}

}