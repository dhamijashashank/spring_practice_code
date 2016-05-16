package com.common.controller; 

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/HelloWorldController")
public class HelloWorldController{
 
	@RequestMapping("/helloWorld/welcome1")
	public ModelAndView helloWorld(){
 
		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "hello world ANn hare krishna hare krishna krishna krishna hare hare hare rama hare rama rama rama hare hare ");
 
		return model;
	}
	
	@RequestMapping("/{username}/{password}")
	public ModelAndView helloWorld1(@PathVariable("username") String username ,@PathVariable("password") String password){
 
		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "helloWorld1 world ANn hare krishna hare krishna krishna krishna hare hare hare rama hare rama rama rama hare hare \n"
				+ "username is "+ username +" and pass is "+ password);
 
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