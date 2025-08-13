package com.aaslin.spring.ConstructorInjectionXML;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Faculty faculty = context.getBean("faculty", Faculty.class);
        faculty.displayInfo();

        context.close();
        System.out.println( "Hello World!" );
    }
}
 