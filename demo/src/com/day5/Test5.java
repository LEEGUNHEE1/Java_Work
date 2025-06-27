package com.day5;

public class Test5 {

	public static void main(String[] args) {
		
		//다중 for문
		for (int i = 2; i <= 9; i++) {
			
			System.out.println(i + "단");
			for (int j = 1 ; j <= 9; j++) {
				
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println("");
		}
		
		
		

	}

}
