package com.practical3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//type secound use @Component with Parameter
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	//IOC Will object Automatically with camrl case;her grtBean("student") is must
        Student obj = context.getBean("myObj",Student.class);
        System.out.println(obj);
    }
}
