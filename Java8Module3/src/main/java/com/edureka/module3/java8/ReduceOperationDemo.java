package com.edureka.module3.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceOperationDemo{

    public static void main(String...args){

        List<Integer> numbers = Arrays.asList(3,4,5,1,2);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        int sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum2);

        int max = numbers.stream().reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println(max);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        min.ifPresent(System.out::println);

        int totalPrice = Book.menu.stream()
                           .map(Book::getPrice)
                           .reduce(0, Integer::sum);
        double tot = Book.menu.stream().mapToDouble(Book::getPrice).sum();
        
        System.out.println("Total price of your catalog:" + totalPrice);
        System.out.println("Total price of your catalog:" + tot);
        
    }
}
