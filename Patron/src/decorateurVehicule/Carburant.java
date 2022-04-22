package decorateurVehicule;

import classe.Vehicule;

public class Carburant extends Decorateur{

	public Carburant(Vehicule vehicule) {
		super.vehicule=vehicule;
		this.vehicule.setPrixLoc(this.vehicule.getPrixLoc()+60);
		
		}

	public String description() {
		return vehicule.description()+" Avec du Carburant ";

	}
	
}
