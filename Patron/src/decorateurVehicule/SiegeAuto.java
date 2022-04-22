package decorateurVehicule;

import classe.Vehicule;

public class SiegeAuto extends Decorateur {

	public SiegeAuto(Vehicule vehicule) {
		super.vehicule=vehicule;
		this.vehicule.setPrixLoc(this.vehicule.getPrixLoc()+50);
		
		}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return vehicule.description()+" Avec siege auto ";
	}

}
