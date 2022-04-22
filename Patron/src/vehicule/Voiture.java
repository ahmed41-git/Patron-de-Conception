package vehicule;

import classe.Vehicule;

public class Voiture extends Vehicule {

	public Voiture(int matricule, int prixLoc, String marque, String modele, String couleur) {
		super(matricule, prixLoc, marque, modele, couleur);
		// TODO Auto-generated constructor stub
	}
	public Voiture() {}

	@Override
	public String description() {
			return "Voiture de matricucle "+this.matricule+" marque "+this.marque+" modele "+this.modele+" Prix location "+
					this.prixLoc+" couleur "+this.couleur;
	}
	

}
