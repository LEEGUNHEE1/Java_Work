package com.bank;

import java.util.Scanner;

public class Jumin {
	String jumin;
	int tot, su;
	int[] chk = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
	
	public void juminCheck(String jm) {
		
		Scanner sc = new Scanner(System.in);
		Record rec = new Record();	
		
		do {
			
			jumin = jm;

			tot = 0;
			for (int i = 0; i < 12; i++) {
				if (i >= 6) { // 주민번호 뒷자리
					tot += chk[i] * Integer.parseInt(jumin.substring(i + 1, i + 2));
				} else { // 주민번호 앞자리
					tot += chk[i] * Integer.parseInt(jumin.substring(i, i + 1));
				}
			}

			su = Integer.parseInt(jumin.substring(13));

			tot = 11 - (tot % 11);
			tot = tot % 10;

		} while (jumin.length() != 14 || su != tot);
		
		System.out.println("맞는 주민번호");
	}
}
