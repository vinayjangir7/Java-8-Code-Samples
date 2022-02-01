package com.edureka.module1.java8;

import java.util.Arrays;
import java.util.List;

public class StockPriceDeclarative {
	
	public static Double multiplyStocks(List<Double> stockQuotes){
		return stockQuotes.stream().filter(price -> price.compareTo(Double.valueOf(23)) > 0).map(price -> price*(1 + Double.valueOf(0.10))).reduce(Double.valueOf(0),(a,b) -> a + b);
	}
	
	public static void main(String ... args){		
		final List<Double> stockList = Arrays.asList(
			    new Double(5), new Double(10), new Double(15),
			    new Double(20), new Double(25), new Double(30),
			    new Double(40), new Double(45));

		System.out.println("total new price of stocks is:- "+multiplyStocks(stockList));
		
	}
}

