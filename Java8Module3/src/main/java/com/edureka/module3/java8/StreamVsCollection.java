package com.edureka.module3.java8;
/*
 * This example gives you the idea of Creating of Stream from a collection
 * Also this example shows you the usage of foreEach
 * It also shows similarity with collections in terms of iteration
 */
import java.util.*;
import java.util.stream.*;


public class StreamVsCollection {

    public static void main(String...args){
        List<String> names = Arrays.asList("Edureka", "Java 8", "New ", "Features Class");
        Stream<String> s = names.stream();
        s.forEach(System.out::println);
        // uncommenting this line will result in an IllegalStateException
        // because streams can be consumed only once
        //s.forEach(System.out::println);
    }
}
