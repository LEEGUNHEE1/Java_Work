package com.day17;

import java.io.IOException;

//Stream
//데이터 입출력시 모든 데이터를 형태와 상관없이 단방향으로 데이터를 전송하는 객체

//바이트 스트림(in)
public class Test5 {

	public static void main(String[] args) throws IOException {
		
		int data;
		
		System.out.print("문자열 : ");
		while ((data = System.in.read())!=-1) {
			
			char ch = (char)data;
			System.out.print(ch);
			
		}
		
		
	}

}
