package com.spring.Webmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController implements Applica {
	
    @RequestMapping("/add")
	public String add()
	{
		System.out.println("I am here");
		 return "info.jsp";
		
	}
}
