package com.edureka.module2.java8;
/*
 * This code snippet gives you the example of
 * Constructor reference. Here we reused the code for
 * Supplier functional interface
 */

public class ConstructorReferenceDemo2 {

	static void createNewObj(CustomConstructorInterface cc) {
		FourDObject fd = cc.apply(10, 10, 10, 10);
		
	}

	public static void main(String[] args) {
		createNewObj(FourDObject::new);
	}
}

