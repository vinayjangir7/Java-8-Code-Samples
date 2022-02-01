package com.edureka.module3.java8;

import java.util.*;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class PartitioningDemo {

    public static void main(String ... args) {
        System.out.println("Books partitioned by price: " + partitionBooksByPrice());
        System.out.println("Cheap Books by type: " + cheapBooksByType());
        System.out.println("Costliest books by price: " + costliestPartitionedByPrice());
    }

    private static Map<Boolean, List<Book>> partitionBooksByPrice() {
        return Book.menu.stream().collect(partitioningBy(b -> b.getPrice() < 400));
    }

   private static Map<Boolean, Map<Book.Type, List<Book>>> cheapBooksByType() {
        return Book.menu.stream().collect(partitioningBy((b -> b.getPrice() < 400), groupingBy(Book::getType)));
    }

    private static Object costliestPartitionedByPrice() {
        return Book.menu.stream().collect(
                partitioningBy((b -> b.getPrice() < 400),
                        collectingAndThen(
                                maxBy(comparingInt(Book::getPrice)),
                                Optional::get)));
    }
}