package com.github.vinayjangir7.Java8.models;

public class Transaction {

	private final Currency currency;
	private final double value;

	public Transaction(Currency currency, double value) {
		this.currency = currency;
		this.value = value;
	}

	public Currency getCurrency() {
		return currency;
	}

	public double getValue() {
		return value;
	}

	@Override
	public String toString() {
		return currency + " " + value;
	}

	public enum Currency {
		EUR, USD, JPY, GBP, CHF
	}
}
