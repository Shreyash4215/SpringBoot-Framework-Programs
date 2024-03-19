package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//HttpServletRequest Interface
//Accessing Parameter from JSP page using HttpServletRequest Interface

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
	
	@RequestMapping("/processing")
	public String processing(HttpServletRequest request,Model m)
	{
		System.out.println("processing......");
		
		// 1) Accessing Element Of HTML
		String id = request.getParameter("txt1");
		String name = request.getParameter("txt2");
		String add = request.getParameter("txt3");
		
		// 2) Adding Element to Model
		m.addAttribute("id",id);
		m.addAttribute("name",name);
		m.addAttribute("add",add);
		
		System.out.println("HomeController Returning Output");
		return "Output";
	}
}
