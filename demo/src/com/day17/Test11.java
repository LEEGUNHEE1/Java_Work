package com.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test11 {

	public boolean fileCopy(String file1, String file2) {

		File f = new File(file1);

		if (!f.exists()) {
			return false;
		}

		try {

			FileInputStream fis = new FileInputStream(file1);

			FileOutputStream fos = new FileOutputStream(file2);

			int data = 0;

			byte[] buffer = new byte[1024];

			while ((data = fis.read(buffer, 0, 1024)) != -1) {
				fos.write(buffer, 0, data);
			}

			fos.close();
			fis.close();

		} catch (Exception e) {
			System.out.println(e.toString());
			return false;

		}

		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String file1,file2;
		
		Test11 ob = new Test11();
		
		System.out.print("원본파일 : ");
		file1 = sc.next();
		System.out.print("대상파일 : ");
		file2 = sc.next();
		
		
		if (ob.fileCopy(file1, file2)) {
			System.out.println("파일 복사 성공");
			
		}else {
			System.out.println("파일 복사 실패");
		}
		

	}

}
