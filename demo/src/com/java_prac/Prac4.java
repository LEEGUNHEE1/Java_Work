package com.java_prac;

import java.util.Arrays;

//대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
//s에'p'의 개수와'y'의 개수를 비교해 같으면 True,다르면 False를 return 하는 solution를 완성하세요.
//'p','y'모두 하나도 없는 경우는 항상 True를 리턴합니다.단,개수를 비교할 때 
//대문자와 소문자는 구별하지 않습니다.

public class Prac4 {

	public static void main(String[] args) {
		String s = "asppPdyYyqw";
		Prac4 p4 = new Prac4();
		System.out.println(p4.solution(s));
	}

	boolean solution(String s) {
		boolean answer = true;
		String p = "", y = "";
		int cntp = 0, cnty = 0;

		s = s.replaceAll("P", "p");
		s = s.replaceAll("Y", "y");

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				cntp++;
			}
			if (s.charAt(i) == 'y') {
				cnty++;
			}
		}

		if (cntp != cnty) {
			answer = false;
		}
		return answer;
	}
}
