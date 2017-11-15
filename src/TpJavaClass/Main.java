package TpJavaClass;

public class Main {
	public static void main (String args[]) {
		
		Point p1 = new Point(5, 2);
		System.out.println("Coordonnees du point : " + p1);
		System.out.println("Abscisse : " + p1.getX()); //Affichage de l'abscisse 
		System.out.println("Ordonnee : " + p1.getY()); //Affichage de l'ordonnee
		
		Rond rd1 = new Rond (p1, 4);
		rd1.affiche();
		
		Rectangle rt1 = new Rectangle(new Point(10, 3), 2, 6);
		rt1.affiche();
		
		Carre rr1 = new Carre(new Point(), 6);
		rr1.affiche();
		
		Object o = new Point (6, 2); //Comparaison avec les point de la ligne 6
		System.out.println(p1.equals(o));
	}
}
