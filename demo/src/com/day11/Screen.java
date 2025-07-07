package com.day11;

import java.io.IOException;
import java.util.Scanner;

public class Screen {
	Scanner sc = new Scanner(System.in);
	int i;
	public int screen(int num) throws IOException {
		
		System.out.printf("com : %d\n",num);
		System.out.print("1 : 가위, 2 : 바위, 3 : 보 ? ");
		i = sc.nextInt();
		return i;
	}
	

}
