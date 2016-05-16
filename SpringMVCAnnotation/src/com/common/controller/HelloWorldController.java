package com.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/HelloWorldController")
public class HelloWorldController{
 
	@RequestMapping("/welcome1")
	public ModelAndView helloWorld(){
 
		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "hello world ANn hare krishna hare krishna krishna krishna hare hare hare rama hare rama rama rama hare hare ");
 
		return model;
	}
	
	@RequestMapping("/welcome2")
	public ModelAndView helloWorld1(){
 
		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "helloWorld1 world ANn hare krishna hare krishna krishna krishna hare hare hare rama hare rama rama rama hare hare ");
 
		return model;
	}
}