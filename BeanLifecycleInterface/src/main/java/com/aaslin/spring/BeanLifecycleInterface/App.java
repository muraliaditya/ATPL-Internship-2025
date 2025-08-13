package com.aaslin.spring.BeanLifecycleInterface;

/**
 * Hello world!
 *
 */
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig {
    @Bean
    public TeacherInterface teacherInterface() {
        return new TeacherInterface();
    }
}

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        TeacherInterface teacher = context.getBean(TeacherInterface.class);
        teacher.teach();

        context.close();
    }
}
