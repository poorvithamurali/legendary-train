package com.example.demo.controller;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Review;
import com.example.demo.service.ReviewService;
@RestController
public class ReviewController {
	@Autowired
	ReviewService reviewservice;
	ModelAndView mv=new ModelAndView();
	public ReviewController()
	{
		super();
	}
	@RequestMapping("/addreview")
	public ModelAndView form()
	{
		mv.setViewName("AddReview");
		return mv;
	}
	@PostMapping("/addreviews")
	public ModelAndView add(@ModelAttribute Review r) throws ClassNotFoundException, SQLException {
		reviewservice.addreview(r);
		mv.setViewName("redirect:/ViewReviews");
		return mv;
		}
	
	@GetMapping("/viewrev")  
    public ModelAndView viewrev(){  
        List<Review> reviews=reviewservice.getrev();
       mv.addObject("reviews",reviews);
       mv.setViewName("ViewReviews");
       return mv;
	}

    @GetMapping("/deleterev/{reviewid}")
    public ModelAndView delete(@PathVariable int reviewid){  
    	reviewservice.delete(reviewid);  
        mv.setViewName("redirect:/ViewReviews");
		return mv;  
    }  

	

}
