package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/welcome")
	public ModelAndView myModelAndViewFunction() {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("myMessage","Using Spring MVC with annotations");
		
		return modelAndView;
	}
	
}
