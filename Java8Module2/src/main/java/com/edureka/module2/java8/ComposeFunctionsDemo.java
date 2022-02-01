package com.edureka.module2.java8;

/*
 * This code snippet gives you the example of
 * composing Functions
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ComposeFunctionsDemo {
	
	public static <V, R> List<R> transform(List<V> list, Function<V, R> f) {
	    List<R> result = new ArrayList<R>();
	        for(V j: list){ 
	             result.add (f.apply(j));
	        } 
	    return result;
	} 


	public static void main(String... args) {

		Function<String, String> toUp = (String s) -> s.toUpperCase();
		Function<String, Integer> findLength = (String s) -> s.length();
		
		List<String> ups = transform (Arrays.asList("Vijay", "Vishal", "Vinay"), toUp);
		List<Integer> lst = transform (Arrays.asList("Vijay", "Vishal", "Vinay"), toUp.andThen(findLength));
		List<Integer> op = transform (Arrays.asList("Vijay", "Vishal", "Vinay"), findLength.compose(toUp));
		System.out.println(ups);
		System.out.println(lst);
		System.out.println(op);


	}

}

