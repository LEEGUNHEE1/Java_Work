package com.day5;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		//switch
		Scanner sc = new Scanner(System.in);
		
		int su;
		
		System.out.print("1~3이내의 수 : ");
		su = sc.nextInt();
		
		switch (su) {
		case 3:
			System.out.println("***");
			break;
		case 2 : 
			System.out.println("**");
			break;
		case 1 :
			System.out.println("*");
			break;
		default:
			System.out.println("숫자 입력 오");
			break;
		}
		
		
		
		

	}

}
