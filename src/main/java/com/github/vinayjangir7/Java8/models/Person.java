package com.github.vinayjangir7.Java8.models;

import java.util.Optional;

public class Person {

    private Optional<Car> car;

    public void setCar(Optional<Car> car) {
		this.car = car;
	}

	public Optional<Car> getCar() {
        return car;
    }
}