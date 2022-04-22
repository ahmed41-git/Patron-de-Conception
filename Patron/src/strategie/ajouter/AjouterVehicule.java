package strategie.ajouter;

import java.util.ArrayList;
import java.util.List;

import classe.Gestion;
import classe.Vehicule;

public  class AjouterVehicule implements CompretementAjouter {
	private static AjouterVehicule instanceAjout;
	public static synchronized AjouterVehicule getVehicule()
	{
		if(instanceAjout==null) instanceAjout= new AjouterVehicule();
		return instanceAjout;
	}
	public List <Vehicule> liste = new ArrayList<Vehicule>();
	public void ajouter(Gestion g) {
		Vehicule ve=(Vehicule) g;
		instanceAjout.liste.add(ve);
		
	}
		
	public void lister() {
		for (Vehicule vehicule : liste) {
			System.out.println(vehicule.affich());
		}
	}

}
