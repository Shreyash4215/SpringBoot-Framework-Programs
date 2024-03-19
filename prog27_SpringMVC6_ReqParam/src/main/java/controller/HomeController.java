package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//Accessing Parameter from JSP page using @RequestParam Annotation

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
	public String processing(
					@RequestParam("txt1") String id,
					@RequestParam("txt2") String name,
					@RequestParam("txt3") String add,
					Model m)
	{
		System.out.println("processing......");
		
		// 2) Adding Element to Model
		m.addAttribute("id",id);
		m.addAttribute("name",name);
		m.addAttribute("add",add);
		
		System.out.println("HomeController Returning Output");
		return "Output";
	}
}
