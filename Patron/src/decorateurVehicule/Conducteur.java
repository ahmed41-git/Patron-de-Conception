package decorateurVehicule;

import classe.Vehicule;

public class Conducteur extends Decorateur {

	public Conducteur(Vehicule vehicule) {
		super.vehicule=vehicule;
		this.vehicule.setPrixLoc(this.vehicule.getPrixLoc()+100);
		
		}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return vehicule.description()+" Avec un conducteur ";
	}

}
