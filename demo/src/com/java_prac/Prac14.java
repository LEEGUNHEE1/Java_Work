package com.java_prac;

import java.util.ArrayList; 
import java.util.List;
import java.util.Stack;

public class Prac14 {

	public static void main(String[] args) {
		int[] ii = { 1, 1, 3, 3, 0, 1, 1 };

		Prac14 p14 = new Prac14();

		int[] result = p14.solution(ii);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

	public int[] solution(int[] arr) {

		Stack<Integer> s = new Stack<Integer>();

		List<Integer> l = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (s.empty()) {
				s.push(arr[i]);
			} else {
				if (s.peek() == arr[i]) {
					s.push(arr[i]);
				} else {
					l.add(s.pop());
					s.clear();
					s.push(arr[i]);
				}
			}

		}
		l.add(s.pop());
		
		int[] answer = new int[l.size()];

		for (int i = 0; i < l.size(); i++) {
			answer[i] = l.get(i);
		}

		return answer;
	}
}
