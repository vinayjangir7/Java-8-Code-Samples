package com.edureka.module2.java8;

import java.util.Comparator;
/*
 * This class is the comparator class used to sort
 * the balls based on their weight
 */

public class BallComparator implements Comparator<Ball> {
    public int compare(Ball a1, Ball a2){
        return a1.getWeight().compareTo(a2.getWeight());
    }
}
