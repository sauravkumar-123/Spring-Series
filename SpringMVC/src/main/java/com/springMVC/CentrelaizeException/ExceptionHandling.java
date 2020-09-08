package com.springMVC.CentrelaizeException;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandling {

	//Hnadling Exception for All Controller.
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String NullPointerexceptionHandler(Model model)
	{
		model.addAttribute("msg","NullPointerException found!!!!!!!");
		return "errorPage";
	}
	
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String NumberFormatexceptionHandler(Model model)
	{
		model.addAttribute("msg","NumberFormatException found!!!!!!!");
		return "errorPage";
	}
	
	
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String GenericexceptionHandler(Model model)
	{
		model.addAttribute("msg","Exception found!!!!!!!");
		return "errorPage";
	}
	
}
