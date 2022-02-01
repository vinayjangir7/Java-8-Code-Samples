package com.edureka.module2.java8;

/*
 * BinaryOpertor functional interface takes
 * two objects of same type as input and returns the same object type as output
 * It has apply as method, here we are passing the functionality of
 * multiplying by 10 as behavior to apply method 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	private static List<String> binaryOpDemo(BinaryOperator<String> binaryOpt,
			Map<String, String> map) {
		List<String> biList = new ArrayList<>();
		map.forEach((s1, s2) -> biList.add(binaryOpt.apply(s1, s2)));
		return biList;
	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("X", "A");
		map.put("Y", "B");
		map.put("Z", "C");
		binaryOpDemo((s1, s2) -> s1 + "-" + s2, map).forEach(
				x -> System.out.println(x));
	}

}
