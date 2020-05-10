package com.firstjavaproject;

public class MultiplicationTable {
	// void print() {
	// for (int i=1;i<=10;i++) {
	// System.out.printf("%d * %d = %d", 5, i, 5*i);
	// }
	// }

	void print() {
		for (int table = 1; table <= 10; table++) {
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%d * %d = %d", table, i, table * i);
				// table++;
				System.out.println();
			}

		}
	}
}

// void print(int table, int from, int to) {
// for (int i=from; i<=to; i++) {
// System.out.printf("%d * %d = %d", table, i, table*i);
// }
//	}




