package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int num1,num2;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("첫번째 숫자 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 숫자 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		
//		System.out.println(num1 + ":" + num2);
		
		System.out.printf("%d + %d = %d\t",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d\t",num1,num2,num1*num2);
		System.out.printf("%d / %d = %.2f\n",num1,num2,(double)num1/num2);
		System.out.printf("%d %% %d = %d\n",num1,num2,num1%num2);
		
		System.out.println("---------------------------------");
		
		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println(num1  + " > " + num2 + " : " + (num1 > num2));
		
		
		
		
		
		
	}

}
