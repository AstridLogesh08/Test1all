package cons;

public class Demo {
	protected Demo(int x) {
		this.x = x;
	}
	public Demo(int x, String s) {
		this.x = x;
		this.name = s;
	}

	int x;
	String name;

	void display() {
		System.out.println(x+ "--> "+ name);
	}
	public static void main(String[] args) {
		Demo ls = new Demo(1000);
		ls.display();
		Demo ls1 = new Demo(100, "ASTRID");
		ls1.display();
	}
}
