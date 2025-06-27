package com.day5;

import java.io.IOException;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) throws IOException {

		int num1, num2, result =0;
		char op;

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 수 입력 : ");
		num1 = sc.nextInt();

		System.out.print("두번째 수 입력 : ");
		num2 = sc.nextInt();

		System.out.print("연산자[ + , - , * , /] : ");
		op = (char) System.in.read();

//		switch (op) {
//
//		case '+':
//			System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
//			break;
//		case '-':
//			System.out.printf("%d - %d = %d", num1, num2, (num1 - num2));
//			break;
//		case '*':
//			System.out.printf("%d * %d = %d", num1, num2, (num1 * num2));
//			break;
//		case '/':
//			System.out.printf("%d / %d = %d", num1, num2, (num1 / num2));
//			break;
//		default:
//			System.out.println("오류");
//
//		}
		
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("오류");
			break;
		}
		System.out.printf("%d %c %d = %d", num1, op,num2,result);

	}

}
