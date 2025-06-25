package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//사용자한테 밑변(width)과 높이(height)를 입력 받아 삼각형의 넓이를 구하기
		// 밑변: 10
		// 높이: 20
		// 넓이: 밑변 x 높이 / 2
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("밑변? ");
		int width = Integer.parseInt(bf.readLine());
		System.out.print("높이? ");
		int height = Integer.parseInt(bf.readLine());
		int area = (width*height)/2;
		
		System.out.printf("넓이는 %d",area);
	}

}
