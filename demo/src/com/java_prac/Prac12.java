package com.java_prac;

import java.util.Arrays;


public class Prac12 {

	public static void main(String[] args) {
		int a[] = {1,4,2};
		int b[] = {5,4,4};
		
		Prac12 p12 = new Prac12();
		int r = p12.solution(a, b);
		System.out.println(r);
	}
	public int solution(int[] A, int[] B)
    {	
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < A.length; i++) {
			answer += A[A.length-1-i]*B[i]; 
		}

        return answer;
    }

}
