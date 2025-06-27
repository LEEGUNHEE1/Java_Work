package com.day5;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		//두개의 수를 입력 받아 작은 수 에서 큰 수 까지의 합
		int num1,num2,a,sum = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			a = num1;
			num1 = num2;
			num2 = a;
		}
		
		
		for (int i = num1; i <= num2; i++) {
			sum += i;
			
		}
		System.out.printf("%d에서 %d까지 의 합 : %d",num1,num2,sum );
		
		
		
		

	}

}
