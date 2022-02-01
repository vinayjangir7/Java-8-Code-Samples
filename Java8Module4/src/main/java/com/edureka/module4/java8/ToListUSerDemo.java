package com.edureka.module4.java8;

import java.util.List;

public class ToListUSerDemo {
	
	
	public static void main(String ... args){
		
		List<String> bookTitlesList = Book.menu.stream().map(Book::getTitle).collect(new ToListCollector<String>());
		bookTitlesList.forEach(System.out::println);
		
	}
}
