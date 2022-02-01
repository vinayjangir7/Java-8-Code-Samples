package com.edureka.module3.java8;
/*
 * This code snippet intends to show you the importance and
 * usage of flatMap
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueChars2 {

	public static List<String> uniqueCharacters(List<String> words){
		return words.stream().map(word -> word.split("")) .flatMap(Arrays::stream)
.distinct().collect(Collectors.toList()); 
	}
	
	
	public static void main(String ... args){
		List<String> op = uniqueCharacters(Arrays.asList("Hello", "World"));		
		for (String i:op){	
				System.out.println(i);
		}
	}
}
