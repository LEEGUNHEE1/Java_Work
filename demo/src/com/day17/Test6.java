package com.day17;

import java.io.IOException;
import java.io.OutputStream;

//바이트스트림(out)
public class Test6 {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out;
		
		byte[] b = new byte[3]; //buffer
		
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		os.write(b);
		os.close();
		
		System.out.println("hi");
		
		
		
		
	}

}
