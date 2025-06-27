package com.day5;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		
		//1에서 100까지의 수 중 3의 배수의 갯수
		int su,num,cnt=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇까지 : ");
		su = sc.nextInt();
		
		System.out.print("몇의 배수 : ");
		num = sc.nextInt();
		
		for (int i = 1; i <= su; i++) {
			if (i % num == 0) {
				cnt ++;
			}
		}
		
		System.out.printf("1에서 %d까지 수 중 %d의 배수의 갯수는 : %d개" ,su,num,cnt);
		

	}

}
