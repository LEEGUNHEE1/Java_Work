package com.java_prac;

import java.util.ArrayList; 
import java.util.List;
import java.util.Stack;

//배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
//이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
//단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
//
//arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

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
