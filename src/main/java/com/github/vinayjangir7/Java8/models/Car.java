package com.github.vinayjangir7.Java8.models;

import java.util.Optional;

public class Car {

    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }

	public void setInsurance(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}
}
