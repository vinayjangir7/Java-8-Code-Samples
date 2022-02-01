package com.edureka.module1.java8;

import java.util.Arrays;
import java.util.List;

public class FindPlanetImperative {

	public static void findPlanetImperative(final List<String> planets) {

		boolean present = false;
		for (String planet : planets) {
			if (planet.equalsIgnoreCase("earthclone")) {
				present = true;
				System.out.println("Yey..! Found another mother earth!");
				break;
			}
		}

		if (!present)
			System.out.println("We are the lonely ones!");

	}

	public static void main(String... args) {

		 List<String> candidates = Arrays.asList("mars", "jupiter",
		 "earthclone", "saturn", "pluto", "venus");
		//List<String> candidates = Arrays.asList("mars", "jupiter", "earth");
		findPlanetImperative(candidates);

	}

}