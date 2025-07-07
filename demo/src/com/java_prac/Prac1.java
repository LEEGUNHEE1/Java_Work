package com.java_prac;

public class Prac1 {
//정수 내림차순으로 배치
	public static void main(String[] args) {
		Prac1 p1 = new Prac1();
		long l = p1.solution(118372);
		System.out.println(l);
	}

	public long solution(long n) {
		long answer = 0;
		String t;
		
		String s = Long.toString(n);
		String[] str = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
				str[i] = s.substring(i, i+1);
		}
		for (int i = 0; i < str.length-1; i++) {
			for (int j = i; j < str.length; j++) {
				if (Integer.parseInt(str[i]) < Integer.parseInt(str[j])) {
					t = str[i];
					str[i] = str[j];
					str[j] = t;
				}
			}
		}
		t = "";
		for (int i = 0; i < str.length; i++) {
			t += str[i];
		}
		answer = Long.parseLong(t);
		return answer;
	}

}
