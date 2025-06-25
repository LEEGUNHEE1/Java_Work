package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test3 {

	public static void main(String[] args) throws IOException {
		
//사용자가 입력한 이름,국어,영어 점수 입력받아 이름과 총점을 출력해라
		
		//선언
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor,eng;
		int tot;
		
		//입력
		
		System.out.print("이름?");// suzi
		name = br.readLine();
		
		System.out.print("국어?");// 60
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어?");// 80
		eng = Integer.parseInt(br.readLine());
		
		//연산
		
		tot = kor + eng;
		
		
		
		//출력
		System.out.printf("이름은 %s ,국어는 %d,영어는 %d,총점은 %d",name,kor,eng,tot);
		
	}

}
