package decorateurVehicule;

import classe.Vehicule;

public class Gps extends Decorateur {

	public Gps(Vehicule vehicule) {
		super.vehicule=vehicule;
		this.vehicule.setPrixLoc(this.vehicule.getPrixLoc()+20);
		
		}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return vehicule.description()+" Avec GPS ";
	}
	

}
