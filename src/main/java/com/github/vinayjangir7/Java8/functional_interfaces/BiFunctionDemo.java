package com.github.vinayjangir7.Java8.functional_interfaces;

/*
 * BiFunction functional interface takes
 * a function and applies it to both the arguments
 * It has apply as method, here we are passing the functionality of
 * multiplying both arguments as behavior to apply method 
 */

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static String calc(BiFunction<Integer, Integer, String> bi,
			Integer x, Integer y) {
		return bi.apply(x, y);
	}

	public static void main(String[] args) {
		String result = calc((a, b) -> ": " + (a * b), 3, 5);

		System.out.println(result);

	}

}
