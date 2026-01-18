package multiplicationTable;

public class multiplicationTable {

	// 5*1=5
	void printMultiplicationTable() {
		printMultiplicationTable(5);
	}

	void printMultiplicationTable(int table) {
		printMultiplicationTable(table, 1, 10);
	}

	void printMultiplicationTable(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d*%d=%d", table, i, table * i).println();
		}
	}
}
