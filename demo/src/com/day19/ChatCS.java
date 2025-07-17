package com.day19;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.MulticastSocket;

//그룹채팅
public class ChatCS extends Frame implements ActionListener,Runnable{

	private MulticastSocket ms = null;
	private InetAddress xGroup = null;
	
	private String host = "230.0.0.1";//이 ip주소 가진 사람들만 입장가능
	private int port = 7777;
	private String userName = "이건희";
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	//DatagramSocket: UDP로 데이터그램 패킷을 전송하거나 수신
	//DatagramPacket: UDP를 이용해 전송될수있는 데이터
	//MulticastSocket:다수의 클라이언트에 데이터그램 전송
	//그룹범위 : Dclass(224.0.0.0~239.255.255.255)
	
	public static void main(String[] args) {

	}
	
	@Override
	public void run() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

	

}
