package com.example.demo.controller;
import java.sql.SQLException;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
@RestController
public class HomeController {
	@Autowired
	CustomerService customerservice;
	ModelAndView mv=new ModelAndView();
	@RequestMapping("/signup")
	public ModelAndView form()
	{
		mv.setViewName("register");
		return mv;
	}
	@RequestMapping("/adminlogout")
	public ModelAndView adminlogout()
	{
		mv.setViewName("/adminlogin");
		return mv;
	}
	@RequestMapping("/custlogout")
	public ModelAndView custlogout()
	{
		mv.setViewName("/customerlogin");
		return mv;
	}
	
	@PostMapping("/adddata")
	public ModelAndView add(@ModelAttribute Customer c) throws ClassNotFoundException, SQLException {
		//System.out.println("Testing");
		String name=c.getName();
		String phn=c.getMobile();
		String email=c.getEmail();
//		boolean a=Pattern.matches("[A-Za-z]+$",name);
//		boolean b=Pattern.matches("^[0-9]{10}$",phn);
//		boolean d=Pattern.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\'.[a-z]{2,}$", email);
//		if(a==true && b==true && d==true)
//			  {
//			System.out.println("Testing 1");
//			  customerservice.adddata(c);
//				
//			  }
//		 else
//		 {
//			 System.out.println("Testing 2");
//			  return new ModelAndView("redirect:/signup"); 
//			  
//		}
		 customerservice.adddata(c);
		System.out.println("Testing 3");
		  return new ModelAndView("redirect:/generalhome"); 
		}
	
	@RequestMapping("/generalhome")
	public ModelAndView geenralhome()
	{
		mv.setViewName("Generalhomepage");
		return mv;
	}
	@RequestMapping("/adminlogin")
	public ModelAndView adminlogin()
	{
		mv.setViewName("adminlogin");
		return mv;
	}
	@RequestMapping("/customerlogin")
	public ModelAndView customerlogin()
	{
		mv.setViewName("customerlogin");
		return mv;
	}	
}
