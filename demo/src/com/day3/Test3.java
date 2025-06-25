package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		char ch, result;
		
		System.out.print("한개의 문자: ");
		ch = (char)System.in.read();
		
		//대소문자 변환
		result = ch >= 65 && ch <=90 ? (char)(ch+32) : ch >= 'a' && ch <= 'z'? (char)(ch -32) : ch;  
		System.out.println(ch + "->" + result);
		
	}

}
