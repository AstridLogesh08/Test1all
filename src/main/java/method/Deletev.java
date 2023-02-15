package method;

public class Deletev {

	//Method with parameter
 	//FUNCTION NAME !
	//accessModifier returnType MethodName(parameter/Arguments){}
public static void main(String[] args) {
	Deletev dt = new Deletev();
	dt.Ford("Mustang");
	dt.Lamborghini().toLowerCase().trim();
}
		public void Ford(String Mustang) {
			
			System.out.println("Ford - "+ Mustang);

		}

		public String Lamborghini() {
			return "Aventador";

		}

		public boolean sharpbrake() {
			System.out.println("Sharp Brake");
			return true;
		}

	}


