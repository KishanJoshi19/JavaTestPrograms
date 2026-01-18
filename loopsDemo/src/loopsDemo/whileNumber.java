package loopsDemo;

public class whileNumber {

	private int limit;

	public whileNumber(int limit) {
		this.limit = limit;
	}

	public void printSquareUptoLimit() {

		int i = 1;

		while (i * i < limit) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
	}

	public void printCubesUptoLimit() {

		int i = 1;

		do {
			System.out.print(i * i * i + " ");
			i++;
		} while (i * i * i < limit);
	}

}
