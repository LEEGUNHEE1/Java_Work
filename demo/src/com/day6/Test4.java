package com.day6;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		int[] num = new int[5];
		int i, j, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5개 수 입력 : ");
		for (i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		
		System.out.print("Sourse Data : ");
		
		
		for(i = 0; i < num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		
		//Selection Sort
		for(i =0; i < num.length-1;i++) {
			for(j=i+1;j<num.length;j++) {
				if (num[i] > num[j] ) {
					temp = num[i];
					num[i] = num[j];
					num[j]= temp;
				}
			}
		}
		
		//출력
		System.out.print("Sorted Data : ");
		
		//확장 for문
		for(int su : num) {
			System.out.printf("%4d",su);
		}
		System.out.println();
		
	}

}
