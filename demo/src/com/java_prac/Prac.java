package com.java_prac;

public class Prac {
	//두 정수 사이의 합

	public long solution(int a, int b) {
		long answer = 0;

		if (a < b) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else if (a > b) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		}else {
			answer = a;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Prac pr = new Prac();
		
		long i =pr.solution(2,10);
		System.out.println(i);
	}
}
