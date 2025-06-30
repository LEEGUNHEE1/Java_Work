package com.day6;

public class Test5 {

	public static void main(String[] args) {
		int i, j;

		String gong = " ";

		for (i = 1; i <= 9; i++) {
			for (j = 2; j <= 5; j++) {
				int result = i * j;
				if (result < 10) {
					gong = "    ";
				} else {
					gong = "   ";
				}

				System.out.printf("%d * %d = %d%s", j, i, result, gong);
				if (j == 5) {
					System.out.println();
				}
				
			}
			
		}
		System.out.println();
		for (i = 1; i <= 9; i++) {
			for (j = 6; j <= 9; j++) {
				int result = i * j;
				if (result < 10) {
					gong = "    ";
				} else {
					gong = "   ";
				}

				System.out.printf("%d * %d = %d%s", j, i, result, gong);
				if (j == 9) {
					System.out.println();
				}
				
			}
			
		}

	}
}
