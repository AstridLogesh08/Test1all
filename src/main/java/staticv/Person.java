package staticv;

public class Person {

	int x = 0;
	static int y = 0;

	void people() {
		x++;
		y++;
		System.out.println("Non static = " + x + "static =" + y);
	}

	public static void main(String[] args) {
		Person ls = new Person();
		ls.people();
		ls.people();

		Person ls2 = new Person();
		ls2.people();
		ls2.people();

		Person ls3 = new Person();
		ls3.people();
		ls3.people();

	}

}
