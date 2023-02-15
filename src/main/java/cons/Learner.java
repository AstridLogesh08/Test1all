package cons;

public class Learner { // Default constructor
						// Without Return type
						// Constructor can be used to set Values
//public Learner() { //Default
	// this.x=1000;
	// }
	public Learner(int x, String name) { // Created constructor
		this.x = x;
		this.s = name;

	}

	public Learner(double y) {
		this.y = y;

	}

	int x;
	double y;
	boolean z;
	long a;
	String s;

	void display() {
		System.out.println(x + s);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);

	}

	public static void main(String[] args) {
		Learner ln = new Learner(100, "logesh");
		ln.display();
		Learner ln1 = new Learner(9.9);
		ln.display();

	}

}
