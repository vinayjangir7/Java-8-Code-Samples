package com.edureka.module2.java8;

import java.util.function.Supplier;

/*
 * This code snippet gives you the example of
 * Supplier functional interface. Here we created
 * a method driveVehicle which accepts the Supplier Interface object
 * and since it has only get method, it's invoked by default for every call
 * Remember Supplier is typically used to create new objects in any specific manner
 */

public class SupplierDemo {

	static void driveVehicle(Supplier<? extends Vehicle> supplier) {
		Vehicle vehicle = supplier.get();
		vehicle.drive();
	}

	public static void main(String[] args) {
		driveVehicle(() -> new Vehicle());
	}

}
