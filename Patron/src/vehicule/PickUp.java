package vehicule;

import classe.Vehicule;

public class PickUp extends Vehicule {

	public PickUp(int matricule, int prixLoc, String marque, String modele, String couleur) {
		super(matricule, prixLoc, marque, modele, couleur);
		// TODO Auto-generated constructor stub
	}
 public PickUp() {
	
}
	@Override
	public String description() {
		return " PickUp de matricucle "+this.matricule+" marque "+this.marque+" modele "+this.modele+" Prix location "+
				this.prixLoc+" couleur "+this.couleur;		
	}

}
