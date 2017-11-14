package tp;

public class TpJava07 {
	public static void main(String args[]) {
		int nombre = Integer.parseInt(args[0]);
		int factorielle = nombre;
		
		for (int compteur = 1; compteur < nombre; compteur++) {
			factorielle = compteur * factorielle;
		}
		System.out.println(factorielle);
	}
}
