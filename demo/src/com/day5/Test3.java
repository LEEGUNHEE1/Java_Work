package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 이름과 3과목의 점수를 입력받아 다음 조건에 따라 출력
		// 모든 과목의 점수가 40점 이상이고 평균이 60점 이상이면 합격
		// 한 과목이라도 40점 미만이고 평균이 60점 이상이면 과락
		// 평균이 60미만이면 불합격

		String name, pan = "";
		int kor, eng, math, tot;

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 국어 영어 수학 점수입력 : ");
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();

		tot = kor + eng + math;
		double avg = (double) (tot / 3);

		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			pan = "합격";
		} else if (avg >= 60) {
			pan = "과락";
		} else {
			pan = "불합격";

		}
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println("판정 : " + pan);

	}

}
