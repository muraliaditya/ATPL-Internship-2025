package com.aaslin.spring.valuedemo;

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
    	
    	ApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);

        ServerConfig config = context.getBean(ServerConfig.class);
        config.printConfig();
        System.out.println( "Hello World!" );
    }
}
