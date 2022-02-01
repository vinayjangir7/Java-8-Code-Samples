package com.github.vinayjangir7.Java8.operations.intermediate;
/*
 * This code snippet gives you the example for limit
 * Limit is a streaming intermediate operation
 * which cuts a stream to a specified number of elements
 */

import com.github.vinayjangir7.Java8.models.Book;

import java.util.List;
import java.util.stream.Collectors;

public class LimitDemo {

	public static List<Book> filterAdultFiction(List<Book> books, int topN) {
		return books.stream().filter(b -> "adult fiction".equalsIgnoreCase(b.getGenre())).limit(topN).collect(Collectors.toList());
	}

	public static void main(String ... args){
		System.out.println(filterAdultFiction(Book.menu, 3));
	}
}
