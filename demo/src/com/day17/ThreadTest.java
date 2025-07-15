package com.day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

class Thread5 extends Thread {
	@Override
	public void run() {

		
		try {
			for (int i = 1; i <= 20; i++) {
				System.out.print(".");
				sleep(100);
			}

			

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}

public class ThreadTest {

	public static void main(String[] args) {
		int inwon;

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		Thread5 ob = new Thread5();

		Set<Integer> set = new HashSet<Integer>();
		
		String[] name = { "은지영", "강혜정", "김재혁", "방윤서", "김윤호", "김명갑", "박지원", "장소영", "조용환", "이건희", "최민아", "차현탁", "한동해",
				"황인수", "박성훈", "홍원식" };

		System.out.print("발표자 인원수[최대16명] : ");
		inwon = sc.nextInt();


		System.out.print("고민중.");
		ob.start();

		try {
			ob.join();

		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println();
		System.out.println("축하합니다 발표자입니다.\n");
		
		int n = 0;
		
		while (set.size() == inwon) {
			
			set.add(rd.nextInt());
		}
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			n=1;
			
			String str = name[it.next()];
			System.out.printf("%d번 발표자 : %s\n",n,str);
			n++;
		}
		
//		for (int i = 1; i <= inwon; i++) {
//		 	int index = rd.nextInt(name.length);
//		 	
//			System.out.printf("%d번 발표자 : %s\n",i,name[index]);
//			
//		}

	}

}
