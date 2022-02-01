package com.edureka.module2.java8;

/*
 * This is the second way of using your custom comparator,
 * Here we just created a comparator object in-line
 * at time of sort call and provided the implementation there itself
 */

import java.util.*;

public class BallSortingLambda2 {

	public static void main(String... args) {

		List<Ball> inventory = new ArrayList<>();

		inventory.addAll(Arrays.asList(new Ball(80, "green"), new Ball(155,
				"green"), new Ball(120, "red")));

		inventory.add(1, new Ball(30, "green"));

		inventory.sort(new Comparator<Ball>() {
			public int compare(Ball a1, Ball a2) {
				return a1.getWeight().compareTo(a2.getWeight());
			}
		});
		System.out.println(inventory);

	}

}
