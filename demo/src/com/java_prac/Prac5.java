package com.java_prac;

//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
//예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

public class Prac5 {

	public static void main(String[] args) {
		Prac5 p5 = new Prac5();
		int[] arr = p5.solution(794410354); 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public int[] solution(long n) {
		StringBuilder sb = new StringBuilder();
		sb.append(n).reverse();
		int[] answer = new int[sb.length()];
		
		for (int i = 0; i < sb.length(); i++) {
				answer[i] = Integer.parseInt(sb.substring(i,i+1));
		}
		
        return answer;
    }

}
