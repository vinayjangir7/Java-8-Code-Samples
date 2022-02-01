package com.edureka.module4.java8;

import java.util.*;

public class Car {

    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }

	public void setInsurance(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}
}
