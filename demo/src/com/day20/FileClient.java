package com.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
	public static void main(String[] args) {
		int port = 7777;
		String host = "192.168.0.34";
		
		Socket sc= null;
		ObjectOutputStream oos = null;
		Scanner scn = new Scanner(System.in);

		String file;

		try {

			// c:\\doc\\a.txt
			System.out.print("전송할 파일경로및 파일명");
			file = scn.next();

			File f = new File(file);

			if (!f.exists()) {

				System.out.println("파일이 없습니다");
				System.exit(0);
				
			}
			//서버연결
			sc = new Socket(host,port);
			oos = new ObjectOutputStream(sc.getOutputStream());
			oos.flush();
			
			//파일 전송 시작
			FileInfo info = null;
			
			info = new FileInfo();
			info.setCode(100);
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			
			System.out.println(f.getName() + " 파일 전송 시작..");
			
			Thread.sleep(30);
			
			//파일내용 전송
			
			FileInputStream fis = new FileInputStream(f);
			
			int data = 0;
			byte[] buffer = new byte[1024];
			
			while ((data=fis.read(buffer,0,1024))!=-1) {
				
				info = new FileInfo();
				
				info.setCode(110);
				info.setSize(data);
				info.setData(buffer);
				
				oos.writeObject(info);
				System.out.println(data + "bytes 전송중..");
				
				buffer = new byte[1024];
				Thread.sleep(300);
				
			}
			fis.close();
			
			//파일전송 종료
			info = new FileInfo();
			info.setCode(200);
			info.setSize((int)f.length());
			info.setData(f.getName().getBytes());
			
			oos.writeObject(info);
			System.out.println("파일전송 끝..");
			
			Thread.sleep(300);
			
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}

	}

}
