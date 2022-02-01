package com.edureka.module1.java8;

import java.util.Arrays;
import java.util.List;

public class StockPriceImprerative {
	
	public static Double multiplyStocks(List<Double> stockQuotes){
		
		Double totalFactoredPrices = Double.valueOf(0);

    	for(Double price : stockQuotes) {
      	  if(price.compareTo(Double.valueOf(23)) > 0) 
        	  totalFactoredPrices += price*(1+ Double.valueOf(0.10));
	}
	
    	return totalFactoredPrices;
		
	}

	
	public static void main(String ... args){
		
		final List<Double> stockList = Arrays.asList(
			    new Double(5), new Double(10), new Double(15),
			    new Double(20), new Double(25), new Double(30),
			    new Double(40), new Double(45));

		System.out.println("total new price of stocks is:- "+multiplyStocks(stockList));
		
	}
}
