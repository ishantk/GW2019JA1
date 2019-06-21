package com.auribises.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling {
	
	// 1. Input and Output Stream : Data is written in the form of bytes
	//	  This can also process characters
	
	// 2. Reader and Writer Stream: Data is written in the form of characters
	//	  This can only and only process characters
	
	public void writeInFile(String data){
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/MyApp.java");
			FileWriter writer = new FileWriter(file);
			//FileWriter writer = new FileWriter(file, true); // true is append mode enabled
			writer.write(data);
			writer.close();
			System.out.println(">> Data Written");
			
		} catch (Exception e) {
			System.out.println(">> Exception is: "+e);
		}
	
	}
	
	public void writeInFileAgain(String data){
		
		try {
			
			// bytes as in audio/video/pdf
			File file = new File("/Users/ishantkumar/Downloads/YourApp.java");
			FileOutputStream stream = new FileOutputStream(file);
			//FileOutputStream stream = new FileOutputStream(file, true); // true is append mode enabled
			stream.write(data.getBytes());
			stream.close();
			System.out.println(">> Data Written");
			
		} catch (Exception e) {
			System.out.println(">> Exception is: "+e);
		}
		
	}

	public void readFromFile(){
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/MyApp.java");
			File file = new File("/Users/ishantkumar/Documents/Edureka/GW2019JA1/Session15/src/com/auribises/model/Customer.java");
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line = "";
			
			while((line = buffer.readLine()) !=null){
				System.out.println(line);
			}
			
			buffer.close();
			reader.close();
				
		} catch (Exception e) {
			System.out.println(">> Exception is: "+e);
		}
		
	}
	
	public void readFromFileAgain(){
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/MyApp.java");
			File file = new File("/Users/ishantkumar/Documents/Edureka/GW2019JA1/Session15/src/com/auribises/model/Customer.java");
			FileInputStream stream = new FileInputStream(file);
		
			int i = 0;
			// Byte by Byte | HW: Explore how can we read lot of bytes together
			while((i = stream.read()) != -1){
				System.out.print((char)i);
			}
			
			stream.close();
				
		} catch (Exception e) {
			System.out.println(">> Exception is: "+e);
		}
		
	}
	
}
