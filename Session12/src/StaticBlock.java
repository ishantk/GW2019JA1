
public class StaticBlock {

	{
		System.out.println(">> This is Block");
	}
	
	static{
		System.out.println(">> This is static Block");
	}
	
	public static void main(String[] args) {
		
		System.out.println(">> main started");

		StaticBlock sRef = new StaticBlock();
		
		System.out.println(">> main finished");
	}

}
