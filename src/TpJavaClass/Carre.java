package TpJavaClass;

public class Carre extends Rectangle{ //Par exemple public class Carre extends Rectangle implements Segment
	
	public Carre (Point point, int cote) {
		super(point, cote, cote);
	}

	public String getType() {
		return "Carre";
	}
}