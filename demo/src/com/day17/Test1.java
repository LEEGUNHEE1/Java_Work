package com.day17;

//스레드 우선순위

class MyThread1 extends Thread{
	
	private String name;
	
	public MyThread1(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
	
		for (int i = 1; i <= 20; i++) {
			System.out.println(name + " : " + i);
		}
		

	}
}


public class Test1 {

	public static void main(String[] args) {

		MyThread1 ob1 = new MyThread1("A");
		MyThread1 ob2 = new MyThread1("B");
		MyThread1 ob3 = new MyThread1("C");
		
		//스레드 우선순위 종류
		System.out.println("MIN: " + Thread.MIN_PRIORITY);//1
		System.out.println("NOR: " + Thread.NORM_PRIORITY);//5(기본)
		System.out.println("MAX: " + Thread.MAX_PRIORITY);//10
		
		//우선순위 출력
		System.out.println(ob1.getPriority());
		System.out.println(ob2.getPriority());
		System.out.println(ob3.getPriority());

		//우선순위 변경
		ob1.setPriority(Thread.MIN_PRIORITY);
		ob2.setPriority(Thread.NORM_PRIORITY);
		ob3.setPriority(Thread.MAX_PRIORITY);
		
		ob1.start();
		ob2.start();
		ob3.start();
		
		
	}

}
