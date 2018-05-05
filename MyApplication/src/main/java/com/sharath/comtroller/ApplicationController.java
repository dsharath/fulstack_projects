package com.sharath.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ApplicationController {
	
	@ResponseBody
	@RequestMapping("/home")
	public String Hello() {
		
		return "hello spring";
	}
	
	@RequestMapping
	public String Welcome(){
		
		return "welcomepage";
		
		
	}

}
