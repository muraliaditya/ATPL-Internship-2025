package com.aaslin.spring.BeanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

         System.out.println("Bean is ready to use");
         
      
    }

}
