package fabriqueDecorateur;

import classe.Vehicule;
import decorateurVehicule.SiegeAuto;

public class FabriqueSiege {

	public Vehicule creerDec(Vehicule v) {
		SiegeAuto veh= new SiegeAuto(v);
		return veh;
	}


}
