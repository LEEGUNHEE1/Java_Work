package com.day7;

import java.util.Scanner;
import javax.swing.text.AbstractDocument.LeafElement;

public class Test3 {

	public static void main(String[] args) {

		// 10명 이내의 이름과 정수를 입력받아 정수가 높은 사람순으로 출력(내림차순)
		// 석차 구하기

		String[] name;
		int scr[];
		int rk[];

		int inwon;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("인원수[1~10] : ");
			inwon = sc.nextInt();

		} while (inwon < 1 || inwon > 10);

		// 배열을 메모리 할당함 (객체 생성)
		name = new String[inwon];
		scr = new int[inwon];
		rk = new int[inwon];

		for (int i = 0; i < inwon; i++) {
			System.out.print((i + 1) + "번째 이름 점수 : ");
			name[i] = sc.next();
			scr[i] = sc.nextInt();
		}

		// 석차 초기화
		for (int i = 0; i < inwon; i++) {
			rk[i] = 1;
		}

		for (int i = 0; i < inwon - 1; i++) {
			for (int j = i + 1; j < inwon; j++) {
				// 석차 구하기
				// scr를 비교해서 작은 값의 rank에 +1
				if (scr[i] < scr[j]) {
					rk[i]++;
				}else if(scr[i] > scr[j]){
					rk[j]++;
				}	
			}
		}
		for (int i = 0; i < inwon; i++) {
			System.out.printf("%8s %4d %4d \n", name[i], scr[i], rk[i]);
		}

	}

}
