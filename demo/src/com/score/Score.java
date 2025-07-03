package com.score;

import java.util.Scanner;

public class Score {

	int inwon;
	Record[] rec;
	Scanner sc = new Scanner(System.in);
	
	String[] title = { "국어 : ", "영어 : ", "수학 : " };

	public void set() {

		do {
			System.out.print("인원 수 : ");
			inwon = sc.nextInt();

		} while (inwon < 1 || inwon > 10);

		// 배열 객체 생성
		rec = new Record[inwon];

	}

	public void input() {

		

		for (int i = 0; i < inwon; i++) {
			rec[i] = new Record();

			System.out.print("이름 : ");
			rec[i].name = sc.next();

			for (int j = 0; j < 3; j++) {
				System.out.print(title[j]); // 국영수
				rec[i].score[j] = sc.nextInt();

				rec[i].tot += rec[i].score[j];
			}
			rec[i].avg = rec[i].tot / 3;
			System.out.println();
		}
		System.out.println();
	}

	private void ranking() {

		for (int i = 0; i < inwon; i++) {
			rec[i].rank = 1;
		}

		for (int i = 0; i < inwon - 1; i++) {
			for (int j = i + 1; j < inwon; j++) {
				if (rec[i].tot < rec[j].tot) {
					rec[i].rank++;
				} else if (rec[i].tot > rec[j].tot) {
					rec[j].rank++;
				}
			}
		}

	}

	public void print() {
		
		ranking();
		
		for (int i = 0; i < inwon; i++) {
		
			System.out.printf("%8s",rec[i].name);
			
			for (int j = 0; j < 3; j++) {
				System.out.printf("%8s%3d",title[j],rec[i].score[j]);
			}
			
			System.out.printf("\ttot%4d",rec[i].tot);
			System.out.printf("\tavg%3d",rec[i].avg);
			System.out.printf("\trank%3d\n",rec[i].rank);
			
		}
		
	}

}
