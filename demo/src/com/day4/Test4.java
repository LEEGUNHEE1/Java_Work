package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		//수를 입력 받아 3의 배수인지 4의 배수인지 확인

		int num;
		String str;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		
//		if (num % 3 == 0 && num % 4 == 0) {
//			str = "3과 4의 배수";
//		}else if (num % 3 == 0) {
//			str = "3의 배수";
//		}else if (num % 4 == 0) {
//			str = "4의 배수";
//		}else {
//			str = "둘다 아님";
//		}
	
		str = (num % 3 == 0 && num % 4 == 0) ? "3과 4의 배수" : (num % 3 ==0) ? "3의 배수" : 
			(num % 4 == 0) ? "4의 배수" : "둘 다 아님";
		
		System.out.println(num + " : " + str);
	}

}
