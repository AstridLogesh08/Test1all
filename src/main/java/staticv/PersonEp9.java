package staticv;

public class PersonEp9 {

	public static void eat() {
		System.out.println("Eat stommach fully");
	}

	void sleep() {
		System.out.println("Sleep Peacefully");
	}

	public static void main(String[] args) {
		PersonEp9 ep = new PersonEp9();
		ep.sleep();
		ep.eat();

	}

}
