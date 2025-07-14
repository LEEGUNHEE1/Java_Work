package com.java_prac;

import java.util.Arrays;

public class Prac15 {

	public static void main(String[] args) {

	}

	public String solution(int[] numbers) {
	        String str = "";
	        
	        char[] ch = new char[numbers.length];
	        
	        for (int i = 0; i < numbers.length; i++) {
				ch[i] = (char)numbers[i];
				
			}
	        
	        Arrays.sort(ch);
	        
	        for (int i = 0; i < ch.length; i++) {
				str += ch[ch.length-1-i];
			}
	        
	        return str;
	    }
}