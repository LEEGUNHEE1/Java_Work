package com.day19;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.swing.border.Border;

public class ChatCS extends Frame 
	implements ActionListener,Runnable{
	
	private MulticastSocket ms = null;
	private InetAddress xGroup = null;
	
	private String host = "230.0.0.5";
	private int port = 7777;
	private String userName = "이건희";
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	//DatagramSocket : UDP로 데이터그램 패킷을 전송하거나 수신하는 기능
	//DatagramPacket : UDP를 이용하여 전송될 수 있는 데이터
	//MulticastSocket : 다수의 클라이언트에 데이터그램을 전송
	//그룹범위 : Dclass(224.0.0.0~239.255.255.255)
	
	public ChatCS() {
		
		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		
		ta.setEditable(false);//ta비활성화
		add(ta,BorderLayout.CENTER);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("그룹채팅 [" + host + "]");
		setSize(400, 400);
		setVisible(true);
		tf.requestFocus();
		
	}
	
	public void setup() {
		
		try {
			
			xGroup = InetAddress.getByName(host);
			ms = new MulticastSocket(port);
			
			ms.joinGroup(xGroup);//같은그룹끼리 송수신이 가능해짐
			
			Thread th = new Thread(this);
			th.start();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void disConnection() {
		
		try {
			
			ms.leaveGroup(xGroup);
			ms.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	public static void main(String[] args) {
		new ChatCS().setup();
	}

	@Override
	public void run() {
		
		try {
		
			while(true) {
				
				byte[] buffer = new byte[512];
				
				//전송받을 패킷
				DatagramPacket dp = 
						new DatagramPacket(buffer, buffer.length);
				
				ms.receive(dp);
				
				String str = new String(dp.getData()).trim();
				ta.append(str + "\r\n");
				
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
			disConnection();
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = tf.getText().trim();
		
		if(str.equals("")) {
			return;
		}
		
		byte[] buffer = (userName + "]" + str).getBytes();
		
		try {
		
			DatagramPacket dp = 
					new DatagramPacket(buffer, buffer.length,xGroup,port);
			
			ms.send(dp);
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			System.out.println(e2.toString());
		}		
		
	}

}