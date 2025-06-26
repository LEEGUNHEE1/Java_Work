package com.day3;


import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException{
		
		
		char ch, result;
		
		System.out.print("한개의 문자: ");
		ch = (char)System.in.read();
		
		//대소문자 변환
		result = ch >= 65 && ch <=90 ? (char)(ch+32) : ch >= 'a' && ch <= 'z'? (char)(ch -32) : ch;  
		System.out.println(ch + "->" + result);
		
	}

}
