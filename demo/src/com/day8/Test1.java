package com.day8;

public class Test1 {

	public static void main(String[] args) {

		// 배열의 배열
		int[][] arr = new int[6][6];

		int i, j, n;
		n = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				
				n++;
				arr[i][j] = n;
				
				arr[i][5] += n; // 가로합계
				arr[5][j] += n; // 세로합계
				arr[5][5] += n; // 전체합계
				
			}
		}

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}

	}

}
