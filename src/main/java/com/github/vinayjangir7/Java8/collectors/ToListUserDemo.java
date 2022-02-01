package com.github.vinayjangir7.Java8.collectors;

import com.github.vinayjangir7.Java8.models.Book;

import java.util.List;

public class ToListUserDemo {


    public static void main(String... args) {

        List<String> bookTitlesList = Book.menu.stream()
                .map(Book::getTitle)
                .collect(new ToListCollector<>());
        bookTitlesList.forEach(System.out::println);

    }
}
