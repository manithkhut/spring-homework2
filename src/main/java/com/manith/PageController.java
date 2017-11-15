package com.manith;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

	@RequestMapping(value = {"/","/home","index"})
	public String indexPage(){
		System.out.println("Hello word!");
		return "index";
	}
	
	@RequestMapping("/contact")
	public String contactPage(){
		System.out.println("Contact Page!");
		return "/frontend/contact";	
	}
	
	@ResponseBody
	@RequestMapping("/test")
	public String test(){
		return "hello word!!";	
	}
	
//    /user?name=Dara

	@ResponseBody
	@RequestMapping("/user")
	public String user(@RequestParam(name = "name",required=false, defaultValue="please Input user Name")String name){
		System.out.println(name);
		return name;	
	}
	
//   /users/Manith	
	@ResponseBody
	@RequestMapping("/users/{name}")
	public String home(@PathVariable("name")String name){
		System.out.println(name);
		return "Hi " + name +". how are you to day?";
	}
	
}
