package TpJavaClass;

public class Point {
	private int x;
	private int y;
	private static final int INIT_X = 25;
	private static final int INIT_Y = 25;
		
	public Point (int abscisse, int ordonnee) {
		y = ordonnee;
		x = abscisse;
	}
	
	public Point () {
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
}
