package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.Service.RegisterService;
import com.training.beans.MyUser;
@Controller
public class MyController {
	@Autowired
	RegisterService registerService;
@RequestMapping(value="/")
	public String index() {
		return "index";
	}

@RequestMapping(value="adduser")
public ModelAndView welcome() {
	return new ModelAndView("RegisterUser","command",new Object());
}


@RequestMapping(value="Register")
public ModelAndView registerUser(@RequestParam String fname,@RequestParam String lname,@RequestParam String bdate,@RequestParam String gender,
@RequestParam String country,
@RequestParam String state,
@RequestParam String city,
@RequestParam String email,
@RequestParam String password) 
{
	MyUser u=new MyUser(fname,lname,bdate,gender,country,state,city,email,password);
			int i=registerService.registerUser(u);
			if(i>0) {
				String msg="Register succesfully";
				return new ModelAndView("RegisterUser","msg",msg);
			}
			else {
			return new ModelAndView("redirect:index.jsp");
			}
}
}
