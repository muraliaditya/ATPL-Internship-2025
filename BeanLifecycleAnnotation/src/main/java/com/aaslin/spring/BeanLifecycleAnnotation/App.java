package com.aaslin.spring.BeanLifecycleAnnotation;

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

        TeacherAnno teacher = context.getBean(TeacherAnno.class);
        teacher.teach();

        context.close();
        System.out.println( "Hello World!" );
    }
}
