package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
@RestController
public class AdminLoginController {
	@Autowired
	AdminRepository adminrepo;
	ModelAndView mv=new ModelAndView();
	@RequestMapping("/adminhomepage")
	public ModelAndView form()
	{
		mv.setViewName("adminhomepage");
		return mv;
	}
	@PostMapping("/adminlogin")
	public ModelAndView login(@ModelAttribute Admin a)
	{
		
		String userEmail=a.getEmail();
		String userPass=a.getPassword();
		
		if(adminrepo.findByEmail(userEmail)==null)
		{
			return new ModelAndView("redirect:/adminlogin");  
		}
		else if(userPass.equals(adminrepo.findByEmail(userEmail).getPassword()))
		{
			return new ModelAndView("redirect:/adminhomepage");  
		}
		return null;
		
	}

	
	
}