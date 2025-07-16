package com.day18;

import java.awt.Color;
import java.awt.Frame;

//AWT(Abstract Windows Toolkit)
//이벤트 단위의 프로그램을 이해하기 위해서 잠깐 공부
public class Test4 extends Frame{

	public Test4() {
		
		setTitle("자바 윈도우");
		setSize(200, 300);
		setBackground(new Color(255, 255, 0));
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) throws Exception{

		new Test4();
		
		
	}

}
