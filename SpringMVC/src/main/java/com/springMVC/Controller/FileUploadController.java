package com.springMVC.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	
	@RequestMapping("/filedata")
	public String fileUpload()
	{
		System.out.println("going to Image page");
		return "file_upload";
	}
	
	@RequestMapping(path="/file_upload",method = RequestMethod.POST)
	public String fileUploadHandle(@RequestParam("imagefile") CommonsMultipartFile file,HttpSession https,Model model)
	{
		// File details.
		/*System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getBytes());*/
		
		
		
		byte[] data=file.getBytes();  //we have to upload this on server.
		String Path=https.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"ServerData"+File.separator+file.getOriginalFilename();
		System.out.println("Path==> "+Path);
		
		
		
		try {
		FileOutputStream fos=new FileOutputStream(Path);
		fos.write(data);
		fos.close();
		System.out.println("file Uploaded");
		model.addAttribute("msg","Uploaded Successfully");
		model.addAttribute("filename",file.getOriginalFilename());
		}
		catch(IOException io) {
			io.printStackTrace();
			model.addAttribute("msg","Uploding Error");
			System.out.println("Uploading Error!!!!!!!");
		}
		return "fileUpload_success";
		
	}
}
