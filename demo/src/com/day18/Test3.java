package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test3 {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("c:\\doc\\data.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(new MyData("배수지", 70));
			oos.writeObject(new MyData("유인나", 50));
			oos.writeObject(new MyData("서예지", 50));
			oos.writeObject(new MyData("정인나", 30));
			oos.writeObject(new MyData("정소민", 20));
			
			oos.close();
			fos.close();//직렬화 끝
			
			System.out.println("파일 저장 완료");
			
			
			
			FileInputStream fis = new FileInputStream("c:\\doc\\data.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			MyData ob; 
			
			while (true) {
				
				ob = (MyData)ois.readObject();
				
				if (ob == null) {
					break;
				}
				
				System.out.println(ob);
				
			}
		
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			System.out.println("마지막 데이터임");
		}
		
	}

}
