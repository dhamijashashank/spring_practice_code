package com.common.controller; 

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController{
 
	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView admissionForm(){
 
		ModelAndView model = new ModelAndView("AdmissionForm");
		//		model.addObject("msg", "Hare Krishna Hare Krishna Krishna Krishna Hare Hare Hare Rama Hare Rama Rama Rama Hare Hare \n");
		return model;
	}
	
	@RequestMapping(value="/submitForm.html" , method=RequestMethod.POST)
	public ModelAndView helloWorld1(@RequestParam("username") String username ,@RequestParam("password") String password){
 
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Hare Krishna Hare Krishna Krishna Krishna Hare Hare Hare Rama Hare Rama Rama Rama Hare Hare \n"
				+ "username is "+ username +" and pass is "+ password);
		
		Student stuobj = new Student();
		stuobj.setStudentName(username);
		stuobj.setStudentHobby(password);
		
		model.addObject("Student", stuobj);
 
		return model;
	}
	
	@ModelAttribute
	public void addCommonObject(Model model){
		model.addAttribute("msg", "Hare Krishna Hare Krishna Krishna Krishna Hare Hare Hare Rama Hare Rama Rama Rama Hare Hare \n");
	}
	
	@RequestMapping(value="/submitForm1.html" , method=RequestMethod.POST)
	public ModelAndView helloWorld_modelAttribute(@ModelAttribute("studentobj") Student studentobj){
 
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		//		model.addObject("msg", "Hare Krishna Hare Krishna Krishna Krishna Hare Hare Hare Rama Hare Rama Rama Rama Hare Hare \n");
				//+ "username is "+ username +" and pass is "+ password);
 
		return model;
	}

	/**
	 * Below Exception occur if we are using @PathVariable with map and did not add <mvc:annotation-driven/> in servlet
	 *org.springframework.web.util.NestedServletException: 
	 *Request processing failed; nested exception is org.springframework.web.bind.annotation.support.HandlerMethodInvocationException:
	 * Failed to invoke handler method [public org.springframework.web.servlet.ModelAndView com.common.controller.HelloWorldController.
	 *PathVariable_map(java.util.Map)]; nested exception is java.lang.IllegalStateException: 
	 *Could not find @PathVariable [pathVars] in @RequestMapping
	 */
	@RequestMapping("/info/{username}/{password}")
	public ModelAndView PathVariable_map(@PathVariable Map<String,String> pathVars){
		
		String username = pathVars.get("username");
		String password = pathVars.get("password");
 
		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "helloWorld1 world ANn hare krishna hare krishna krishna krishna hare hare hare rama hare rama rama rama hare hare \n"
				+ "username is "+ username +" and pass is "+ password);
 
		return model;
	}


}