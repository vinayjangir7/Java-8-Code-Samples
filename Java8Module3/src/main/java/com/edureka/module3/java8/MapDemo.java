package com.edureka.module3.java8;

/*
 * This code snippet gives you the example for map
 * Map is a streaming intermediate operation
 * which performs a given transformation to each element of a stream and
 * creates a new stream
 */

import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static List<String> mapDemo(List<Book> books){
		
		return books.stream().map(b -> b.getTitle().toUpperCase()).collect(Collectors.toList());
		
	}
	
	
	public static void main(String ... args){
		System.out.println(mapDemo(Book.menu));
	}
}
