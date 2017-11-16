package TpJavaClass;

import java.util.ArrayList;

public abstract class Figure {
	
	public abstract String getType(); //Ici se trouve la fonction commune au Rond rectangle
	
	public String affiche() { //Idem pour le getType
		System.out.println(this.toString());
		return null;
	}
	
	public abstract ArrayList<Point> getPoint();
	//Fonction qui serons dispo pour Carre.java, Rectangle.java, Rond.java et Segment.java
}
