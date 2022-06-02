package com.test.maven;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	
	@RequestMapping(value="/",method = RequestMethod.GET)
    public String welcome(ModelMap model) {
		System.out.println("Inside Welcome Page/Index Page");
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm");  
		   LocalDateTime now = LocalDateTime.now();  
		model.addAttribute("msg", "Welcome to my Java - Test App");
		model.addAttribute("inTime", "Your IN Time->"+dtf.format(now));
        return "index";
 
    }
}
