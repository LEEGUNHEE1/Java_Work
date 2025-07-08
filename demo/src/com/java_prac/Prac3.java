package com.java_prac;

import java.util.ArrayList;

public class Prac3 {

	public static void main(String[] args) {
		Prac3 p3 = new Prac3();
		int[] i = {2,1,3,4,1};
		int[] r; 
		r = p3.solution(i);
			for(int l : r) {
				System.out.print(l + " ");
		}
		

	}
	
	
	public int[] solution(int[] numbers) {
		
		
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				result.add((numbers[i] + numbers[j]));
			}
		}
		ArrayList<Integer> rs = new ArrayList<Integer>();
		for(int i : result) {
			if(!rs.contains(i)) {
				rs.add(i);
			}
		}
			
		rs.sort(null);
		int[] answer = new int[rs.size()];
        for (int i =0; i < rs.size();i++) {
			answer[i] = rs.get(i);
		}
        return answer;
    }

}
