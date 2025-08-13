package com.aaslin.spring.beanscope;

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

         System.out.println("\n Singleton Scope Test ");
         SingletonBean singleton1 = context.getBean(SingletonBean.class);
         SingletonBean singleton2 = context.getBean(SingletonBean.class);
         System.out.println("Singleton Bean 1 hash: " + singleton1.hashCode());
         System.out.println("Singleton Bean 2 hash: " + singleton2.hashCode());

         System.out.println("\n Prototype Scope Test ");
         PrototypeBean prototype1 = context.getBean(PrototypeBean.class);
         PrototypeBean prototype2 = context.getBean(PrototypeBean.class);
         System.out.println("Prototype Bean 1 hash: " + prototype1.hashCode());
         System.out.println("Prototype Bean 2 hash: " + prototype2.hashCode());
        System.out.println( "Hello World!" );
    }
}
