package TpJavaClass;

public class Rond {
	private Point centre;
	private int r; // rayon

	public Rond(Point centre, int r) {
		this.centre = centre;
		this.r = r;
	}

	public String getType() {
		return "Rond";
	}

	public String toString() {
		return ""+getType() + " : Point " + centre + " | Rayon " + r + "";
	}

	public String affiche() {
		System.out.println(this.toString());
		return null;
	}
}
