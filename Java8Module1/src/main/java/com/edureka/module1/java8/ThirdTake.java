package com.edureka.module1.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by VISHAL KUMAR on 8/17/15.
 */
public class ThirdTake {

    public static List<Ball> filterBalls(List<Ball> balls, String color, int weight, boolean flg){
        List<Ball> result = new ArrayList<>();
        for(Ball ball: balls){
            if((flg && ball.getColor().equals(color)) || (!flg && ball.getWeight() >= weight))
            {
                result.add(ball);
            }
        }
        return result;
    }


    public static void main(String ... args){

        List<Ball> inventory = Arrays.asList(new Ball(80, "blue"),
                new Ball(155, "green"),
                new Ball(90, "red"),
                new Ball(110, "red"),
                new Ball(135, "blue"),
                new Ball(175, "blue"),
                new Ball(120, "red"));

        List<Ball> op1 = filterBalls(inventory, "blue", 125, true);

        List<Ball> op2 = filterBalls(inventory, "red", 125, true);

        System.out.println(op1);
        System.out.println(op2);

    }
}