package com.edureka.module2.java8;
/*
 * UnaryOpertor functional interface takes
 * an object as input and returns the same object type as output
 * It has apply as method, here we are passing the functionality of
 * multiplying by 10 as behavior to apply method 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	private static List<Integer> unaryDemo(UnaryOperator<Integer> unaryOpt,
			List<Integer> list) {
		List<Integer> uniList = new ArrayList<>();
		list.forEach(i -> uniList.add(unaryOpt.apply(i)));
		return uniList;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		unaryDemo(i -> i * 10, list).forEach(x -> System.out.println(x));
	}
	


}
