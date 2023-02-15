package instance;

public class Variable {

	int c; //Instance variable, need not to be initialized
	// Default value 0
	// instance variable  is also called as Global variable
	//local variable cannot be used without initializing, but Instance variable can be used
	
	void add(int a,int b) {
		int c = 25;
	System.out.println(this.c);
	System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Variable ls = new Variable();
		ls.add(15, 45);
		
		
	}
	
	
	
	
	
	
	
	
}
