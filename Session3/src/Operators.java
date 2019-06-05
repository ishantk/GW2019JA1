
public class Operators {

	public static void main(String[] args) {
		
		// Controller -> Logic to solve problem
		// 1. Operators | 2. Conditions | 3. Loops
		
		// Operators:
		// Arithmetic Operators : +, -, *, /, %
		int dish1Price = 200;
		int dish2Price = 300;
		int bill = dish1Price + dish2Price;
		System.out.println("Your Bill Amount is \u20b9"+bill);
		// Assume 5% taxes to be added in bill 
		int taxes = bill * 5/100;
		System.out.println("Taxes is: \u20b9"+taxes);
		
		int totalBill = bill + taxes;
		System.out.println(">> Please pay \u20b9"+totalBill);
		
//		int data = totalBill / 5;
		int data = totalBill % 5;
		System.out.println(">> data is: "+data);
		
		// Assignment Operators : =, +=, -=, *=, /=, %=
		int num1 = 10;
//		num1 = num1 + 5;
//		num1 += 5;
		num1 %= 3;
		num1 *= 3;
		System.out.println(">> num1 is: "+num1);
		
		// Conditional Operators (if/else) : >, <, >=, <=, ==, !=
		int johnsRank = 10;
		int jenniesRank = 100;
//System.out.println(">> Is Johns Rank Greater than Jennies Rank? "+(johnsRank <= jenniesRank));
		System.out.println(">> Is Johns Rank not equal to Jennies Rank? "+(johnsRank != jenniesRank));
		
		
		// Increment and Decrement Operators
		int x = 10;
		x++; // x = x + 1;
		++x; // x = x + 1;
		x++;
		--x; // x = x - 1;
		System.out.println(">> x is: "+x); // 12, 10, 11
		
		
		int y = ++x;
		System.out.println(">> x is: "+x+" and y is: "+y);
		
		// Associativity and Precedence of Operators | Read it 
		
		// Logical Operators : &&, ||, !
		int physics = 90;
		int chemistry = 70;
		int maths = 85;
		
		System.out.println(">> Can Student be an Engineer: "+!(maths > physics || maths > chemistry));
		
		// Bitwise Operators
	}

}
