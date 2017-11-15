package TpJavaClass;

public class Point {
	private int x;
	private int y;
	private static final int INIT_X = 25; //Static car il ne bouge pas il sont deja defini dès le debut
	private static final int INIT_Y = 25;
		
	public Point (int abscisse, int ordonnee) {
		y = ordonnee;
		x = abscisse;
	}
	
	public Point () { //initialisation des point directement égal à 25
		this(INIT_X, INIT_Y);
	}
	
	public int getX () {
		return x;
	}
	
	public int getY () {
		return y;
	}
	
	public String toString() {
		return "["+getX()+";"+getY()+"]";
	}
	
	public boolean equals(Object o) { //Equals me sert ici a voir si les point que je rentre sont identique ou non
		if(!(o instanceof Point)) {
			return false;
		}
		Point p = (Point) o;
		if(this.getX() == p.getX() && this.getY() == p.getY())
		{
			return true;
		}
		return false; //Obligatoire pour la fonction equals
	}
}
