package TpJavaClass;

public enum Couleur {
	Rouge("R"), Vert("V"), Bleu("B"), Jaune("J"), Noir("N");
	private String codage;
	
	public static Couleur getCouleurDefaut() {
		return Noir;
	}
	
	Couleur(String initial) {
		codage = initial;
	}
	
	public String getCodage() {
		return "" + codage;
	}
}


