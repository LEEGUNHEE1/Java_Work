package com.day8;

import java.io.IOException;
import java.util.Scanner;

class Day5_T8 {

	int num1, num2, result;
	char op;

	public void input() throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 수 입력 :");
		num1 = sc.nextInt();

		System.out.print("두번째 수 입력 :");
		num2 = sc.nextInt();

		System.out.print("연산자[ + , - , * , / ] :");
		op = (char) System.in.read();

	}

	public void cal(char op) {
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

	}
	
	public void print() {
		System.out.printf("%d %c %d = %d",num1,op,num2,result);
	}
}

public class Day5_Test8 {

	public static void main(String[] args) throws IOException {
		
		Day5_T8 dt = new Day5_T8();
		
		dt.input();

		char op = dt.op;
				
		dt.cal(op);;
		
		dt.print();

	}

}
