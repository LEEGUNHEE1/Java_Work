package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int num;
		String str1,str2,str3;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("수 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		//삼항 연산자
		// 조건문 ? true 값 : false 값;
		str1 = num%2 == 0 ? "짝수" : "홀수";
		System.out.println(num + " : " + str1);

		str2 = num > 0 ? "양수" : num < 0 ? "음수" : "영" ;
		
		System.out.println(num + " : " + str2);
		
		str3 = num%4 == 0 &&  num % 100 != 0 || num % 400 == 0 ? "윤년" : "평년" ;
		System.out.println(num + " : " + str3);
		/*
		 && : AND (조건식 두개 모두 T 면 T)
		 T && T : T
		 T && F : F
		 F && T : F
		 F && F : F
		  
		 || : OR (조건식 둘 중 하나가 T 면 T)
		 T || T : T
		 T || F : T
		 F || T : T
		 F || F : F
		 */
		
	}

}
