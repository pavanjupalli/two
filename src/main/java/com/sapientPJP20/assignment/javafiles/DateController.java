package com.sapientPJP20.assignment.javafiles;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DateController {
	
	
	@Autowired
	public UserService userService;
	
	
	@RequestMapping("/")
	public String home() {
		return "login.jsp";
	}
	
	@RequestMapping("/authorization")
	public String home(@RequestParam(name = "username",required = false) String username,@RequestParam(name = "password",required = false) String password
			,@RequestParam(name = "submit",required = false) String submit) {
	   
	   Boolean exist = userService.name(username, password)== true;
	   System.out.println(exist);
	   if(exist.equals( true))
	   return "sucess.jsp";
	   else
	   return "failure.jsp";
	
	}
}
