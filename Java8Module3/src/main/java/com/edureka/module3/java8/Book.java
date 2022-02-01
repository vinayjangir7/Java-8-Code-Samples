package com.edureka.module3.java8;

/*
 * We will be using this entity for
 * almost every example for streams
 */

import java.util.*;

public class Book {

    private final String title;
    private final String genre;
	private final int price;
    private final Type type;

    public Book(String title, String genre, int price, Type type) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
		return genre;
	}

    public int getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }

    public enum Type { HARDBOUND, PAPERBACK, EBOOK }

    @Override
    public String toString() {
        return title + "\n";
    }

    public static final List<Book> menu =
            Arrays.asList( new Book("Inferno", "Adult Fiction", 550, Book.Type.HARDBOUND),
            			   new Book("Inferno", "Adult Fiction", 550, Book.Type.EBOOK),
                           new Book("Da Vinci Code", "Adult Fiction", 450, Book.Type.HARDBOUND),
                           new Book("The Grand Design", "Science and Technology", 855, Book.Type.HARDBOUND),
                           new Book("Predictable Irrational", "Behaviural Eceonomics", 335, Book.Type.PAPERBACK),
                           new Book("Stay Hungry Stay Foolish", "Adult Non Fiction", 245, Book.Type.PAPERBACK),
                           new Book("Gone With The Wind", "Adult Fiction", 345, Book.Type.PAPERBACK),
                           new Book("Kane and Abel", "Adult Fiction", 675, Book.Type.PAPERBACK),
                           new Book("Only Time Will Tell", "Adult Fiction", 425, Book.Type.EBOOK),
                           new Book("The Google Story", "Adult Non Fiction", 395, Book.Type.EBOOK));
}