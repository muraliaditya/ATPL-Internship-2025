package com.aaslin.spring.multipledi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
         University university = context.getBean(University.class);
         university.showDetails();
        System.out.println( "Hello World!" );
    }
}
