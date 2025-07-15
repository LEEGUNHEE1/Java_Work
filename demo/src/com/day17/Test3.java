package com.day17;

//스레드 생명주기

class MyThread3 extends Thread {
	@Override
	public void run() {

		try {

			System.out.println("스레드 시작");

			System.out.println("우선순위 : " + getPriority());
			System.out.println("스레드 이름 : " + getName());

			// 0.5초 쉼
			sleep(500);
			
			//우선순위 변경
			setPriority(2);
			System.out.println("변경된 우선순위 : " + getPriority());
			
			System.out.println("스레드 종료");
			
		} catch (Exception e) {

		}

	}
}

public class Test3 {

	public static void main(String[] args) {

		Thread t1 = Thread.currentThread();//main
		Thread t2 = new MyThread3();
		
		System.out.println("메인스레드 우선순위 : " + t1.getPriority());
		System.out.println("메인스레드 이름 : " + t1.getName());
		System.out.println("t2.start() 호출전 isAlive : " + t2.isAlive());
		
		t2.start();
		
		//t2의 우선순위
		System.out.println("t2 우선순위 : " + t2.getPriority());
		
		//t2우선순위 변경
		t2.setPriority(1);
		
		
		try {
		
			Thread.sleep(100);
			System.out.println("t2 isAlive : " + t2.isAlive());
			
			//메인 1초 쉼
			Thread.sleep(1000);
			System.out.println("1초 쉬고 t2 isAlive : " + t2.isAlive());
			
			t2.join();
			System.out.println("t2.isAlive : " + t2.isAlive());
			
		} catch (Exception e) {

		}
		
		
		
	}

}
