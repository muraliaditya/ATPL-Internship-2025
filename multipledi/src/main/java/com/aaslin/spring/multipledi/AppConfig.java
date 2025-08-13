package com.aaslin.spring.multipledi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Faculty faculty() {
        return new Faculty("Dr. Smith", "Computer Science");
    }

    @Bean
    public Library library() {
        Library lib = new Library();
        lib.setLibraryName("Central Library");
        return lib;
    }

    @Bean
    public University university() {
        University uni = new University(faculty()); 
        uni.setLibrary(library());                
        return uni;
    }
}
