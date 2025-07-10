package com.java_prac;

import java.util.ArrayList;

public class Prac11 {

	public static void main(String[] args) {

		Prac11 p11 = new Prac11();

		System.out.println(p11.solution("baababa"));

	}

	public int solution(String s) {
		int answer = -1;

		ArrayList<String> al = new ArrayList<String>();

		for (int i = 0; i < s.length(); i++) {
			al.add(Character.toString(s.charAt(i)));
		}

		int defaultSize = al.size();

		while (al.size() > 1) {
			if (al.size() == 2) {
				if (al.get(0).equals(al.get(1))) {

					al.remove(1);
					al.remove(0);
					
					return answer = 1;
				}else {
					return answer;
				}
			}

			for (int i = 0; i < al.size() - 1; i++) {

				if (al.get(i).equals(al.get(i + 1))) {
					
					al.remove(i + 1);
					al.remove(i);
					
					break;
				}
			}
			if (defaultSize == al.size()) {
				return answer;
			}
		}
		return answer;
	}

}
