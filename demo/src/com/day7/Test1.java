package com.day7;

import java.util.Scanner;import javax.swing.text.AbstractDocument.LeafElement;

public class Test1 {

	public static void main(String[] args) {
		
		//10명 이내의 이름과 정수를 입력받아 정수가 높은 사람순으로 출력(내림차순)
		
		String[] name;
		int scr[];
		
		int inwon,temp;
		String temp1;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("인원수[1~10] : ");
			inwon = sc.nextInt();
			
		} while (inwon < 1 || inwon > 10);
		
		//배열을 메모리 할당함 (객체 생성)
		name = new String[inwon];
		scr = new int[inwon];
		

		for (int i = 0; i < inwon; i++) {
			System.out.print((i+1) + "번째 이름 점수 : ");
			name[i] = sc.next();
			scr[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < inwon-1; i++) {
			for (int j = i+1; j < inwon; j++) {
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
		for (int i = 0; i < inwon; i++) {
			System.out.printf("%8s %4d\n",name[i], scr[i]);
		}
		
		

	}

}
