package com.day8;

import java.util.Scanner;

class Day7_T1 {
	// 10명 이내의 이름과 점수를 입력받아 점수가 높은 사람순으로 출력(내림차순)
	int inwon,temp;
	int scr[];
	String name[];
	String temp1;
	
	public void input() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("인원 수[1~10] : ");
			inwon = sc.nextInt();

		} while (inwon < 1 || inwon > 10);
		
		name = new String[inwon];
		scr = new int[inwon];

		for (int i = 0; i < inwon; i++) {
			System.out.print((i+1) + "번째 이름 점수 :");
			name[i] = sc.next();
			scr[i] = sc.nextInt();
		}

	}
	
	public void sort(String[] name,int[] scr) {
		
		for (int i = 0; i < inwon - 1; i++) {
			for (int j = 1 ; j < inwon; j++) {
				if (scr[i] < scr[j]) {
					temp = scr[i];
					scr[i] = scr[j];
					scr[j] = temp;
					
					temp1 = name[i];
					name[i] = name[j];
					name[j] = temp1;
				}
			}
		}
	}
	
	

	public void print() {
		for (int i = 0; i < inwon; i++) {
			System.out.printf("%8s %4d\n",name[i], scr[i]);
		}

	}

}

public class Day7_Test1 {

	public static void main(String[] args) {
		
		String name[];
		int scr[];
		
		Day7_T1 dt = new Day7_T1();
		
		dt.input();
		
		name = dt.name;
		scr = dt.scr;
		
		dt.sort(name, scr);
		
		dt.print();

	}

}
