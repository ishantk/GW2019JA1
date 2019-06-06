import java.util.Scanner; 

// Loops : 1. while, 2. do while, 3. for (Basic , Enhanced)

public class Loops {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // System.in will performs read from console
		
		System.out.println("Enter a Number:");    // System.out performs write on console
		int number = scanner.nextInt(); // Read an Integer which user will enter on console
		
		System.out.println(">> Printing Table of "+number+" <<");
		
		scanner.close(); // To remove from memory
		/*
		int i = 1;
		System.out.println(">> "+number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(">> "+number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(">> "+number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(">> "+number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(">> "+number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(">> "+number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(">> "+number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(">> "+number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(">> "+number+" "+i+"'s are "+(number*i));
		i++;
		System.out.println(">> "+number+" "+i+"'s are "+(number*i));
		*/
		
		/*
		int i = 1;
		while(i<=10){
			System.out.println(">> "+number+" "+i+"'s are "+(number*i));
			i++;
		}
		
		System.out.println();
		
		number++;
		do{
			System.out.println(">> "+number+" "+i+"'s are "+(number*i));
			i++;
		}while(i<=10);
		
		System.out.println(">> i is: "+i); // 12
		
		number = i++;
		
		System.out.println();
		
		for(i=1;i<=10;i++){
			System.out.println(">> "+number+" "+i+"'s are "+(number*i));
		}
		
		*/
		
		for(int num = 5, i=1;i<=10;i++){
			System.out.println(">> "+num+" "+i+"'s are "+(num*i));
		}
		
	}

}
