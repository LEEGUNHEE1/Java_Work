package com.day4;

import java.util.Scanner;

//Scanner
//단락문자의 패턴을 사용해 분류하는 작업
//기본 패턴은 공백
public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng,mat;
		
		System.out.print("이름 국어 영어 수학 :  ");
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.printf("이름 : %s 총점 : %d\n",name,(kor+eng+mat));
	}

}
