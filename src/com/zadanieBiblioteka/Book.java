package com.zadanieBiblioteka;

public final class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "title= " + title + '\n' +
                "author= " + author + '\n' +
                "isBorrowed= " + isBorrowed;
    }
}
