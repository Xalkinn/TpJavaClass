package TpJavaClass;

import java.util.ArrayList;

public class Rond extends Figure implements Surfacable {
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

	@Override
	public ArrayList<Point> getPoint() {
		ArrayList<Point> list_point = new ArrayList<>();
		list_point.add(centre);
		return list_point;
	}

	@Override
	public double surface() {
		return Math.PI * r * r;
	}


}
