package com.day20;

import java.util.Random;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random rd = new Random();
		boolean flag = true;
		int cnt;

		do {

			int num;
			int rdNum = rd.nextInt(10) + 1;
			String str;
			cnt = 0;

			for (int i = 0; i < 3; i++) {

				System.out.printf("정수 입력 [%d번째 기회]? ", i + 1);
				num = sc.nextInt();

				if (num != rdNum) {

					System.out.println("틀렸어요!!");

				} else {
					System.out.println("맞았어요!!\n");
					System.out.printf("정답은 %d입니다.", rdNum);
					break;

				}

				cnt++;

				if (cnt == 3) {
					System.out.printf("\n정답은 %d입니다.", rdNum);

				}

			}

			System.out.println();
			System.out.print("계속 할래?[Y/N] : ");
			str = sc.next();

			if (str.equals("N")) {

				flag = false;
				System.out.println("종료합니다");
			} else if (str.equals("Y")) {

			} else {
				return;
			}

		} while (flag);

	}

}
