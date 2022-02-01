package com.edureka.module3.java8;
/*
 * This code snippet gives you the example for forEach
 * ForEach is a streaming terminal operation
 * which takes elements of a stream and performs AN action
 * Result is NOT a stream
 */

import java.util.List;

public class ForEachDemo {
	
	public static void filterAdultFiction(List<Book> books) {
		books.stream().filter(b -> "adult fiction".equalsIgnoreCase(b.getGenre())).forEach(System.out::println);	
	}

	public static void main(String ... args){
	filterAdultFiction(Book.menu);
	}
}
