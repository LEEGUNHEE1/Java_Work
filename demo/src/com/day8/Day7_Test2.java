package com.day8;

import java.util.Random;

class Day7_T2 {
	// 1~45까지의 수 중 6개의 난수(랜덤 수)를 발생시켜 오름차순으로 출력
	int num[] = new int[6];

	public void random(int range) {

		Random rd = new Random();

		int n = 0;

		while (n < 6) {

			num[n] = rd.nextInt(range + 1);

			for (int i = 0; i < n; i++) {
				//System.out.println(i + ":" + n);
				if (num[i] == num[n]) {
					n--;
				}
			}
			n++;

		}

	}

	public void sort(int[] num) {
		int temp;

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

	}

	public void print(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}

public class Day7_Test2 {

	public static void main(String[] args) {

		Day7_T2 dt = new Day7_T2();

		dt.random(45);

		int num[] = dt.num;
		dt.sort(num);
		num = dt.num;
		dt.print(num);

	}

}
