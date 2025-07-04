package com.bank;

import java.util.Scanner;
import com.bank.*;

public class Bank {

	Scanner sc = new Scanner(System.in);
	Jumin jm = new Jumin();
	Account ac = new Account();
	Record[] rec;
	int inwon;
	String account, jumin;
	int accountNum;
	Show s = new Show();

	public void set() {

		do {
			System.out.print("사람 수 : ");
			inwon = sc.nextInt();

			rec = new Record[inwon];

		} while (inwon < 1);
	}

	public void input() {
		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record();

			System.out.print("이름 : ");
			rec[i].setName(sc.next());

			jumin = jm.juminCheck();
			System.out.println("맞는 주민번호");
			rec[i].setJumin(jumin);

			account = ac.accountCreate();
			rec[i].setAccount(account);
			System.out.printf("당신의 계좌번호 : %s\n", account);

			System.out.print("비밀번호 설정 : ");
			rec[i].setPassword(sc.next());
		}
		System.out.println("계좌 생성 완료");

	}

	public void showAccount() {
		for (int i = 0; i < inwon; i++) {
			System.out.printf("%d번 이름 : %s 계좌 번호 : %s\n", (i + 1), rec[i].getName(), rec[i].getAccount());
		}
	}

	public Record passCheck(int accountNum) {
		String passCheck, pass;
		this.accountNum = accountNum - 1;
		do {
			System.out.print("비밀 번호 확인 : ");
			passCheck = sc.next();
			pass = rec[this.accountNum].getPassword();

		} while (!pass.equals(passCheck));

		System.out.println("비밀번호 맞음");

		return rec[this.accountNum];

	}

	public void select() {

		s.showScreen2(rec[this.accountNum]);
		int num = sc.nextInt();
		if (num == 1) {
			insert();
		} else if (num == 2) {
			minus();
		} else if (num == 3) {
			return;
		} else if (num == 4) {
			BankMain.exit();
			return;
			}
		else {
			select();
		}
	}

	public void insert() {
		int money = rec[accountNum].getMoney();

		System.out.print("입금할 돈 : ");
		rec[accountNum].setMoney(money + sc.nextInt());
		System.out.printf("잔액 : %d\n", rec[accountNum].getMoney());
		select();

	}

	public void minus() {
		System.out.print("출금할 돈 : ");
		int minusMoney = sc.nextInt();
		int money = rec[accountNum].getMoney();
		if (minusMoney > rec[accountNum].getMoney()) {
			System.out.println("잔액 부족");
			select();
		}
		rec[accountNum].setMoney(money - minusMoney);
		System.out.printf("잔액 : %d\n", rec[accountNum].getMoney());
		select();
	}

}
