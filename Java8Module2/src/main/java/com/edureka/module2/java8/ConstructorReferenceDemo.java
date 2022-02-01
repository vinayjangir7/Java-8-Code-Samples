package com.edureka.module2.java8;

import java.util.function.Supplier;

/*
 * This code snippet gives you the example of
 * Constructor reference. Here we reused the code for
 * Supplier functional interface
 */

public class ConstructorReferenceDemo {

	static void driveVehicle(Supplier<Vehicle> supplier) {
		Vehicle vehicle = supplier.get();
		vehicle.drive();
	}

	public static void main(String[] args) {
		driveVehicle(Vehicle::new);
	}
}

