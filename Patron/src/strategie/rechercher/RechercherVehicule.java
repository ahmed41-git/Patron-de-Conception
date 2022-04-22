package strategie.rechercher;


import classe.Vehicule;
import strategie.ajouter.AjouterVehicule;

public class RechercherVehicule implements CompretementRechercher {
	AjouterVehicule listeVehicule= AjouterVehicule.getVehicule();

	public void rechercher(int mat) {
		for (Vehicule v : listeVehicule.liste) {
			if (v.getMatricule() == mat) {
				v.affich();
			}
		}
	}

}
