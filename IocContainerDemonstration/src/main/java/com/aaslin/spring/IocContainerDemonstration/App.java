package com.aaslin.spring.IocContainerDemonstration;

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
    	College college = context.getBean(College.class);
    	college.show();

    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	ctx.getBean(College.class).show();

    	
        System.out.println( "Hello World!" );
    }
}
