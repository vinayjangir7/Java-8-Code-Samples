package com.edureka.module1.java8;

/**
 * Created by VISHAL KUMAR on 8/17/15.
 */
import java.util.*;
public class FirstTake {

    public static List<Ball> filterGreenBalls(List<Ball> inventory){
        List<Ball> result = new ArrayList<>();
        for (Ball Ball: inventory){
            if ("green".equals(Ball.getColor())) {
                result.add(Ball);
            }
        }
        return result;
    }



    public static void main(String ... args){

        List<Ball> inventory = Arrays.asList(new Ball(80,"blue"),
                new Ball(155, "green"),
                new Ball(120, "red"));

        List<Ball> op = filterGreenBalls(inventory);
        System.out.println(op);
    }
}
