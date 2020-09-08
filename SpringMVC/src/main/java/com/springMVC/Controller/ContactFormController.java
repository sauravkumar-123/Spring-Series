package com.springMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springMVC.Model.User;
import com.springMVC.Service.UserService;

@Controller
public class ContactFormController {
	
	@Autowired
	private UserService userservice;
	
	@ModelAttribute
	public void commonDataModel(Model model)
	{
		model.addAttribute("header","Learn Code");
		model.addAttribute("desc","Code House for Learner");
		System.out.println("common data model!!!");
	}
	
	@RequestMapping("/contactform")
	public String showForm(Model model) {
		
		
		/*model.addAttribute("header","Learn Code");
		model.addAttribute("desc","Code House for Learner");*/
		
		
		return "contactForm";
	}

	//view to controller.
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String formHnadling(/*@RequestParam(name="email" , required=true) String userEmail,
		                       @RequestParam("username") String userName,
		                       @RequestParam("password") String password*/@ModelAttribute User user,Model model)
	{
		
		
		/*System.out.println("Email->"+userEmail);
		System.out.println("Username->"+userName);
		System.out.println("Password->"+password);*/
		
		
		/*User user=new User();
		user.setEmail(userEmail);
		user.setUsername(userName);
		user.setPassword(password);*/
		
		System.out.println(user.toString());
		//controller to view
		/*model.addAttribute("email",userEmail);
		model.addAttribute("username",userName);
		model.addAttribute("password",password);*/
		
		//model.addAttribute("user",user);
		
		//model.addAttribute("header","Learn Code");
		//model.addAttribute("desc","Code House for Learner");
		if(user.getEmail().isEmpty()||user.getUsername().isEmpty()||user.getPassword().isEmpty())
		{
			return "redirect:/contactform";
		}
		
		this.userservice.createUser(user);
		
		return "success";
		
	}
}
