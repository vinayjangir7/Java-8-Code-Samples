package com.edureka.module1.java8;
/*
 * This is just an introductory Java 8 program
 * It should act as your first taste of few new features as:-
 * Passing methods as arguments and use of Predicate
 */
import java.util.*;
import java.util.function.Predicate;

public class FindBalls{

    public static void main(String ... args){

        List<Ball> inventory = Arrays.asList(new Ball(80,"green"),
                                              new Ball(155, "green"),
                                              new Ball(120, "red"));	


        List<Ball> greenBalls = filterBalls(inventory, FindBalls::isGreenBall);
        System.out.println(greenBalls);

        List<Ball> heavyBalls = filterBalls(inventory, FindBalls::isHeavyBall);
        System.out.println(heavyBalls);
        
        List<Ball> greenBalls2 = filterBalls(inventory, (Ball a) -> "green".equals(a.getColor()));
        System.out.println(greenBalls2);
        
        List<Ball> heavyBalls2 = filterBalls(inventory, (Ball a) -> a.getWeight() > 150);
        System.out.println(heavyBalls2);
        
        List<Ball> weirdBalls = filterBalls(inventory, (Ball a) -> a.getWeight() < 80 || 
                                                                       "brown".equals(a.getColor()));
        System.out.println(weirdBalls);
    }

    public static List<Ball> filterGreenBalls(List<Ball> inventory){
        List<Ball> result = new ArrayList<>();
        for (Ball ball: inventory){
            if ("green".equals(ball.getColor())) {
                result.add(ball);
            }
        }
        return result;
    }

    public static List<Ball> filterHeavyBalls(List<Ball> inventory){
        List<Ball> result = new ArrayList<>();
        for (Ball ball: inventory){
            if (ball.getWeight() > 150) {
                result.add(ball);
            }
        }
        return result;
    }

    public static boolean isGreenBall(Ball ball) {
        return "green".equals(ball.getColor()); 
    }

    public static boolean isHeavyBall(Ball ball) {
        return ball.getWeight() > 150;
    }

    public static List<Ball> filterBalls(List<Ball> inventory, Predicate<Ball> p){
        List<Ball> result = new ArrayList<>();
        for(Ball ball : inventory){
            if(p.test(ball)){
                result.add(ball);
            }
        }
        return result;
    }       

    public static class Ball {
        private int weight = 0;
        private String color = "";

        public Ball(int weight, String color){
            this.weight = weight;
            this.color = color;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            return "Ball{" +
                   "color='" + color + '\'' +
                   ", weight=" + weight +
                   '}';
        }
    }

}

