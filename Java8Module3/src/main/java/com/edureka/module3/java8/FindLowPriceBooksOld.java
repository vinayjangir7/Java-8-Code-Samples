package com.edureka.module3.java8;

import java.util.ArrayList;
import java.util.List;

public class FindLowPriceBooksOld {

	public static List<String> findLowPriceBooksOld(List<Book> books) {
		List<String> lowPriceBooks = new ArrayList<String>();
		for (Book b : books) {
			if (b.getPrice() < 400) {
				lowPriceBooks.add(b.getTitle());
			}
		}		
		
		return lowPriceBooks;
	}

	public static void main(String... args) {

		System.out.println(findLowPriceBooksOld(Book.menu));
	}

}
