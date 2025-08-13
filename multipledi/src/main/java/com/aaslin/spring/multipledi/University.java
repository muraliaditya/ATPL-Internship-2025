package com.aaslin.spring.multipledi;
public class University {
    private Faculty faculty;  
    private Library library;  

    public University(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public void showDetails() {
        System.out.println(" University Details ");
        faculty.display();
        library.display();
    }
}
