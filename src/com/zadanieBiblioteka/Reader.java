package com.zadanieBiblioteka;

import java.util.ArrayList;

public final class Reader extends Person {
    private static int countOfReaders;
    private int readerId;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Reader(String name, String lastname) {
        super(name, lastname);

        countOfReaders++;
        this.readerId = countOfReaders;
    }

    public Reader(String name, String lastname, String dateOfBirth) {
        super(name, lastname, dateOfBirth);

        countOfReaders++;
        this.readerId = countOfReaders;
    }

    public int getReaderId() {
        return readerId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBookToBorrowed(Book book) {
        this.borrowedBooks.add(book);
    }

    @Override
    public String toString() {
        return "readerId=" + readerId + '\n' +
                "name=" + this.getName() + '\n' +
                "lastname=" + this.getLastname() + '\n' +
                "date of birth=" + this.getDateOfBirth() + '\n' +
                "borrowedBooks=" + borrowedBooks;
    }
}
