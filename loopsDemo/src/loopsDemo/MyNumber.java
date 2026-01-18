package loopsDemo;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {

		for (int i = 2; i <= number - 1; i++) {
			if (number % 2 == 0) {
				return true;
			}
		}

		return false;
	}

	public int sumUptoN() {
		int sum = 0;
		for (int i = 0; i <= number + 1; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisor() {
		int sumOfDivisor = 0;
		for (int i = 2; i < number; i++) {
			if (sumOfDivisor % i == 0) {
				sumOfDivisor = sumOfDivisor + i;
			}
		}
		return sumOfDivisor;
	}

	public void printTriangle() {

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
	}
}