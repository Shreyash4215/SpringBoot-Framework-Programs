package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import model.calci;


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
	
	@RequestMapping(value="/processing",method=RequestMethod.GET)
	public String processing(@ModelAttribute calci obj,Model m)
	{
		System.out.println("processing......");
		
		int ans = obj.process();
		
		m.addAttribute("obj",obj);	
		m.addAttribute("ans",ans);
		
		System.out.println("HomeController Returning Output");
		return "Output";
	}
}
