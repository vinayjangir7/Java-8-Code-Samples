package com.edureka.module1.java8;

import java.util.Arrays;
import java.util.List;

public class FindPlanetDeclarative {

	public static void findPlanetImperative(final List<String> planets) {
		if (planets.contains("earthclone"))
			System.out.println("Yey..! Found another mother earth!");
		else
			System.out.println("We are the lonely ones!");
	}

	public static void main(String... args) {
		// List<String> candidates = Arrays.asList("mars", "jupiter",
		// "earthclone", "saturn", "pluto", "venus");
		List<String> candidates = Arrays.asList("mars", "jupiter", "earth");
		findPlanetImperative(candidates);

	}

}
