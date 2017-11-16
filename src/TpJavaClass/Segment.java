package TpJavaClass;

import java.util.ArrayList;

public class Segment extends Figure {

	private Point debut;
	private Point fin;
	private int longueur;
	private boolean horizontale; // D�finir le segment comme horizontal ou vertical selon un bool�en

	public Segment(Point debut, int longueur, boolean horizontale) {
		this.debut = debut;
		this.longueur = longueur;
		this.horizontale = horizontale;
		// J'utilise longueur et horizontale pour garder en m�moire les valeurs

		if (horizontale)
		/*
		 * Le SI ici va me permettre de selon le boolean l'orientation du segment Si
		 * true => le segment est horizontale Si False => le segment est verticale
		 */
		{
			fin = new Point(debut.getX() + longueur, debut.getY());
			// D�finition du point sur l'axe des abscisse. En gros pour le point de fin nous
			// partons du point de d�but et faisans la longueur pour avoir le point de fin
		} else {
			fin = new Point(debut.getX(), debut.getY() + longueur);
			// M�me principe que au dessus sauf qu'ici le point est d�fini sur l'axe des
			// ordonnee
		}
	}

	@Override
	public String getType() {
		return null;
	}

	@Override
	public ArrayList<Point> getPoint() {
		ArrayList<Point> list_point = new ArrayList<>();
		list_point.add(debut);
		list_point.add(fin);
		return list_point;
	}

	@Override
	public boolean couvre(Point p) {
		// TODO Auto-generated method stub
		return false;
	}

}
