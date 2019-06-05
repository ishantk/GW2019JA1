
public class DataTypes {

	public static void main(String[] args) {
		
		/*
		 	Number:
		 	byte	8bits
		 	short   16bits
		 	int     32bits
		 	long 	64bits
		 
		 	byte : 8bits -> 2pow8
		 	256/2 -> -128 to 0 to 127
		 
		 */
		
		byte number = 127;
		System.out.println("number is: "+number);
		
		long phoneNumber = 9915571177l;
		
		int johnsPhoneNumber = (int)phoneNumber; // DownCasting
		System.out.println(johnsPhoneNumber);
		
		//long age = (long)number;	// UpCasting
		long age = number;	// UpCasting
		

		byte jacksAge = (byte)129; // DwonCasting
		System.out.println("Jacks Age is: "+jacksAge);
		
	}

}
