package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class home {

		@RequestMapping("/home")
		public String home1()
		{
			return "index.jsp";
		}
}
