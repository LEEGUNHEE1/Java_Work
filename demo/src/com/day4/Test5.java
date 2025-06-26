package com.day4;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		//반복문
		//for, while, do~while
		
		int dan;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 : ");
		dan = sc.nextInt();
		
		//for
		for (int i = 1; i <= 9 ; i++) {
			result = dan * i;
			System.out.printf("%d * %d = %d\n",dan,i,result);
			
		}
		
		System.out.println("----------------------------------------");
		
		//시작값
		//while(최대값){증가값; 작업}
		
		int j = 0;
		while (j < 9) {
			j++;
			result = dan * j;
			System.out.printf("%d * %d = %d\n",dan,j,result);
			
		}
		System.out.println("----------------------------------------");
		
		//시작값
		//do{증가값; 작업}while(최대값);
		int k = 0;
		do {
			k++;
			result = dan * k;
			System.out.printf("%d * %d = %d\n",dan,k,result);
			
		} while (k < 9);
		
		
	}

}
