package fabrique;

import classe.Vehicule;
import vehicule.PickUp;

public class FabriquePickUp extends Fabrique implements FabriqueVehicule{
	AjouterVehicule listeVehicule=AjouterVehicule.getVehicule();
	public Vehicule creer(int matricule, int prixLoc, String marque, String modele, String couleur) {
		   Vehicule vehicule = new PickUp(matricule, prixLoc, marque, modele, couleur);
		   listeVehicule.add(vehicule);
		   return vehicule;
	}

}
