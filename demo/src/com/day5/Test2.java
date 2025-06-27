package com.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		//4개의 정수를 입력받아 제일 큰 숫자와 제일 작은 숫자 출력
		
		int num1,num2,num3,num4,a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("4개의 정수 입력 : ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		//제일 큰 숫자 : a, 제일 작은 숫자 : b
		
//		if (num1 > num2) {
//			a = num1;
//			num1 = num2;
//			num2 = a;
//					
//		}
//		if (num1 > num3) {
//			a = num1;
//			num1 = num3;
//			num3 = a;
//		}
//		if (num1 > num4) {
//			a = num1;
//			num1 = num4;
//			num4 = a;
//		}
//		if (num2 > num3) {
//			a = num2;
//			num2 = num3;
//			num3 = a;
//		}
//		if (num2 > num4) {
//			a = num2;
//			num2 = num4;
//			num4 = a;
//		}
//		if (num3 > num4) {
//			a = num3;
//			num3 = num4;
//			num4 = a;
//		}
//		System.out.printf("제일 큰 숫자 : %d, 제일 작은 숫자 : %d",num4,num1);
		
		
		int max, min;
		max = min = num1;
		if (num1 > max) {
			max = num1;
		}
		if (num1 < min) {
			min = num1;
		}
		if (num2 > max) {
			max = num2;
		}
		if (num2 < min) {
			min = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		if (num3 < min) {
			min = num3;
		}
		if (num4 > max) {
			max = num4;
		}
		if (num4 < min) {
			min = num4;
		}
		
		
		
		System.out.println(min + " : " + max);
		
		
	}

}
