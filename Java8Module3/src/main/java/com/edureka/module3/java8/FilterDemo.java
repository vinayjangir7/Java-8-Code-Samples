package com.edureka.module3.java8;
/*
 * This code snippet gives you the example for filter
 * Filter is a streaming intermediate operation
 * and a higher order function in functional programming world
 */
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	
	public static List<Book> filterAdultFiction(List<Book> books) {
		return books.stream().filter(b -> "adult fiction".equalsIgnoreCase(b.getGenre())).collect(Collectors.toList());
		
	}

	public static void main(String ... args){
		System.out.println(filterAdultFiction(Book.menu));
	}
}
