package com.edureka.module2.java8;
/*
 * This code snippet gives you the idea
 * of using method references. Method references shorten the code
 * to a great extent
 * Here we re-used the unary operator demo code for method reference
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class MethodReferenceDemo {

	private static List<Integer> unaryDemo(UnaryOperator<Integer> unaryOpt,
			List<Integer> list) {
		List<Integer> uniList = new ArrayList<>();
		list.forEach(i -> uniList.add(unaryOpt.apply(i)));
		return uniList;
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		unaryDemo(i -> i * 10, list).forEach( System.out::println);
	}

}
