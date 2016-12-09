package com.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Test")
public class LoginController {

	@RequestMapping("/{username}/{password}" )
	public ModelAndView login(@RequestParam("username") String username , @RequestParam("password") String password){
		ModelAndView model = null;
		if (username.equals("")&& password.equals("")){
			model = new ModelAndView("SuccessLogin");	
		}else{
			model = new ModelAndView("FailLogin");	
		}
		return model;
	}
	
	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView model = new ModelAndView("AdmissionForm");
		model.addObject("msg", " hare krishna hare krishna krishna krishna hare hare hare rama hare rama rama rama hare hare ");
		System.out.println("Hare krishna...............hare krishna..........................");
		return model;		
	}
}
