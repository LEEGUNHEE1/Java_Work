package com.day16;

class MyThread1 extends Thread {

	private int num;
	private String name;

	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() {
		// 스레드의 메소드

		int i = 0;

		while (i < num) {

			System.out.println(this.getName() + " : " + name + i);
			i++;

			//반드시 인터벌 줘야함
			try {
				sleep(100);// interval, interval은 반드시 try로 묶어줘야함

			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

	}

}

public class Test8 {

	public static void main(String[] args) {

		System.out.println("main 시작");

		MyThread1 t1 = new MyThread1(100, "첫번째 : ");
		MyThread1 t2 = new MyThread1(200, "두번째 : ");
		t1.start();//run() 실행
		t2.start();//run() 실행
		
		System.out.println("main 종료");
	}

}
