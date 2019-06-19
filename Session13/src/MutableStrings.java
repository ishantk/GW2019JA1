
public class MutableStrings {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		str.concat(" World");
		System.out.println(">> str is "+str);
		
		// Object Way:
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		System.out.println(">> builder is "+builder);
		
		// THREAD-SAFE i.e. SYNCHRONIZED
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		System.out.println(">> buffer is "+buffer);
		
		// HW: Explore same methods of String in these 2 above classes :)

	}

}
