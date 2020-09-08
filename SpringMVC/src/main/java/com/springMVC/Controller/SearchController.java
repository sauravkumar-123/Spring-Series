package com.springMVC.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/user/{userId}/{userName}")
	public String getuserDetails(@PathVariable("userId") int userId,@PathVariable("userName") String userName)
	{
		System.out.println("going to 1st home view");
		System.out.println(userId+" "+userName);
		return "home";
	}
	
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("going to 1st home view");
		/*String str=null;
		System.out.println(str.length());*/
		return "home";
	}
	
	@RequestMapping(path="/search",method=RequestMethod.GET)                 
	public RedirectView search(@RequestParam("search_bar") String query) {
	
		RedirectView rv=new RedirectView();
		
		if(query.isEmpty()==true)
		{
			rv.setUrl("home");
			return rv;
		}
		else {
			String URL="https://www.google.com/search?q="+query;
			rv.setUrl(URL);
			return rv;
		}	
	}
	
	
	
	
	
	//Handling Exception
	   /* @ExceptionHandler({NullPointerException.class,IOException.class,NumberFormatException.class})
		public String exceptionHandler()
		{
			return "errorPage";
		}
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
		model.addAttribute("msg","NumberFormatException found!!!!!!!");
		return "errorPage";
	}
	*/
}
