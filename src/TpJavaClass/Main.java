package TpJavaClass;

public class Main {
	public static void main(String args[]) {

		Point p1 = new Point(5, 2);
		System.out.println("Coordonnees du point : " + p1);
		System.out.println("Abscisse : " + p1.getX()); // Affichage de l'abscisse
		System.out.println("Ordonnee : " + p1.getY()); // Affichage de l'ordonnee

		Rond rd1 = new Rond(p1, 4);
		rd1.affiche();

		Rectangle rt1 = new Rectangle(new Point(10, 3), 2, 6);
		rt1.affiche();

		Carre rr1 = new Carre(new Point(), 6);
		rr1.affiche();

		Object o = new Point(6, 2); // Comparaison avec les point de la ligne 6
		System.out.println(p1.equals(o));

		Figure f = new Rond(new Point(), 6);
		f.affiche();
		/*
		 * En gros f.affiche() va dire ok j'existe je vais dans "new Rond" juste au
		 * dessus Je suis dans rond je ne vois pas de affiche(), je vais donc dans
		 * Figure.java Une fois dans Figure.java je vois que affiche() existe je fais
		 * donc le toString Je reviens dans Rond, le toString est présent Je peux donc
		 * utiliser la fonction affiche() sans problème
		 */

		System.out.println(Couleur.Bleu);
		System.out.println(Couleur.getCouleurDefaut());
		
		MonThread t1 = new MonThread("1", 15);
		MonThread t2 = new MonThread("2", 25);
		t1.start();
		t2.start();

	}
}
