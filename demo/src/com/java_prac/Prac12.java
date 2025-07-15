package com.java_prac;

import java.util.Arrays;
//길이가 같은 배열 A, B 두개가 있습니다. 각 배열은 자연수로 이루어져 있습니다.
//배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 
//이러한 과정을 배열의 길이만큼 반복하며, 두 수를 곱한 값을 누적하여 더합니다. 
//이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다.

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
