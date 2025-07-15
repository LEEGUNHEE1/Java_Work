package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test10 {

	public static void main(String[] args) {

		// 원본파일 ? c:\\doc\\test.txt
		// 대상파일 ? c:\\doc\\test1.txt
		// 복사완료

		try {

			FileInputStream fis = new FileInputStream("c:\\doc\\test.txt");
			FileOutputStream fos = new FileOutputStream("c:\\doc\\test1.txt");

			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
				fos.flush();
			}
			
			fis.close();
			fos.close();
			System.out.println("복사완료");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
