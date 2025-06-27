package com.java_prac;

import java.util.Scanner;

public class BankApplication {
	private static Account[] acAy = new Account[100];

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		

		boolean run = true;
		
		int num;
		
		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			num = sc.nextInt();
			
			switch (num) {
			case 1:
				createAc();
				break;
			case 2:
				acList();
				break;
			case 3:
				acAdd();
				break;
			case 4:
				acMi();
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
				
			default:
				break;
			}
			
		}
		
	}

	private static void createAc() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");

		System.out.print("계좌번호 : ");
		String acNum = sc.next();

		System.out.print("계좌주 : ");
		String acName = sc.next();

		System.out.print("초기입금액 : ");
		int fb = sc.nextInt();

		Account ac = new Account(acNum, acName, fb);
		
		for (int i = 0; i < acAy.length; i++) {
			if (acAy[i]== null) {
				acAy[i] = ac;
			}
			break;
		}
		
		System.out.println("계좌가 생성됨");

	}
	private static void acList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		
		for (int i = 0; i < acAy.length; i++) {
			Account ac = acAy[i];
			if (acAy[i] != null) {
				System.out.println(ac.getNum() + " " + ac.getName() + " " + ac.getBalance());
				System.err.println();
			}
			
			
			break;
			
		}
	}
	
	private static void acAdd() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		
		System.out.print("계좌번호 : ");
		String acN = sc.next();
		for (int i = 0; i < acAy.length; i++) {
			if (acAy[i] != null) {
				if (acN.equals(acAy[i].getNum()) ) {
					
					System.out.print("예금액 : ");
					int acAdd = sc.nextInt();
					int result = acAy[i].getBalance() + acAdd;
					acAy[i].setBalance(result);
				}
			}
		}
		
	}
	
	private static void acMi() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		
		System.out.print("계좌번호 : ");
		String acN = sc.next();
		for (int i = 0; i < acAy.length; i++) {
			if (acAy[i] != null) {
				if (acN.equals(acAy[i].getNum()) ) {
					
					System.out.print("출금액 : ");
					int acMi = sc.nextInt();
					if (acMi < acAy[i].getBalance()) {
						int result = acAy[i].getBalance() - acMi;
						acAy[i].setBalance(result);
						System.out.println("출금 성공");	
					}else {
						System.out.println("출금 실패");
					}
					
				}
			}
		}
		
	}
	

}
