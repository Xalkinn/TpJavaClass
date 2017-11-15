package TpJavaClass;

public abstract class Figure {
	
	public abstract String getType(); //Ici se trouve la fonction commune au Rond rectangle
	
	public String affiche() { //Idem pour le getType
		System.out.println(this.toString());
		return null;
	}
}
