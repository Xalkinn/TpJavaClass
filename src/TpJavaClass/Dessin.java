package TpJavaClass;

import java.util.ArrayList;

public class Dessin {
	private ArrayList<Figure> liste = new ArrayList<>();

	public Dessin() {

	}

	public ArrayList<Figure> getListe() {
		return liste;
	}

	public boolean add(Figure f) {
		return liste.add(f);
	}

}
