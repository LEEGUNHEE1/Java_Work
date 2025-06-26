package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//1에서부터 사용자가 입력한 숫자까지의 합
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int su;
		int sum =0;
		char ch;
		boolean a = true;
		boolean b;
		
		
		while (a) {
			do {
				System.out.print("원하는 수 [1~5000] : ");
				su = Integer.parseInt(br.readLine()); // 2회차때부터 enter가 남아있어서 에러남
				
			} while (su < 1 || su > 5000);
			
			for (int i = 1; i <= su; i++) {
				sum += i;
				
			}
			System.out.printf("%d부터 %d까지 합 : %d\n",1,su,sum);
			
//			System.out.print("계속할래? [Y/N]");
//			ch = (char)System.in.read(); //enter 는 \r(13) + \n(10), 얘는 1바이트만 읽어서 enter가 남음
//			
//			if (ch != 'Y' && ch != 'y') { // 양 쪽이 부정이면 무조건 &&
//				System.out.println("종료합니다.");
//				break; //while,do~while,for,switch
//			}
//			System.in.skip(2); // enter 아스키값 (10,13) 두개 지움
			
			
			do {
				b = false;
				System.out.print("계속 하시겠습니까? (Y/N) : ");
				ch = (char) System.in.read();
				
				if (ch == 78) {
					System.out.println("끝");
					a = false;
				}else if (ch == 89) {
					sum = 0;
					System.in.skip(2);
				}else {
					System.out.println("Y 혹은 N을 입력하세요");
					System.in.skip(2);
					b = true;
				}
			} while (b);
			
		} 
		
		
	}

}
