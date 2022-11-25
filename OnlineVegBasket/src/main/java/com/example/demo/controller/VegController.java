package com.example.demo.controller;
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

import com.example.demo.model.VegDTO;
import com.example.demo.model.Vegetable;
import com.example.demo.service.VegService;
@RestController
public class VegController {
	@Autowired
	VegService vegservice;
	ModelAndView mv=new ModelAndView();
	public VegController()
	{
		super();
	}
	@RequestMapping("/viewcustveg")
	public ModelAndView viewcustveg()
	{
		List<Vegetable> vegetables=vegservice.getveg();
	       mv.addObject("vegetables",vegetables);
	       mv.setViewName("VegView");
	       return mv;
	} 
	@RequestMapping("/addvegdets")
	public ModelAndView form()
	{
		mv.setViewName("AddVeg");
		return mv;
	}
	@PostMapping("/addveg")
	public ModelAndView add(@ModelAttribute Vegetable v)  {
		vegservice.adddata(v);
		mv.setViewName("redirect:/adminhomepage");
		return mv;
		}
	
	@GetMapping("/viewveg")  
    public ModelAndView viewveg(){  
        List<Vegetable> vegetables=vegservice.getveg();
       mv.addObject("vegetables",vegetables);
       mv.setViewName("ViewVeg");
       return mv;
	}

    @GetMapping("/deleteveg/{vegid}")
    public ModelAndView delete(@PathVariable int vegid){  
    	vegservice.delete(vegid);  
        mv.setViewName("redirect:/viewveg");
		return mv;  
    }  
    
    @GetMapping("/editvegbyid/{vegid}")
    public ModelAndView update(@PathVariable int vegid){  
		Vegetable veg = vegservice.getVegById(vegid);
		mv.addObject("veg", veg);
		mv.setViewName("editveg");
		return mv;
    } 
    @RequestMapping("/editvegdata")
	public ModelAndView updateveg(@ModelAttribute("Vegetable") VegDTO vd)
	{
		vegservice.saveorupdate(vd);
		mv.setViewName("redirect:/viewveg");
		return mv;
	}

}
