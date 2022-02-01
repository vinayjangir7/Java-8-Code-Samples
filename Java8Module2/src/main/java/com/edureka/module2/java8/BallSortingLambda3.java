package com.edureka.module2.java8;

/*
 * This is the third way of using your custom comparator,
 * Here we avoided any comparator object creation and
 * instead relied on out lambda. Please note that how easy it is now
 * as we removed a lot of boiler plate code
 */

import java.util.*;

public class BallSortingLambda3 {

    public static void main(String...args){

        List<Ball> inventory = new ArrayList<>();
        inventory.addAll(Arrays.asList(new Ball(80,"green"), new Ball(155, "green"), new Ball(120, "red")));

       
        inventory.add(1, new Ball(30, "green"));
        inventory.add(1, new Ball(20, "red"));
        
        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(inventory);              
    }

    
}

