package com.auribises;

import java.net.Socket;
import java.io.DataOutputStream;
import java.util.Scanner;

// Java Client Application
class MyClient{

	public static void main(String[] args) {
		try{
				
			Socket socket = new Socket("localhost", 9090);	
			DataOutputStream stream = new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("What you would like to send?");
			String message = scanner.nextLine();

			stream.writeUTF(message);
			stream.flush();
			stream.close();
			socket.close();
			scanner.close();
			System.out.println("Message Sent");
				
		}catch(Exception e){
			System.out.println("Exception:"+e);
			e.printStackTrace();
		}
	
	}

}