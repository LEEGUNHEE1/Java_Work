package com.day3;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String pan;
		String name;
		int kor;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("국어점수 : ");
		kor = sc.nextInt();
		
		
		
		if (kor >= 90) {
			pan = "수";
		}else if (kor >= 80) {
			pan = "우";
		}else if(kor >= 70){
			pan = "미";
		}else if (kor >= 60) {
			pan = "양";
		}else {
			pan = "가";
		}
		System.out.printf("%s의 국어점수 : %s",name,pan);
		
		
		
	}

}
