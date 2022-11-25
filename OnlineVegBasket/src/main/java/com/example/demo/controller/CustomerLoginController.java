package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;
@RestController
public class CustomerLoginController {
	@Autowired
	CustomerService customerservice;
	@Autowired
	CustomerRepository customerrepo;
	ModelAndView mv=new ModelAndView();
	@PostMapping("/cuslogin")
	public ModelAndView login(@ModelAttribute Customer c)
	{
		
		String userEmail=c.getEmail();
		String userPass=c.getPassword();
		
		if(customerrepo.findByEmail(userEmail)==null)
		{
			return new ModelAndView("redirect:/customerlogin");  
		}
		else if(userPass.equals(customerrepo.findByEmail(userEmail).getPassword()))
		{
			return new ModelAndView("redirect:/customerhomepage");  
		}
		return null;
		
	}
	
}
