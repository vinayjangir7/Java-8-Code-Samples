package com.github.vinayjangir7.Java8.collectors;

import com.github.vinayjangir7.Java8.models.Book;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.function.BinaryOperator;

import static java.util.stream.Collectors.*;

public class SummarizingDemo {

    public static void main(String... args) {
        System.out.println("Nr. of books: " + howManyBooks());
        System.out.println("The most costliest book is: " + findCostliestBook());
        System.out.println("The most costliest book is: " + findCostliestBookUsingComparator());
        System.out.println("Total price of Catalog: " + calculateTotalPrice());
        System.out.println("Average price of Catalog: " + calculateAveragePrice());
        System.out.println("Catalog statistics: " + calculateCatalogStatistics());
        System.out.println("Short catalog: " + getShortCatalog());
        System.out.println("Short catalog comma separated: " + getShortCatalogCommaSeparated());
    }


    private static long howManyBooks() {
        return Book.menu.stream().collect(counting());
    }

    private static Book findCostliestBook() {
        return Book.menu.stream()
                .collect(reducing((d1, d2) -> d1.getPrice() > d2.getPrice() ? d1 : d2))
                .get();
    }

    private static Book findCostliestBookUsingComparator() {
        Comparator<Book> bookPriceComparator = Comparator.comparingInt(Book::getPrice);
        BinaryOperator<Book> morePriceOf = BinaryOperator.maxBy(bookPriceComparator);
        return Book.menu.stream()
                .collect(reducing(morePriceOf))
                .get();
    }

    private static int calculateTotalPrice() {
        return Book.menu.stream()
                .collect(summingInt(Book::getPrice));
    }

    private static Double calculateAveragePrice() {
        return Book.menu.stream()
                .collect(averagingInt(Book::getPrice));
    }

    private static IntSummaryStatistics calculateCatalogStatistics() {
        return Book.menu.stream().collect(summarizingInt(Book::getPrice));
    }

    private static String getShortCatalog() {
        return Book.menu.stream()
                .map(Book::getTitle)
                .collect(joining());
    }

    private static String getShortCatalogCommaSeparated() {
        return Book.menu.stream()
                .map(Book::getTitle)
                .collect(joining(", "));
    }
}

