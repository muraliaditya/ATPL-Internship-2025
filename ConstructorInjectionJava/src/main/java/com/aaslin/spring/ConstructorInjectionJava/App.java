package com.aaslin.spring.ConstructorInjectionJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Faculty faculty = context.getBean(Faculty.class);
        faculty.displayInfo();

        context.close();
        
        System.out.println( "Hello World!" );
    }
}
