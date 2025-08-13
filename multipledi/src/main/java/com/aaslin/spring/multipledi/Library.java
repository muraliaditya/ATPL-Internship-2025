package com.aaslin.spring.multipledi;

public class Library {
    private String libraryName;

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void display() {
        System.out.println("Library Name: " + libraryName);
    }
}
