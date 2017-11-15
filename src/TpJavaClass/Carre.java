package TpJavaClass;

public class Carre extends Rectangle{ //Par exemple public class Carre extends Rectangle implements Segment (Cqfd avec moi meme)
	
	public Carre (Point point, int cote) {
		super(point, cote, cote);
	}

	public String getType() {
		return "Carre";
	}
}