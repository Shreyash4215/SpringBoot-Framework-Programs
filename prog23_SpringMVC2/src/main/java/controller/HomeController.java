package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String show()
	{
		System.out.println("At HomeController-show()");
		
		return "index";
	}

	@RequestMapping("/stud")
	public String studshow(Model m)
	{
		System.out.println("At HomeController-studshow()");
		m.addAttribute("name","Shreyash");
		
		return "stud";
	}	
}
