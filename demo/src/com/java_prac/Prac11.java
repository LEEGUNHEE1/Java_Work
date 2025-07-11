package com.java_prac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Prac11 {

	public static void main(String[] args) {

		Prac11 p11 = new Prac11();

		System.out.println(p11.solution("abcd"));

	}

	public int solution(String s)
    {
        
        Stack<Character> st = new Stack<Character>();
        
        for(char c : s.toCharArray()) {
        	if (st.empty()) {
				st.push(c);
			}else {
				if (st.peek() == c) {
					st.pop();
				}else {
					st.push(c);
				}
			}
        }
        if (st.empty()) {
			return 1;
		}
        

        return 0;
    }

}
