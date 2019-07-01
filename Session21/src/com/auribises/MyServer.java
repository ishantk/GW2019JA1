package com.auribises;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;

// Java Server Application
class MyServer{

	public static void main(String[] args) {
		try{
			ServerSocket serverSocket = new ServerSocket(9090);	
			System.out.println("Server Started...");
			Socket socket = serverSocket.accept();	
			DataInputStream stream = new DataInputStream(socket.getInputStream());
			String message = (String)stream.readUTF();
			System.out.println("Message Received: "+message);
			stream.close();
			serverSocket.close();
		}catch(Exception e){
			System.out.println("Exception:"+e);
			e.printStackTrace();
		}
	
	}

}