package com.edureka.module2.java8;

/*
 * This code snippet gives you the example of
 * Functional functional interface. Here we created
 * a method transform which accepts the Function Interface object
 * and since it has only apply method, it's invoked by default for every call
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionDemo {
	
	public static <V, R> List<R> transform(List<V> list, Function<V, R> f) {
	    List<R> result = new ArrayList<R>();
	        for(V j: list){ 
	             result.add (f.apply(j));
	        } 
	    return result;
	} 


	public static void main(String... args) {

		Function<String, Integer> findLength = (String s) -> s.length();

		List<Integer> lst = transform (Arrays.asList("Vijay", "Vishal", "Vinay"), findLength);
		System.out.println(lst);


	}

}

