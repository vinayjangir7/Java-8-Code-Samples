package com.edureka.module3.java8;
/*
 * This code snippet gives you the example for skip
 * Skip is a streaming intermediate operation
 * which skips first specified number of elements of a stream
 */
import java.util.List;
import java.util.stream.Collectors;

public class SkipDemo {
	
	public static List<Book> filterAdultFiction(List<Book> books, int topN) {
		return books.stream().filter(b -> "adult fiction".equalsIgnoreCase(b.getGenre())).skip(topN).collect(Collectors.toList());	
	}

	public static void main(String ... args){
		System.out.println(filterAdultFiction(Book.menu, 2));
	}
}
