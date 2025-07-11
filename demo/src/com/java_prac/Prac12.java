package com.java_prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        List<Integer> listA = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(B).boxed().collect(Collectors.toList());
        
        listA.sort();
        

        return answer;
    }

}
