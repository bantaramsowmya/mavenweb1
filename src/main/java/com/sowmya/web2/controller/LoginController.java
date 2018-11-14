package com.sowmya.web2.controller;

import java.math.BigInteger;
import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sowmya.web2.dao.AuthenticationDao;
import com.sowmya.web2.dao.CartDao;
import com.sowmya.web2.model.Register;

@Controller
public class LoginController 
{
	@Autowired
	CartDao cartDao;
	@RequestMapping("/Login")
	public ModelAndView goLogin()
	{
		System.out.println("going to login form");
		return new ModelAndView("Login");
	}
	
	@RequestMapping("/LoginError")
	public ModelAndView goLoginError()
	{
		
		return new ModelAndView("LoginError");
	}

	@Autowired
	AuthenticationDao authenticationDao;
	
	
	 @SuppressWarnings("unchecked")
	    @RequestMapping(value = "/login_session_attributes")
	    public String login_session_attributes(HttpSession session,Model model) {
		 System.out.println("email ========");
	        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
	       
	        Register  user = authenticationDao.getUser(userName);
	        System.out.println("username ========"+user.getRole());
	        session.setAttribute("uname", user.getUserName());
	        session.setAttribute("name", user.getPassWord());
	        
	        session.setAttribute("LoggedIn", "true");
	        session.setAttribute("LoggedOut", "false");
	      
	        
	        
	         //session.setAttribute("cartcnt",count);
	        Collection<GrantedAuthority> authorities;
	        authorities= (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
	        String page="";
	        String role="ROLE_USER";
	        for (GrantedAuthority authority : authorities)
	        {
	          
	             if (authority.getAuthority().equals(role))
	             {
	                 session.setAttribute("UserLoggedIn", true);
	                 session.setAttribute("uname", user.getUserName());
	             page="/Home";
	                 session.setAttribute("test",1);
	                 BigInteger r=(BigInteger) cartDao.noOfrows(userName);
	             	session.setAttribute("rows", r);

	             }
	             else
	             {
	                 session.setAttribute("Administrator",true);
	                 //session.setAttribute("UserName", user.getUsername());
	                 page="/admin";
	            
	            }
	        }
	        return page;
	    }
	}
	
	
	
	

