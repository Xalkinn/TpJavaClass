package tp;

public class TpJava06 {
	public static void main(String args[]) {
		int nombre = Integer.parseInt(args[0]);
		do{
			for (nombre=0; nombre < 10; nombre++)
			System.out.println(nombre);
		}
		while (nombre < 10);
	}
}