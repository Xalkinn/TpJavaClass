package TpJavaClass;

public class Rectangle extends Figure {
	private Point basGauche;
	private Point basDroit;
	private Point hautGauche;
	private Point hautDroit;	
	
	public Rectangle (Point point, int largeur, int hauteur) {
		basGauche = new Point(point.getX(), point.getY());
		basDroit = new Point(point.getX() + largeur, point.getY());
		hautGauche = new Point(point.getX(), point.getY() + hauteur);
		hautDroit = new Point(point.getX() + largeur,  point.getY() + hauteur);
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
	public Point[] getPoint() {
		return new Point[] {getPointBasDroit(), getPointBasGauche(), getPointHautDroit(), getPointHautGauche()};
	}
}
