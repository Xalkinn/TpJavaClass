package TpJavaClass;

public class Carre{// extends Rectangle{
	
	private Point basGauche;
	private Point basDroit;
	private Point hautGauche;
	private Point hautDroit;
	private int cote;
	
	public Carre (Point point, int cote) {
		basGauche = point;
		basDroit = new Point(point.getX() + cote, point.getY());
		hautGauche = new Point(point.getX(), point.getY() + cote);
		hautDroit = new Point(point.getX() + cote,  point.getY() + cote);
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
		return "Carre";
	}
	
	public String toString() {
		return ""+getType()+" : Point bas droit "+getPointBasDroit()+" Point bas gauche "+getPointBasGauche()+" Point haut droit "+getPointHautDroit()+" Point haut gauche "+getPointHautGauche()+"";
	}
	
	public String affiche() {
		System.out.println(this.toString());
		return null;
	}
}