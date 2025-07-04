package com.bank;

import java.util.Scanner;

public class Jumin {

	int tot,su;
	String jumin;
	int[] chk = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
	Scanner sc = new Scanner(System.in);
	Record rec = new Record();

	public String juminCheck() {
		
		do {
			System.out.print("주민번호 [xxxxxx-xxxxxxx] : ");
			jumin = sc.next();
			if (jumin.length() != 14) {
				System.out.println("틀린 주민 번호");
				juminCheck();
			}
			tot=0;
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

		} while (su != tot);

		return jumin;
	}
}
