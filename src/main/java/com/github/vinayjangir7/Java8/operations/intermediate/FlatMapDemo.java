package com.github.vinayjangir7.Java8.operations.intermediate;
/*
 * This code snippet intends to show you the importance and
 * usage of flatMap
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static List<String> uniqueCharacters(List<String> words) {
		return words.stream()
				.map(word -> word.split(""))
				.flatMap(Arrays::stream)
				.distinct().collect(Collectors.toList());
	}


	public static void main(String... args) {
		List<String> op = uniqueCharacters(Arrays.asList("Hello", "World"));
		for (String i : op) {
			System.out.println(i);
		}
	}
}
