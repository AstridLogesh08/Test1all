package method;

public class Mo {

	// Method Name can be same
	// Argument Data type cannot be same
	public static void main(String[] args) {
		Mo M1 = new Mo();
		M1.Mobile("Meow");
		M1.Mobile(784527735);
		M1.Snapchat("400");
	}

	public void Mobile(String contacts) {

		System.out.println("Call - " + contacts);
	}

	public void Mobile(long a) {

		System.out.println("Number - " + a);
	}

	public void Snapchat(String Snap) {
		System.out.println("Snap score =" + Snap);
	}

}
