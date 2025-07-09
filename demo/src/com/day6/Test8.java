package com.day6;

import java.util.Calendar;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		
		/*
		 * 년도 : 2025
		 * 월 : 4
		 * 일 : 20
		 * 몇일후 : 100
		 * 
		 * 만 난 날 : 2025년 4월 20일 수요일
		 * 100일 후 : 2025년 7월 29일 금요일
		 */
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		int y, m,d, week,afterDay;
		
		do {
			System.out.print("년도 : ");
			y = sc.nextInt();

		} while (y < 1);
		
		
		do {
			System.out.print("월 : ");
			m = sc.nextInt();

		} while (m < 1 || m > 12);
		
		cal.set(y,m-1,1);
		do {
			System.out.print("일 : ");
			d = sc.nextInt();
			
		} while (d < 1 || d > cal.getActualMaximum(Calendar.DATE));
		
		do {
			System.out.print("몇일후 : ");
			afterDay = sc.nextInt();

		} while (afterDay < 1);

		cal.set(y, m - 1,d);
		
		String[] yoil = {"일","월","화","수","목","금","토"};
		//1~7
		week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("만 난 날 : %d년 %d월 %d일 %s요일\n",y,m,d,yoil[week-1]);
		
		cal.add(Calendar.DATE,afterDay);
		
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%d일 후 : %d년 %d월 %d일 %s요일",afterDay,y,m,d,yoil[week-1]);
		
	}

}
