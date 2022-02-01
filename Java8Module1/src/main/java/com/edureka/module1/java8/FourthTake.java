package com.edureka.module1.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by VISHAL KUMAR on 8/17/15.
 */
public class FourthTake {

    public static List<Ball> filter(List<Ball> inventory, BallPredicate p){
        List<Ball> result = new ArrayList<>();
        for(Ball ball : inventory){
            if(p.test(ball)){
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
        RedBallPredicate rbp = new RedBallPredicate();
        HeavyBallPredicate hbp = new HeavyBallPredicate();
        RedLightBallPredicate rlbp = new RedLightBallPredicate();

        List<Ball> op1 = filter(inventory, rbp);
        List<Ball> op2 = filter(inventory, hbp);
        List<Ball> op3 = filter(inventory, rlbp);

        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);


    }
}
