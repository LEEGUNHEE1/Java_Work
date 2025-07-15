package com.day17;

class MyThread implements Runnable {

	private int bank = 10000; // 은행잔고

	private int getBank() {
		return bank;
	}

	private int drawMoney(int m) {
		bank -= m; // 인출
		return m; // 인출 금액
	}

	@Override
	public void run() {
		int moneyNeed = 6000; // 인출 할 금액
		int money; // 인출 금액

		String msg;

		try {

			synchronized (this) {

				if (getBank() >= moneyNeed) {

					money = drawMoney(moneyNeed);
					msg = "인출 성공";
				} else {
					money = 0;
					msg = "인출실패";
				}
			}
			System.out.println(
					Thread.currentThread().getName() + " : " + msg + ", 인출 금액 : " + money + ", 잔액 : " + getBank());

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}

public class Test4 {

	public static void main(String[] args) {

		MyThread ob = new MyThread();

		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);

		t1.start();
		t2.start();

	}

}
