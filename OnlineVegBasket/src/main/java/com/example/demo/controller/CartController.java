package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.Cart;
import com.example.demo.service.CartService;
@RestController
public class CartController {
	String finalprice="finalprice";
	String m="";
	@Autowired
	CartService cs;
	ModelAndView mv=new ModelAndView();
	@RequestMapping("/addtocart")
	public ModelAndView saveAddtocart(@RequestParam("vegname")String vegname,@RequestParam("vegquantity")int quantity,@RequestParam("offerprice")double offerprice)
	{
		double finalprice = quantity*offerprice;
		double vprice=quantity*offerprice;
		Cart neww = new Cart();
		neww.setVegname(vegname);
	    neww.setQuantity(quantity);
		neww.setOriginalprice(finalprice);
		m=m+vegname+" , "+quantity+" kg , Rs."+finalprice+" ; ";
		cs.saveOrUpdate(neww);
		return new ModelAndView("redirect:/customerhomepage");
	}
	@RequestMapping("/viewcart")
	public ModelAndView showcartdetails()
	{
		List<Cart> cartlist = cs.getCart();
		double total = cs.totalprice();
		mv.addObject("cartlist", cartlist);
		mv.addObject(finalprice, total);
		mv.setViewName("viewcartpage");
		return mv;
	}
	 @GetMapping("/deletecartbyid/{id}")
	    public ModelAndView delete(@PathVariable int id){  
	    	cs.delete(id);  
	        return new ModelAndView("redirect:/viewcart");  
	    } 
	 @RequestMapping("/placeorder")
		public ModelAndView placeoderpage()
		{
			
			double total = cs.totalprice();
			mv.addObject(finalprice, total);
			mv.addObject("m", m);
			mv.setViewName("order");
			return mv;
		}
	 @RequestMapping("/orderdata")
		public ModelAndView form()
		{
			mv.setViewName("thankyou");
			return mv;
		}
	 
	 
	 
}
