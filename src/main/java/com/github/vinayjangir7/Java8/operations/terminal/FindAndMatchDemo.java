package com.github.vinayjangir7.Java8.operations.terminal;

import com.github.vinayjangir7.Java8.models.Book;

import java.util.List;

public class FindAndMatchDemo {

    public static void findAnyBook(List<Book> catalog) {

        System.out.println(catalog.stream().findAny());

    }

    public static void findFirstBook(List<Book> catalog) {

        System.out.println(catalog.stream().findFirst());

    }

    public static void findAnyMatch(List<Book> catalog) {

        System.out.println(catalog.stream()
                .anyMatch(b -> "inferno".equalsIgnoreCase(b.getTitle())));

    }

    public static void findAllMatch(List<Book> catalog) {

        System.out.println(catalog.stream()
                .allMatch(b -> "inferno".equalsIgnoreCase(b.getTitle())));

    }

    public static void main(String... args) {

        findAnyBook(Book.menu);
        findFirstBook(Book.menu);
        findAnyMatch(Book.menu);
        findAllMatch(Book.menu);
    }
}
