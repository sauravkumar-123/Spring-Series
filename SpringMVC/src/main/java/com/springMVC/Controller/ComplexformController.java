package com.springMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.springMVC.Model.StudentDetail;
import com.springMVC.Service.StudentDetailService;

@Controller
public class ComplexformController {

	
	@Autowired
	private StudentDetailService studentdetailservice;
	
	@RequestMapping("/complexform")
	public String complexform()
	{
		System.out.println("going to Complex_Form view page");
		return "complex_form";
	}
	
	@RequestMapping(path="/complexform_process" ,method = RequestMethod.POST)
	public String complexformhandle(@ModelAttribute("studentdetail") StudentDetail studentdetail,BindingResult bindingresult)
			                       
	{
		
		if(bindingresult.hasErrors())
		{
			return "redirect:/complexform";
		}
		System.out.println(studentdetail.toString());
		
		this.studentdetailservice.createStudentDetail(studentdetail);
		
		return "complexformsuccess";
		
	}
}
