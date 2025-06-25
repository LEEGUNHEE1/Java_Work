package com.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test5_ex {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//사용자한테 밑변(width)과 높이(height)를 입력 받아 삼각형의 넓이를 구하기
		// 밑변: 10
		// 높이: 20
		// 넓이: 밑변 x 높이 / 2
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		System.out.print("밑변과 높이?");
		
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int  width = Integer.parseInt(st.nextToken()); 
		int height = Integer.parseInt(st.nextToken()); 
		
		int area = (width*height)/2;
		
//		bw.write(area);
//		bw.write(Integer.toString(area));
		bw.write("넓이는 "+ Integer.toString(area));
//		bw.write("넓이는 "+ area); //자동형변환
		bw.flush();
		bw.close();
		
		
	}

}
