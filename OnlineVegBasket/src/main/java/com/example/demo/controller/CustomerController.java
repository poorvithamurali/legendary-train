package com.example.demo.controller;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
@RestController
public class CustomerController {
	@Autowired
	CustomerService customerservice;
	ModelAndView mv=new ModelAndView();
	public CustomerController()
	{
		super();
	}  
	@RequestMapping("/customerhomepage")
	public ModelAndView form()
	{
		mv.setViewName("customerhomepage");
		return mv;
	}
	@GetMapping("/viewcustomers")  
    public ModelAndView viewcustomers(){  
        List<Customer> customers=customerservice.getcustomers();
       mv.addObject("customers",customers);
       mv.setViewName("viewcustomers");
       return mv;
	}

    @GetMapping("/deletecustomer/{id}")
    public ModelAndView delete(@PathVariable int id){  
    	customerservice.delete(id);  
        return new ModelAndView("redirect:/viewcustomers");  
    } 
   
}
   