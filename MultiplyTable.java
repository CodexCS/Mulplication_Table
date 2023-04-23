package com.FirstJavaProject;

public class MultiplyTable {
	void print() {
		print(5, 1, 10);
	}

	int b = 0;

	void print(int b) {
		print(b, 1, 10);

	}

	void print(int b, int from, int to) {
			for( int a=from; a<=to; a++) {
				System.out.printf("%d x %d = %d",a,b,a*b).println();
			}

		}
		


}
