package com.github.vinayjangir7.Java8.collectors;

import com.github.vinayjangir7.Java8.models.Book;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class MultiLevelGroupingDemo {

    public static void main(String... args) {
        System.out.println("Books grouped by type: " + groupBooksByType());
        System.out.println("Books grouped by price level: " + groupBooksByPriceLevel());
        System.out.println("Books grouped by type and price level: " + groupBooksByTypeAndPriceLevel());
        System.out.println("Costliest books by type: " + costliestBooksByTypeWithoutOptionals());

    }

    ;

    private static Map<Book.BookType, List<Book>> groupBooksByType() {
        return Book.menu.stream().collect(groupingBy(Book::getType));
    }

    private static Map<PriceLevel, List<Book>> groupBooksByPriceLevel() {
        return Book.menu.stream().collect(
                groupingBy(book -> {
                    if (book.getPrice() <= 400) return PriceLevel.CHEAP;
                    else if (book.getPrice() <= 700) return PriceLevel.NORMAL;
                    else return PriceLevel.COSTLY;
                }));
    }

    private static Map<Book.BookType, Map<PriceLevel, List<Book>>> groupBooksByTypeAndPriceLevel() {
        return Book.menu.stream().collect(
                groupingBy(Book::getType,
                        groupingBy((Book book) -> {
                            if (book.getPrice() <= 400) return PriceLevel.CHEAP;
                            else if (book.getPrice() <= 700) return PriceLevel.NORMAL;
                            else return PriceLevel.COSTLY;
                        })
                )
        );
    }

    private static Map<Book.BookType, Object> costliestBooksByTypeWithoutOptionals() {
        return Book.menu.stream().collect(
                groupingBy(Book::getType,
                        collectingAndThen(
                                reducing((b1, b2) -> b1.getPrice() > b2.getPrice() ? b1 : b2),
                                Optional::get)));
    }


    enum PriceLevel {CHEAP, NORMAL, COSTLY}


}
