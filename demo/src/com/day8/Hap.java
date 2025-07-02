package com.day8;

import java.util.Scanner;

public class Hap {

	int su, sum;

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		su = sc.nextInt();

	}

	public int cnt() {

		for (int i = 1; i <= su; i++) {
			sum += i;
		}
		return sum;
	}

	public void print(int result) {

		System.out.printf("1부터 %d까지 합 : %d", su, result);

	}
}
