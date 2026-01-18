package com.conditionandif.examples;

import java.util.Scanner;

public class calculationMenuRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int number1 = scanner.nextInt();

		System.out.println("Enter number2: ");
		int number2 = scanner.nextInt();

		System.out.println("Available Options: ");
		System.out.println("1: Addition ");
		System.out.println("2: Subtract");
		System.out.println("3: Division");
		System.out.println("4: Multiplication");

		System.out.println("Enter your choice: ");
		int choice = scanner.nextInt();

		System.out.println("Your choices are:");
		System.out.println("Number1: " + number1);
		System.out.println("Number2: " + number2);
		System.out.println("Choice:  " + choice);

		// performOperation(number1, number2, choice);
		performOperationWithSwitch(number1, number2, choice);
	}

	/*
	 * private static void performOperation(int number1, int number2, int choice) {
	 * if (choice == 1) { System.out.println("Result is: " + (number1 + number2)); }
	 * else if (choice == 2) { System.out.println("Result is: " + (number1 -
	 * number2)); } else if (choice == 3) { System.out.println("Result is: " +
	 * (number1 / number2)); } else if (choice == 4) {
	 * System.out.println("Result is: " + (number1 * number2)); } else if (choice >
	 * 4) { System.out.println("You Select invalid option"); } else {
	 * System.out.println("Not Calculate"); } }
	 */

	private static void performOperationWithSwitch(int number1, int number2, int choice) {

		switch (choice) {
		case 1:
			System.out.println("Result is: " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result is: " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result is: " + (number1 / number2));
			break;
		case 4:
			System.out.println("Result is: " + (number1 * number2));
			break;
		default:
			System.out.println("You Select invalid option");
		}
	}

}
