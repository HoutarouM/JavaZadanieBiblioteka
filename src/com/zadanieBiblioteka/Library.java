package com.zadanieBiblioteka;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public final class Library {
    private static Library library = new Library();

    private ArrayList<Reader> readers = new ArrayList<>();
    private ArrayList<Librarian> librarians = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {
    }

    public static Library getLibrary() {
        return library;
    }

    public void addLibrarian(String name, String lastname) {
        String pattern = "dd.MM.yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String dateOfEmployment = simpleDateFormat.format(new Date());

        Librarian l = new Librarian(name, lastname, dateOfEmployment);

        if (librarians.contains(l)) {
            System.out.println("Bibliotekarz juz pracuje");

            return;
        }

        librarians.add(l);
    }

    public void addLibrarian(String name, String lastname, String dateOfBirth) {
        String pattern = "dd.MM.yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());

        Librarian l = new Librarian(name, lastname, dateOfBirth, date);

        if (librarians.contains(l)) {
            System.out.println("Bibliotekarz juz pracuje");

            return;
        }

        librarians.add(l);
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }

    public void addNewReader(String name, String lastname) {
        Reader r = new Reader(name, lastname);

        if (readers.contains(r)) {
            System.out.println("Czytelnik juz dodany");

            return;
        }

        readers.add(r);
    }

    public void addNewReader(String name, String lastname, String dateOfBirth) {
        Reader r = new Reader(name, lastname, dateOfBirth);

        if (readers.contains(r)) {
            System.out.println("Czytelnik juz dodany");

            return;
        }

        readers.add(r);
    }

    public int howManyBooksBorrowedReader(int readerId) {
        for (Reader r : readers) {
            if (r.getReaderId() == readerId) {
                return r.getBorrowedBooks().size();
            }
        }

        return 0;
    }

    public ArrayList<Librarian> getLibrarians() {
        return librarians;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(String title, String author) {
        Book b = new Book(title, author);

        if (books.contains(b)) {
            System.out.println("Podana ksiazka juz jest");

            return;
        }

        books.add(b);
    }

    public void borrowBook(Reader reader, String title) {
        for (Book book : books) {
            if (book.getTitle() == title) {
                if (!isBookAvailable(book)) {
                    book.setBorrowed(true);

                    reader.addBookToBorrowed(book);
                } else {
                    System.out.println("Ksiazka juz wypozyczona");
                }
            } else {
                System.out.println("Nie posiadamy podanej ksiazki");
            }
        }
    }

    public boolean isBookAvailable(Book book) {
        if (books.contains(book)) {
            return book.isBorrowed();
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "readers= " + readers + '\n' +
                "librarians= " + librarians + '\n' +
                "books= " + books;
    }
}
