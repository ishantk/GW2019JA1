package com.auribises.packone;

// Access Modifiers: public, default, private and protected

public class One {
	
	private void pvtShow(){
		System.out.println(">> This is private show of One");
	}
	
	void defShow(){
		System.out.println(">> This is default show of One");
	}
	
	protected void protShow(){
		System.out.println(">> This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println(">> This is public show of One");
	}

}

// default
class Two{
	
	private void pvtShow(){
		System.out.println(">> This is private show of Two");
	}
	
	void defShow(){
		System.out.println(">> This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println(">> This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println(">> This is public show of Two");
	}

	
}

/* classes cannot be private or protected
private class Three{
	
}

protected class Four{
	
}
*/