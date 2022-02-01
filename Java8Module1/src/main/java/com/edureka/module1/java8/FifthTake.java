package com.edureka.module1.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by VISHAL KUMAR on 8/17/15.
 */
public class FifthTake {

    public static <T> List <T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<T>();
        for(T i :list){
            if(p.test(i)){
                result.add(i);
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
        
        List<Ball> redBalls = filter(inventory, (Ball ball) -> "red".equals(ball.getColor()));
        System.out.println(redBalls);


    }
}
