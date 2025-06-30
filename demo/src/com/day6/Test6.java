package com.day6;

public class Test6 {

	public static void main(String[] args) {
		int i, j, k = 2;

		String gong = " ";
		for (int l = 0; l <= 1; l++) {

			for (i = 1; i <= 9; i++) {
				for (j = k; j <= k + 3; j++) {
					int result = i * j;
					if (result < 10) {
						gong = "    ";
					} else {
						gong = "   ";
					}

					System.out.printf("%d * %d = %d%s", j, i, result, gong);
					if (j == 5 || j == 9) {
						System.out.println();
					}

				}

			}
			if (k == 2) {
				k = 6;
				System.out.println();
			}
		}
//		for (i = 1; i <= 9; i++) {
//			for (j = 6; j <= 9; j++) {
//				int result = i * j;
//				if (result < 10) {
//					gong = "    ";
//				} else {
//					gong = "   ";
//				}
//
//				System.out.printf("%d * %d = %d%s", j, i, result, gong);
//				if (j == 9) {
//					System.out.println();
//				}
//				
//			}
//			
//		}

	}
}
