package com.day18;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test5 extends Frame implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
	}


	@Override
	public void windowClosed(WindowEvent e) {
	}


	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
	}


	@Override
	public void windowIconified(WindowEvent e) {
	}


	@Override
	public void windowOpened(WindowEvent e) {
	}


	public Test5() {
		
		setTitle("자바");
		setSize(200, 300);
		setBackground(new Color(255, 255, 0));
		
		addWindowListener(this);
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) throws Exception{

		new Test5();
		
		
	}

}
