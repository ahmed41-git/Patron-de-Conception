package strategie.supprimer;


import classe.Gestion;
import classe.Vehicule;
import strategie.ajouter.AjouterVehicule;
public class SupprimerVehicule implements ComprtementSupprimer{
	AjouterVehicule listeVehicule= AjouterVehicule.getVehicule();
	public  void supprimer(Gestion g) {
		Vehicule vi= (Vehicule) g;
		for (Vehicule v : listeVehicule.liste) {
			if (v.getMatricule()== vi.getMatricule() ) {
			listeVehicule.liste.remove(v); }
		}
	}

}
