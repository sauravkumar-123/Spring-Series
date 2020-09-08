package com.springMVC.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mainPage")
public class HomeController {
	
	//@RequestMapping("/home")//1st way
	@RequestMapping(path ="/home",method = RequestMethod.GET) //2nd way
	public String home(Model model) {
		
		System.out.println("Home page");
		List<String> course=new ArrayList<String>();
		course.add("C");
		course.add("C++");
		course.add("JAVA");
		course.add("PYTHON");
		course.add("PERL");
		course.add("PHP");
		
		model.addAttribute("Name","Saurav Kumar");
		model.addAttribute("Email","sauravkumar.tit@gmail.com");
		model.addAttribute("Mobno","9691098742");
		model.addAttribute("Course",course);
		return "index";	
	}

	
	@RequestMapping("/about")
	public String about() {
		
		System.out.println("About-us page");
		return "about";	
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("Help page");
		
		ModelAndView mv=new ModelAndView();
		
		LocalDateTime now=LocalDateTime.now();
		List<String> location=new ArrayList<String>();
		location.add("Bhopal");
		location.add("Indore");
		location.add("Patna");
		location.add("Bengaluru");
		location.add("Cheenai");
		location.add("Mysore");
		//seeting data
		mv.addObject("Email","info@shiksha.com");
		mv.addObject("Mobno","7979969287");
		mv.addObject("Time",now);
		
		//passing list
		mv.addObject("OfficeLocation",location);
		//seeting view name
		mv.setViewName("help");
		return mv;
	}
}
