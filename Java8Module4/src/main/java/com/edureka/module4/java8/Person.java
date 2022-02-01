package com.edureka.module4.java8;

import java.util.*;

public class Person {

    private Optional<Car> car;

    public void setCar(Optional<Car> car) {
		this.car = car;
	}

	public Optional<Car> getCar() {
        return car;
    }
}