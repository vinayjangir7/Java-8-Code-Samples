package com.github.vinayjangir7.Java8.functional_interfaces;
/*
 * This code snippet gives you the example of
 * Consumer functional interface. Here we created
 * a method printEach which accepts the Consumer Interface object
 * and since it has only accept method, it's invoked by default for every call
 */

import com.github.vinayjangir7.Java8.models.Consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

	public static void printEach(List<Integer> list, Consumer<Integer> c) {
		for (Integer i : list) {
			c.accept(i);
		}
	}

	public static void main(String... args) {

		Consumer<Integer> printConsumer = (Integer i) -> System.out.println(i * 2);

		printEach(Arrays.asList(1, 3, 5, 7), printConsumer);

	}

}
