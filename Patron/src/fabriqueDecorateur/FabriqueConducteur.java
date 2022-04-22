package fabriqueDecorateur;

import classe.Vehicule;
import decorateurVehicule.Conducteur;

public class FabriqueConducteur {

	public Vehicule creerDec(Vehicule v) {
		Conducteur veh= new Conducteur(v);
		return veh;
	}

}
