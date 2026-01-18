package com.simpleInterest.calculation;

import java.math.BigDecimal;

public class simpleInterestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");

		BigDecimal totalValue = calculator.calculateTotalValue(5);

		System.out.println(totalValue);
	}

}
