package com.edureka.module1.java8;

/**
 * Created by VISHAL KUMAR on 8/17/15.
 */

public class RedLightBallPredicate implements BallPredicate{
    public boolean test(Ball ball){
        return "red".equals(ball.getColor()) && ball.getWeight() < 100;
    }
}
