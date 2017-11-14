package tp;

public class TpJava04 {
	public static void main(String args[]) {
		float prix = Float.parseFloat(args[0]);
		float remise;

		if (prix == 0) {
			System.out.println("Pas de remise");
		} else {
			if (prix >= 1000 && prix < 2000) {
				remise = prix * (1 / 100);
				System.out.println("Remise de 1% soit " + remise);
			} else {
				if (prix >= 2000 && prix < 5000) {
					remise = prix * (3 / 100);
					System.out.println("Remise de 3% soit " + remise);
				}
				else {
					if (prix >= 5000) {
						remise = prix * (5/100);
						System.out.println("Remise de 5% soit "+ remise);
					}
				}
			}
		}
	}
}