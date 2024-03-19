package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.student;

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
	public String Input()
	{
		System.out.println("At HomeController-method1()");
		
		return "Input";
	}
	
	@RequestMapping(value="/processing",method=RequestMethod.POST)
	public String processing(@ModelAttribute student obj,Model m)
	{
		System.out.println("processing......");
		
		System.out.println(obj);	//Call to To-String Method
		m.addAttribute("obj",obj);	//only adding single object
		
		System.out.println("HomeController Returning Output");
		return "Output";
	}
}
