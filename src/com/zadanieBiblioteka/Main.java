package com.zadanieBiblioteka;

public class Main {
    public static void main(String[] args) {
        Library library = Library.getLibrary();

        library.addLibrarian("Mark", "Dziubek");

        library.addNewReader("Marek", "Nowak");

        library.addBook("Ksiazka", "Autor");

        System.out.println(library);
    }
}