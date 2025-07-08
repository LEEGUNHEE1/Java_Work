package com.java_prac;

import java.util.ArrayList;

public class Prac3 {
	
//	정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 
//	있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
//
//		제한사항
//		numbers의 길이는 2 이상 100 이하입니다.
//		numbers의 모든 수는 0 이상 100 이하입니다.

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
