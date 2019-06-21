package com.auribises.main;

import com.auribises.controller.FileHandling;

public class SourceCodeGenerator {

	public static void main(String[] args) {
	
		String javaSourceCode = "public class YourApp{"
				+ "\n\n\t"
				+ "public static void main(String[] args){"
				+ "\n\n"
				+ "\t}"
				+ "\n"
				+ "}";
		//System.out.println(javaSourceCode);
		
		FileHandling fRef = new FileHandling();
		//fRef.writeInFile(javaSourceCode);
		//fRef.writeInFileAgain(javaSourceCode);
		
		//fRef.readFromFile();
		fRef.readFromFileAgain();
		
		// HW: 1. Create a Java Program which can generate multiple source codes with Hello World
		//        User will give inputs to choose any programming language as below:
		// 		  1. C++, 2. Java, 3. Python 4. Go, 5. Scala, 6. Dart, 7. Kotlin, 8. Ruby
		
		//     2. Create a Java Program which counts number of functions in a java source file
		//		  Customer.java has 3 functions :)
		

	}

}
