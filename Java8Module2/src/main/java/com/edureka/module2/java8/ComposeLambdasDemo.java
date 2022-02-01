package com.edureka.module2.java8;

/*
 * This is the fourth way of using your custom comparator,
 * where we are utilizing the inbuilt comparing method of
 * Comparator class by passing the attribute for sorting
 * We used method reference here. you'll learn about them later
 */

import java.util.*;
import static java.util.Comparator.comparing;

public class ComposeLambdasDemo {

    public static void main(String...args){

        List<Ball> inventory = new ArrayList<>();
        inventory.addAll(Arrays.asList(new Ball(80,"green"), new Ball(155, "green"), new Ball(120, "red")));

        inventory.add(1, new Ball(30, "green"));
        inventory.add(1, new Ball(20, "red"));        
        inventory.add(1, new Ball(10, "red"));     
        inventory.add(1, new Ball(10, "green"));
        inventory.add(1, new Ball(10, "blue"));
        // Here note that we have reversed the sorting using in built method
        //inventory.sort(comparing(Ball::getWeight).reversed());
        //inventory.sort(comparing(Ball::getWeight).reversed().thenComparing(Ball::getColor));
        //System.out.println(inventory);       
        inventory.sort(comparing(Ball::getWeight).thenComparing(Ball::getColor));
        System.out.println(inventory);   
    }

    
}

