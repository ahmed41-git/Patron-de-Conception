package fabriqueDecorateur;

import classe.Vehicule;
import decorateurVehicule.Carburant;

public class FabriqueCarburant extends FabriqueDecor {

	@Override
	public Vehicule creerDec(Vehicule v) {
		Carburant veh= new Carburant(v);
		return veh;
	}

}
