package com.github.vinayjangir7.Java8.operations.intermediate;
/*
 * This code snippet gives you the example for sorted
 * Sorted is a streaming intermediate operation
 * and a higher order function in functional programming world
 * which takes a parameter for the basis of sorting
 */

import com.github.vinayjangir7.Java8.models.Book;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDemo {

    public static List<Book> filterAdultFiction(List<Book> books) {
        return books.stream()
                .filter(b -> "adult fiction".equalsIgnoreCase(b.getGenre()))
                .sorted(Comparator.comparingInt(Book::getPrice))
                .collect(Collectors.toList());

    }

    public static void main(String... args) {
        System.out.println(filterAdultFiction(Book.menu));
    }
}
