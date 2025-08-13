package com.aaslin.spring.myfirstproject;

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
//      ApplicationContext context=new ClassPathXmlApplicationContext("com/aaslin/spring/myfirstproject/beans.xml");
//        
//      Customer customer=(Customer)context.getBean("customer");
//        System.out.println(customer.getName());
//        System.out.println(customer.getId());
//        

    	
    	 ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
         
         Order order=(Order)context.getBean("order");
         System.out.println(order.getOrder_id());
         System.out.println(order.getOrder_name());
         System.out.println(order.getCustomer());
         
     
         
    }
}
