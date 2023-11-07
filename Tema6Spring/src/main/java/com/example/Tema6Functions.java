package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Tema6Functions {
	@RequestMapping(value = "/laptops/{brand}" , method = RequestMethod.GET)
	
	public ModelAndView laptopPage( @PathVariable String brand) {
		ModelAndView mav= new ModelAndView();
		
		String laptopBrand = brand;
		int brandLength = laptopBrand.length();
		if(brandLength % 2 ==0 ) {
			 String r="par";
			 mav.addObject("paritate", r);
			 
		 } else {
			 String r="impar";
			 mav.addObject("paritate", r);
			 
		 }
		
		mav.addObject("laptopBrand", laptopBrand);
		mav.addObject("length", brandLength);
		mav.setViewName("laptop");
		
		return mav;
	}
	
	
}
