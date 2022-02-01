package com.edureka.module1.java8;

/**
 * Created by VISHAL KUMAR on 8/17/15.
 */

public class Ball {
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