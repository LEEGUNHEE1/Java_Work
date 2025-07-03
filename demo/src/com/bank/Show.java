package com.bank;

public class Show {
	public void showScreen1() {
		System.out.println("--------------");
		System.out.println("1.계좌선택 | 2. 종료");
		System.out.println("--------------");
	}
	
	public void showScreen2(Record rec) {
		System.out.println("---------------------");
		System.out.printf("잔액 : %d\n",rec.getMoney() );
		System.out.println("1.예금 | 2.출금 | 3.종료");
		System.out.println("---------------------");
	}

}
