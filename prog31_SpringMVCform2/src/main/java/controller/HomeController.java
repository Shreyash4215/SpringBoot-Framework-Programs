package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import model.registration;

//@ModelAttribute
//Accessing Parameter from JSP page using @ModelAttribute Annotation

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String show()
	{
		System.out.println("At HomeController-show()");
		
		return "index";
	}

	@RequestMapping("/Input")
	public String Input(Model m)
	{
		System.out.println("At HomeController-method1()");
		registration obj = new registration();
		m.addAttribute("obj",obj);
		
		return "Input";
	}
	
	@RequestMapping(value="/processing")
	public String processing(@ModelAttribute registration obj,Model m)
	{
		System.out.println("processing......");
		
		m.addAttribute("obj",obj);	
		
		System.out.println("HomeController Returning Output");
		return "Output";
	}
}
