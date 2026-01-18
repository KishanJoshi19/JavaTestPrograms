package com.java.oops;

public class Books {

	// state
	private int noOfCopies; // member variable

	// behavior
	// method
	// input - int speed
	// output - right now void value
	// name - setbook

	public void setNoOfCopies(int noOfCopies) { // local variable

		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
			// System.out.println(noOfCopies);
			// System.out.println(this.noOfCopies);
		}
	}

	public void increaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}

	int getnoOfCopies() {
		return this.noOfCopies;
	}

	void read() {
		System.out.println("Open the book and read");
	}

}
