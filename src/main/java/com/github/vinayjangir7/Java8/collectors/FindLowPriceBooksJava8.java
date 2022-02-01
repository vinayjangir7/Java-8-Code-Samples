package com.github.vinayjangir7.Java8.collectors;

import com.github.vinayjangir7.Java8.models.Book;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindLowPriceBooksJava8 {
    public static List<String> findLowPriceBooksJava8(List<Book> books) {
        return books.stream()
                .filter(d -> d.getPrice() < 400)
                .sorted(Comparator.comparing(Book::getPrice))
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public static void main(String... args) {
        System.out.println(findLowPriceBooksJava8(Book.menu));
    }
}