package com.day18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test6 extends Frame{

	
	private Button btn;
	private TextArea ta;
	private TextField tf;
	
	public Test6() {

		tf = new TextField();
		ta = new TextArea();
		btn = new Button("추가");
		
		add(tf,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		addWindowListener(new MyWindowAdapter());
		setTitle("자바 윈도우");
		setSize(200, 300);
		
		
		setVisible(true);
		
	}
	
	class MyWindowAdapter extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			
			System.exit(0);
		}
		
		
		
	}
	
	public static void main(String[] args) throws Exception{

		new Test6();
		
		
	}

}
