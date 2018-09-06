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
AuthenticationDao aDao;
@Autowired
ProductDao pdao;
@RequestMapping("/Register")
public ModelAndView m1() 
{
	ModelAndView mv=new ModelAndView("Register","reg",new Register());
	return mv;
}
@RequestMapping("/Register1")
public ModelAndView insertRegister(@ModelAttribute("reg") Register reg)
{
	boolean result=aDao.insertRegisterDetails(reg);
	List proList=pdao.getAllProducts();
	ModelAndView mv=new ModelAndView("userhome","productInfo",proList);
	mv.addObject("regresult",result);
	return mv;
}
//@RequestMapping("/Login")
public ModelAndView m2()
{
	return new ModelAndView("Login");
}

//@RequestMapping("/Login1")
public ModelAndView insertLogin(@RequestParam("em") String email,@RequestParam("pwd") String passWord)
{
	boolean result=aDao.login(email, passWord);
	
	System.out.println(result);
	List proList=pdao.getAllProducts();
	ModelAndView mv=new ModelAndView("userhome","productInfo",proList);
	return mv;
}



}