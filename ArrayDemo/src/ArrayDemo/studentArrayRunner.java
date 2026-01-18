package ArrayDemo;

import java.math.BigDecimal;

public class studentArrayRunner {

	public static void main(String[] args) {

		int[] marks = { 69, 85, 75, 95, 65 };
		Student student = new Student("Tom", marks);

		int number = student.getNumberOfMarks();
		System.out.println("Number of marks: " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Total Sum of Marks: " + sum);

		int maxMark = student.getMaxMarks();
		System.out.println("Maximum mark is: " + maxMark);

		int minMark = student.getMinMarks();
		System.out.println("Minimum mark is: " + minMark);

		BigDecimal average = student.getAverageMark();
		System.out.println("Average mark is: " + average);
	}

}
