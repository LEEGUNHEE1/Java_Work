package com.day6;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 년,월,일 입력하면 요일 출력
		// 2025년 6월 30일 월요일

		int y, m, d, nalsu, i, week;
		String day = null;
		boolean yoon = false;
		int yoonCnt = 0;

		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("년도 : ");
			y = sc.nextInt();

		} while (y < 1);

		// 윤년에 따른 2월의 날수
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			months[1] = 29;
		}

		do {
			System.out.print("월 : ");
			m = sc.nextInt();

		} while (m < 1 || m > 12);

		do {
			System.out.print("일 : ");
			d = sc.nextInt();

		} while (d < 1 || d > months[m - 1]);

		// 윤년에 따른 2월의 날수
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			months[1] = 29;
		}

		// 1년1월1일부터 전년12월31일까지의 날수
//		for(i = 1; i < y; i++) {
//			 if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
//				 yoonCnt ++ ;
//			 }
//		}
//		nalsu = 365 * (y-1) + yoonCnt;
//		System.out.println(nalsu + ":" + yoonCnt);

		nalsu = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

//		//전년도 까지의 윤년의 갯수
//		int yy = (y-1)/4 - (y-1)/100 + (y-1)/400;
//		System.out.println(nalsu + ":" + yy);

		// y년 전월(m-1)까지의 날수
		for (i = 0; i < m - 1; i++) {
			nalsu += months[i];
		}
		week = (nalsu + d) % 7;
		
		String yoil[] = {"일","월","화","수","목","금","토"};
		
		System.out.printf("%d년 %d월 %d일 %s요일",y,m,d,yoil[week]);

//		switch (week) {
//		case 0:
//			day = "일요일";
//			break;
//		case 1:
//			day = "월요일";
//			break;
//		case 2:
//			day = "화요일";
//			break;
//		case 3:
//			day = "수요일";
//			break;
//		case 4:
//			day = "목요일";
//			break;
//		case 5:
//			day = "금요일";
//			break;
//		case 6:
//			day = "토요일";
//			break;
//
//		}
//
//		System.out.printf("%d년 %d월은 %d일은 %s입니다\n", y, m,d,day);

	}
}
