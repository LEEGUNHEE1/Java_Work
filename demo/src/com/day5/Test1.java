package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		// 두개의 정수를 입력받아 큰숫자와 작은 숫자를 구분해 출력
		int num1, num2, a;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두개의 정수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
//		// 큰 숫자 : a , 작은 숫자 : b
//		if (num1 > num2) {
//			System.out.printf("큰 숫자 : %d, 작은 숫자 : %d",num1,num2);
//			
//		}else if(num1 < num2){
//			System.out.printf("큰 숫자 : %d, 작은 숫자 : %d",num2,num1);
//		}else {
//			System.out.printf("같음",num2,num1);
//		}
		
		if (num1 < num2) {
			a = num2;
			num2 = num1;
			num1 = a;
		}else if (num1 == num2) {
			System.out.println("같음");
			System.exit(0);
		}
		System.out.printf("큰 숫자 : %d, 작은 숫자 : %d",num1,num2);
		
		
	}

}
