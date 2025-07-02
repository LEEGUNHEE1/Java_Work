package com.day8;

public class Test2 {

	public static void main(String[] args) {
		
		int a[][] = {{5,4,3},{2,6,5},{7,4,2}};
		int b[][] = {{7,3,4},{3,2,1},{4,2,5}};
		int sum[][] = new int[3][3];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				sum[i][j] = a[i][j]+b[i][j];
				System.out.printf("%4d",sum[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		

	}

}
