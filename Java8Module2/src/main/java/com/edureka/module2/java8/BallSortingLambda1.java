package com.edureka.module2.java8;
/*
 * This is the first way of using your custom comparator,
 * where you just pass on the comparator class object to the sort method
 * and compare method is automatically called for sorting
 */
import java.util.*;

public class BallSortingLambda1 {

    public static void main(String...args){

        List<Ball> inventory = new ArrayList<>();
        inventory.addAll(Arrays.asList(new Ball(80,"green"), new Ball(155, "green"), new Ball(120, "red")));

        inventory.sort(new BallComparator());
        System.out.println(inventory);
    }

    
}

