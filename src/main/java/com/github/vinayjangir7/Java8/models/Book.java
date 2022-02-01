package com.github.vinayjangir7.Java8.models;

/*
 * We will be using this entity for
 * almost every example for streams
 */

import java.util.Arrays;
import java.util.List;

public class Book {

    private final String title;
    private final String genre;
    public static final List<Book> menu =
            Arrays.asList(new Book("Inferno", "Adult Fiction", 550, BookType.HARDBOUND),
                    new Book("Inferno", "Adult Fiction", 550, BookType.EBOOK),
                    new Book("Da Vinci Code", "Adult Fiction", 450, BookType.HARDBOUND),
                    new Book("The Grand Design", "Science and Technology", 855, BookType.HARDBOUND),
                    new Book("Predictable Irrational", "Behaviural Eceonomics", 335, BookType.PAPERBACK),
                    new Book("Stay Hungry Stay Foolish", "Adult Non Fiction", 245, BookType.PAPERBACK),
                    new Book("Gone With The Wind", "Adult Fiction", 345, BookType.PAPERBACK),
                    new Book("Kane and Abel", "Adult Fiction", 675, BookType.PAPERBACK),
                    new Book("Only Time Will Tell", "Adult Fiction", 425, BookType.EBOOK),
                    new Book("The Google Story", "Adult Non Fiction", 395, BookType.EBOOK));
    private final int price;
    private final BookType bookType;

    public String getTitle() {
        return title;
    }

    public Book(String title, String genre, int price, BookType bookType) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.bookType = bookType;
    }

    public int getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public BookType getType() {
        return bookType;
    }

    @Override
    public String toString() {
        return title + "\n";
    }

    public enum BookType {HARDBOUND, PAPERBACK, EBOOK}
}