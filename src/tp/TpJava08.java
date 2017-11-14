package tp;

public class TpJava08 {
	public static void main(String args[]) {
		int nombre = Integer.parseInt(args[0]);
		int compteur = 0; //Variable pour la boucle
		boolean premier;
		int premierpotentiel = 0;
		
		while (compteur < nombre) {
			premier = true;
			for (int divisieurpotentiel=2; divisieurpotentiel< premierpotentiel; divisieurpotentiel++) {
				if(premierpotentiel%divisieurpotentiel==0) {
					premierpotentiel++;
					premier = false;
				}
			}
			if(premier) {
				System.out.println(premierpotentiel);
				compteur++;
			}
			premierpotentiel++;
		}
	}
}
