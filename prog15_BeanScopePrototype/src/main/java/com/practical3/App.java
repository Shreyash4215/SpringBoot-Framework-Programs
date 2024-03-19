package com.practical3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Spring Bean Scope - Prototype
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	Student obj =(Student) context.getBean("beanStudent");
    	obj.setName("Abcd");
        System.out.println("Student Name = "+obj.getName());
        
        // due to prototype scope IoC will create object Everytime
    
        Student obj2 =(Student) context.getBean("beanStudent");
        System.out.println("Student Name = "+obj2.getName());
        
        // To cross check this; if we print hashCode of both objects then it will print same hashcode
        System.out.println("obj = "+obj.hashCode());
        System.out.println("obj2 = "+obj2.hashCode());
    }
}
