package com.day7;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//bubble sort
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int t;

		System.out.print("5개 정수 : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		System.out.print("Source Data : ");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}
		System.out.println();

		// bubble sort
		for (int i = 1; i < num.length; i++) {

			for (int j = 0; j < num.length - i; j++) {
				
				// System.out.println(i + ":" + j); 이거 찍어봐라
				
				if (num[j] > num[j+1]) {
					t = num[j];
					num[j] = num[j+1];
					num[j+1] = t;
				}
			}
		}

		System.out.print("Sorted Data : ");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}

	}

}
