package com.java.oops;

public class BooksRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books artOfComputerProgramming = new Books();
		Books cleanCode = new Books();
		Books effectiveJava = new Books();

		artOfComputerProgramming.read();
		cleanCode.read();
		effectiveJava.read();

		artOfComputerProgramming.setNoOfCopies(20);
		System.out.println(artOfComputerProgramming.getnoOfCopies());

		cleanCode.setNoOfCopies(50);
		System.out.println(cleanCode.getnoOfCopies());

		effectiveJava.setNoOfCopies(30);
		System.out.println(effectiveJava.getnoOfCopies());

	}

}
