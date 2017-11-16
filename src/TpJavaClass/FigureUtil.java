package TpJavaClass;

import java.util.ArrayList;

public class FigureUtil {

	private static final int SIZE_MIN = 1;
	private static final int SIZE_MAX = 20;

	private static final int X_MIN = 0;
	private static final int X_MAX = 99;

	private static final int Y_MIN = 0;
	private static final int Y_MAX = 99;

	// Création d'un constructeur private afin d'interdire l'instanciation de cette
	// classe.
	private FigureUtil() {
	}

	private static int getRandomInteger(int min, int max) {
		return (int) Math.round(Math.random() * (max - min)) + min;
	}

	private static Point getRandomPoint(int x_min, int x_max, int y_min, int y_max) {
		int x = getRandomInteger(x_min, x_max);
		int y = getRandomInteger(y_min, y_max);
		return new Point(x, y);
	}

	public static Rond getRandomRond() {
		int rayon = getRandomInteger(SIZE_MIN / 2, SIZE_MAX / 2);
		Point centre = getRandomPoint(X_MIN, X_MAX, Y_MIN, Y_MAX);
		Rond rond = new Rond(centre, rayon);
		return rond;
	}

	public static Rectangle getRandomRectangle() {
		int largeur = getRandomInteger(SIZE_MIN, SIZE_MAX);
		int hauteur = getRandomInteger(SIZE_MIN, SIZE_MAX);
		Point basGauche = getRandomPoint(X_MIN, X_MAX, Y_MIN, Y_MAX);
		Rectangle rectangle = new Rectangle(basGauche, largeur, hauteur);
		return rectangle;
	}

	public static Carre getRandomCarre() {
		int cote = getRandomInteger(SIZE_MIN, SIZE_MAX);
		Point basGauche = getRandomPoint(X_MIN, X_MAX, Y_MIN, Y_MAX);
		Carre carre = new Carre(basGauche, cote);
		return carre;
	}

	public static Segment getRandomSegment() {
		Point debut = getRandomPoint(X_MIN, X_MAX, Y_MIN, Y_MAX);
		int longueur = getRandomInteger(SIZE_MIN, SIZE_MAX);
		boolean horizontal = getRandomInteger(0, 1) > 0.5;
		Segment segment = new Segment(debut, longueur, horizontal);
		return segment;
	}
	
	public static Figure getRandomFigure() {
		double alea = Math.random();
		if (alea < 0.25)
		{
			return getRandomCarre();
		}
		if (alea < 0.5)
		{
			return getRandomRectangle();
		}
		if (alea < 0.75)
		{
			return getRandomRond();
		}
		else 
		{
			return getRandomSegment();
		}
	}
	
	public static Surfacable getRandomSurfacable() {
		double alea = Math.random();
		if (alea < 0.33)
		{
			return getRandomCarre();
		}
		if (alea < 0.66)
		{
			return getRandomRectangle();
		}
		else return getRandomRond();	
	}
	
	public static ArrayList<Figure> genere(int nbfigure){
		ArrayList<Figure> result = new ArrayList<>();
		int i = 0 ; //Pour la boucle tant que
		while (i < nbfigure)
		{
			result.add(getRandomFigure());
			i++;
		}
		
		return result;
	}
}
