package com.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferWriter {

	public static void main(String[] args) throws IOException {
		//사용자가 입력한 이름,국어,영어 점수 입력받아 이름과 총점을 출력해라
		
				//선언
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				String name;
				int kor,eng;
				int tot;
				
				//입력
				
				System.out.print("이름?");
				name = br.readLine();
				System.out.print("국어?");
				kor = Integer.parseInt(br.readLine());
				System.out.print("영어?");
				eng = Integer.parseInt(br.readLine());
				
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
				
				bw.write("이름은" + name + "\n국어점수는" + String.valueOf(kor)+"\n영어점수는" + String.valueOf(eng));
				bw.newLine();
				bw.flush();
				bw.close();
				
	}

}
