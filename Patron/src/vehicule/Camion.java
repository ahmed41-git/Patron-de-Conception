package vehicule;

import classe.Vehicule;

public class Camion extends Vehicule{

	public Camion(int matricule, int prixLoc, String marque, String modele, String couleur) {
		super(matricule, prixLoc, marque, modele, couleur);
		// TODO Auto-generated constructor stub
	}
  public Camion() {}
	@Override
	public String description() {
		return " Camion de matricucle "+this.matricule+" marque "+this.marque+" modele "+this.modele+" Prix location "+
				this.prixLoc+" couleur "+this.couleur;		
	}
	
	

}
