package TpJavaClass;

public class Carre extends Rectangle{
	
	public Carre (Point point, int cote) {
		super(point, cote, cote);
	}

	public String getType() {
		return "Carre";
	}
}