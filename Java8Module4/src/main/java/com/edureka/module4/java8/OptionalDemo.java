package com.edureka.module4.java8;

import java.util.*;

public class OptionalDemo {

    public static String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCar)
                     .flatMap(Car::getInsurance)
                     .map(Insurance::getName)
                     .orElse("Unknown");
    }
    
   public static void main(String ... args){
	   
	   Insurance in = new Insurance();
	   in.setName("ICICI Lombard");
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
