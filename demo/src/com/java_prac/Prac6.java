package com.java_prac;

//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
//단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.


public class Prac6 {

	public static void main(String[] args) {
		
		String s = "abctde";
		Prac6 p6 = new Prac6();
		System.out.println(p6.solution(s));

	}

	public String solution(String s) {
		String answer = "";
		if (s.length() % 2 == 0) {
			answer += s.charAt((s.length() / 2)-1) + "" +  s.charAt((s.length() / 2));
		} else {
			answer += s.charAt((s.length() / 2));
		}

		return answer;
	}
}
