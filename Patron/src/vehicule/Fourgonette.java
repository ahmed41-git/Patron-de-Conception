package vehicule;

import classe.Vehicule;

public class Fourgonette extends Vehicule {

	public Fourgonette(int matricule, int prixLoc, String marque, String modele, String couleur) {
		super(matricule, prixLoc, marque, modele, couleur);
		// TODO Auto-generated constructor stub
	}
	 public Fourgonette() {
		
	 }
	@Override
	public String description() {
		return " Fourgonette de matricucle "+this.matricule+" marque "+this.marque+" modele "+this.modele+" Prix location "+
				this.prixLoc+" couleur "+this.couleur;		
	}
	

}
