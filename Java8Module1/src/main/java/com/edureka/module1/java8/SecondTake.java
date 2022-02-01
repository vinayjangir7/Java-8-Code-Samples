package com.edureka.module1.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by VISHAL KUMAR on 8/17/15.
 */
public class SecondTake {


    public static List<Ball> filterBallsByColor(List<Ball> inventory, String color){
        List<Ball> result = new ArrayList<>();
        for(Ball Ball: inventory){
            if(Ball.getColor().equals(color)){
                result.add(Ball);
            }
        }
        return result;
    }

    public static void main(String ... args){

        List<Ball> inventory = Arrays.asList(new Ball(80, "blue"),
                new Ball(155, "green"),
                new Ball(120, "red"));

        List<Ball> op1 = filterBallsByColor(inventory, "blue");
        List<Ball> op2 = filterBallsByColor(inventory, "red");

        System.out.println(op1);
        System.out.println(op2);

    }
}

