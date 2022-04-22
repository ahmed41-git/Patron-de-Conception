package strategie.modifier;

import classe.Vehicule;
import strategie.ajouter.AjouterVehicule;

public class ModifierVehicule  implements ComprtementModification{
	
	AjouterVehicule listeVehicule= AjouterVehicule.getVehicule();

	public void modifier(int mat) {
		for (Vehicule v : listeVehicule.liste) {
			if (v.getMatricule()== mat ) {
			//v = new Vehicule(); 
			}
	}

} }
