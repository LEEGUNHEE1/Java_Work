package com.day6;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		//배열
		int num[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("배열의 갯수 : " + num.length + "개"); //배열의 length만 ()가 없다
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d개의 정수 입력 :",num.length-i);
			num[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("num["+i+"] = " +num[i]);
		} 
		
		num[3] = 400;
		System.out.println("num[3] = " + num[3]);

		int a = num[4];
		System.out.println("a : "+ a);
		
		
		
		
		
		
		

	}

}
