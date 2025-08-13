package com.aaslin.spring.AutowiringDemo;

import org.springframework.context.ApplicationContext;
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

        System.out.println("Field Injection");
        EmployeeFieldInjection empField = context.getBean(EmployeeFieldInjection.class);
        empField.showInfo();

        System.out.println("\nSetter Injection");
        EmployeeSetterInjection empSetter = context.getBean(EmployeeSetterInjection.class);
        empSetter.showInfo();

        System.out.println("\nConstructor Injection");
        EmployeeConstructorInjection empConstructor = context.getBean(EmployeeConstructorInjection.class);
        empConstructor.showInfo();

        ((ClassPathXmlApplicationContext) context).close();
        System.out.println( "Hello World!" );
    }
}
