package TpJavaClass;

import java.util.ArrayList;

public class Rond extends Figure implements Surfacable {
	private Point centre;
	private int r; // rayon

	public Rond(Point centre, int r) {
		this.centre = centre;
		this.r = r;
	}

	public String getType() {
		return "Rond";
	}

	public String toString() {
		return "" + getType() + " : Point " + centre + " | Rayon " + r + "";
	}

	@Override
	// Affichage du point du cercle dans un tableau (le centre du cercle)
	public ArrayList<Point> getPoint() {
		ArrayList<Point> list_point = new ArrayList<>();
		list_point.add(centre);
		return list_point;
	}

	@Override
	public double surface() {
		/*
		 * Calcul de la surface grace a math.PI On peux utiliser math.pow également ce
		 * qui donne : return Math.PI * Math.pow(r, 2) Organisation de Math.Pow :
		 * Math.Pow(valeur,exposant)
		 */
		return Math.PI * r * r;
	}

	@Override
	public boolean couvre(Point p) {
		/*
		 * Ici on regarde si un Point p appartient a un Rond grace a la methode distance
		 * cree dans Point.java Cette méthode nous fais le calcul d'un segment. Si le
		 * calcul montre que ce calcul est inferieur au rayon, alors le point p fais
		 * parti du Rond
		 */
		if (p.distance(centre) <= r) {
			return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object o) {
		// Utilisation instanceof
		if (o instanceof Rond) {
			Rond rond = (Rond) o;
			// Création de booleen pour la suite afin de comparer plus facilement
			boolean memeCentre = rond.centre.equals(this.centre);
			/*
			 * Pour les primitif ci dessous on ne peux pas utiliser de méthode donc on fais
			 * une égalité
			 */
			boolean memeRayon = rond.r == this.r;
			// Si le rayon et le centre sont identique alors c'est vrai
			if (memeCentre && memeRayon)
				return true;
			else
				return false;
		} else {
			return false;
		}
	}

}
