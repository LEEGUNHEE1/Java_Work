package com.day4;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		int item = 15800;
		int cnt;
		double money;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매 갯수 : ");
		cnt = sc.nextInt();
		
		if (cnt >= 30) {
			money = (item * cnt)*0.8;
		}else if (cnt < 30 && cnt >=20) {
			money = (item * cnt)*0.85;
		} else if (cnt < 20 && cnt >= 10 ) {
			money = (item * cnt)*0.90;
		}else {
			money = item * cnt;
		}
		System.out.printf("구입 수량 : %d, 판매총금액 : %.2f, 할인금액 : %.2f", cnt, money, ((item*cnt)-money));
		

	}

}
