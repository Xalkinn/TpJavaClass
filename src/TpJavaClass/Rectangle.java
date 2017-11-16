package TpJavaClass;

import java.util.ArrayList;

public class Rectangle extends Figure implements Surfacable{
	private Point basGauche;
	private Point basDroit;
	private Point hautGauche;
	private Point hautDroit;
	private int hauteur;
	private int largeur;
	
	public Rectangle (Point point, int largeur, int hauteur) {
		basGauche = new Point(point.getX(), point.getY());
		basDroit = new Point(point.getX() + largeur, point.getY());
		hautGauche = new Point(point.getX(), point.getY() + hauteur);
		hautDroit = new Point(point.getX() + largeur,  point.getY() + hauteur);
		this.hauteur = hauteur;
		this.largeur = largeur;
	}
	
	public int getHauteur() {
		return hauteur;
	}


	public int getLargeur() {
		return largeur;
	}


	public Point getPointBasGauche() {
		return basGauche;
	}
	
	public Point getPointBasDroit() {
		return basDroit;
	}
	
	public Point getPointHautGauche() {
		return hautGauche;
	}
	
	public Point getPointHautDroit() {
		return hautDroit;
	}
	
	public String getType() {
		return "Rectangle";
	}
	
	public String toString() {
		return ""+getType()+" : Point bas droit "+getPointBasDroit()+" Point bas gauche "+getPointBasGauche()+" Point haut droit "+getPointHautDroit()+" Point haut gauche "+getPointHautGauche()+"";
	}

	@Override
	public ArrayList<Point> getPoint() {
		ArrayList<Point> list_point = new ArrayList<>();
		list_point.add(getPointBasDroit());
		list_point.add(getPointBasGauche());
		list_point.add(getPointHautDroit());
		list_point.add(getPointHautDroit());
		return list_point;
		/*return new ArrayList<Point> ();
		 *getPointBasDroit(), getPointBasGauche(), getPointHautDroit(), getPointHautGauche());	
		*/
	}

	@Override
	public double surface() {
		return largeur * hauteur;
	}

}
