package tp;

public class TpJava05 {
	public static void main(String args[]) {
		
		int valeur = Integer.parseInt(args[0]);
		switch(valeur) {
		case 0:
			System.out.println("Pas de sac");
			break;
		case 1:
			System.out.println("Le poid est petit");
			break;
		case 2:
			System.out.println("Le poid est moyen");
			break;
		default:
			System.out.println("Le poid est grand");
			break;
		}
	}
}
