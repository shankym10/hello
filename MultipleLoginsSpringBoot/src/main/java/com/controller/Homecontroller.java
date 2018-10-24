package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Serviceinterface.Serviceinterface;
import com.model.Login;
import com.model.Roll;

@Controller
public class Homecontroller {
	@Autowired
	Serviceinterface service;

	public Serviceinterface getService() {
		return service;
	}

	public void setService(Serviceinterface service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String start()
	{
		return "login";
		
	}
	
	@RequestMapping("/registerpage")
	public String register()
	{
		return "register";
		
	}
	@RequestMapping("/reister")
	public String SaveUser(@ModelAttribute Login login,@ModelAttribute Roll roll)
	{
		System.out.println("Hiiiii");
		Roll roll1=service.getRoll(roll.getRollname());
		//System.out.println(roll1.getRollname()+roll1.getId());
		System.out.println("Hellooooo");
	    login.setRoll(roll1);
	     Login log=(Login)service.SaveUser(login);
	    
		return "login";
	     
	}
	@RequestMapping("/login")
	public String login(@ModelAttribute Login login,@ModelAttribute Roll roll, Model model)
	{
		Login log =service.check(login);
		int id=log.getRoll().getId();
		if(id==1)
		{
		return "Admin";	
		}
		else if(id==2)
		{
			return "Manager";
		}
		else if(id==3)
		{
			return "User";
			
		
		}
		else{
		
		return "login";
		}
		
	}
}
