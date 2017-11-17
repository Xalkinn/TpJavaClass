package TpJavaClass;

public class Point {
	private int x;
	private int y;
	private static final int INIT_X = 25; // Static car il ne bouge pas il sont deja defini dès le debut
	private static final int INIT_Y = 25;

	public Point(int abscisse, int ordonnee) {
		y = ordonnee;
		x = abscisse;
	}

	public Point() { // initialisation des point directement égal à 25
		this(INIT_X, INIT_Y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		return "[" + getX() + ";" + getY() + "]";
		// Afficher les coordonnees x, y du point
	}

	public boolean equals(Object o) { // Equals me sert ici a voir si les point que je rentre sont identique ou non
		if (!(o instanceof Point)) {
			return false;
		}
		Point p = (Point) o;
		if (this.getX() == p.getX() && this.getY() == p.getY())
		/*
		 * condition de vérification entre les coordonnees du point (grace à this on
		 * compare les coordonnees du constructeur Point();) et le point qui a pour
		 * coordonnee 25, 25
		 */
		{
			return true;
		}
		return false; // Obligatoire pour la fonction equals
	}

	public double distance(Point p) {
		return Math.sqrt((Math.pow(p.getX() - this.getX(), 2)) - (Math.pow(p.getY() - this.getY(), 2)));
	}

}
