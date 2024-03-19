package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeControler {
	@RequestMapping("/")
	public String show()
	{
		System.out.println("At HomeController-show()");
		
		return "index";
	}

	@RequestMapping("/form1")
	public String method1(Model m)
	{
		System.out.println("At HomeController-studshow()");
		m.addAttribute("heading","Dynamic URL using Model");
		m.addAttribute("name","Shreyash");
		m.addAttribute("add","BMT");
		List<String> hobbies = new ArrayList<String>() ;
		hobbies.add("cricket");
		hobbies.add("Football");
		hobbies.add("chess");
		m.addAttribute("h",hobbies);
		
		return "form1";
	}
	
	@RequestMapping("/form2")
	public ModelAndView method2()
	{
		ModelAndView obj = new ModelAndView();
		
		System.out.println("At HomeController-studshow()");
		obj.addObject("heading","Dynamic URL Using Model And View");
		obj.addObject("name","Shreyash");
		obj.addObject("add","BMT");
		List<String> Hobby = new ArrayList<String>() ;
		Hobby.add("cricket");
		Hobby.add("Football");
		Hobby.add("chess");
		obj.addObject("h",Hobby);
		
		obj.setViewName("form2");
		return obj;
	}
}
