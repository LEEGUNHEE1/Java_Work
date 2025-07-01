package com.day7;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {

		// 1~45까지의 수 중 6개의 난수(랜덤 수)를 발생시켜 오름차순으로 출력

		int num[] = new int[6];
		Random rd = new Random();
		int n = 0, t , cnt = 0;

		while (n < 6) {
			num[n] = rd.nextInt(45) + 1;

			for (int i = 0; i < n; i++) {
				if (num[i]==num[n]) {
					n-- ;
					cnt++ ;
					break;
				}
			}
			n++;
		}

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
		}

		for (int i : num) {
			System.out.println(i);
		}
		System.out.println("cnt : "+ cnt);

	}

}
