package com.bank;

import java.io.IOException;
import java.util.Scanner;

public class BankMain {

	static boolean run = true;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int num;

		Bank bk = new Bank();
		Record rc = new Record();
		Show s = new Show();

		bk.set();
		bk.input();

		while (run) {
			s.showScreen1();
			System.out.print("선택> ");
			num = (int)System.in.read() - 48;
			System.out.println(num);
			switch (num) {
			case 1:
				bk.showAccount();
				System.out.print("\n선택> ");
				int a = sc.nextInt();
				if (a > 0 && a <= bk.rec.length) {
					rc = bk.passCheck(a);
					bk.select();
				}

				break;
			case 2:
				BankMain.exit();
				break;
			default:
				break;
			}

		}

	}

	public static boolean exit() {
		System.out.println("프로그램 종료");
		run = false;
		return run;

	}
}
