package com.github.vinayjangir7.Java8.functional_interfaces;
/*
 * This code snippet gives you the example of
 * Constructor reference. Here we reused the code for
 * Supplier functional interface
 */

import com.github.vinayjangir7.Java8.models.CustomConstructorInterface;
import com.github.vinayjangir7.Java8.models.FourDObject;

public class ConstructorReferenceDemo2 {

	static void createNewObj(CustomConstructorInterface cc) {
		FourDObject fd = cc.apply(10, 10, 10, 10);

	}

	public static void main(String[] args) {
		createNewObj(FourDObject::new);
	}
}

