package com.github.vinayjangir7.Java8.optional;

import com.github.vinayjangir7.Java8.models.Car;
import com.github.vinayjangir7.Java8.models.Insurance;
import com.github.vinayjangir7.Java8.models.Person;

import java.util.Optional;

public class OptionalDemo {

	public static String getCarInsuranceName(Optional<Person> person) {
		return person.flatMap(Person::getCar)
				.flatMap(Car::getInsurance)
				.map(Insurance::getName)
				.orElse("Unknown");
	}

	public static void main(String... args) {

		Insurance in = new Insurance();
		in.setName("Bank 1");
		Car car = new Car();
		car.setInsurance(Optional.of(in));
		Person p1 = new Person();
		p1.setCar(Optional.of(car));
		Person p2 = new Person();
		p2.setCar(Optional.empty());

		System.out.println(getCarInsuranceName(Optional.empty()));
		System.out.println(getCarInsuranceName(Optional.of(p1)));
		System.out.println(getCarInsuranceName(Optional.of(p2)));
   }
}
