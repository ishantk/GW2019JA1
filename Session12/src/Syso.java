class SSystem{
	
	static PPrintStream oout = new PPrintStream();
	
}

class PPrintStream{
	
	void pprintln(String data){
		System.out.println(data);
	}
	
}


public class Syso {

	public static void main(String[] args) {
		
		System.out.println("This is Awesome");
		SSystem.oout.pprintln("This is also Awesome");
	}

}
