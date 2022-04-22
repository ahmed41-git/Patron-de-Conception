package fabriqueDecorateur;

import classe.Vehicule;
import decorateurVehicule.Gps;

public class FabriqueGps {

	public Vehicule creerDec(Vehicule v) {
		Gps veh= new Gps(v);
		return veh;
	}

}
