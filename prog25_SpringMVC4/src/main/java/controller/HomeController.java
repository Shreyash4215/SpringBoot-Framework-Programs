package controller;

import org.springframework.stereotype.Controller;
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
	public String studshow()
	{
		System.out.println("At HomeController-studshow()");
		
		return "student";
	}
	
	@RequestMapping("/stud2")
	public String stud2show()
	{
		System.out.println("At HomeController-showstud2()");
		
		return "student2";
	}
}
