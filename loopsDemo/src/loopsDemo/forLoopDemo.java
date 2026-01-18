package loopsDemo;

public class forLoopDemo {

	public static void main(String[] args) {

		MyNumber number = new MyNumber(6);
		boolean isPrime = number.isPrime();
		System.out.println(isPrime + " is Prime");

		int sum = number.sumUptoN();
		System.out.println("Your Sum is: " + sum);

		int sumOfDivisor = number.sumOfDivisor();
		System.out.println("Your Sum of divisor is: " + sumOfDivisor);

		number.printTriangle();

	}
}