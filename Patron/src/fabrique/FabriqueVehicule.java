package fabrique;

import classe.Vehicule;
import strategie.ajouter.AjouterClient;
import strategie.ajouter.AjouterVehicule;
import vehicule.Camion;
import vehicule.Fourgonette;
import vehicule.PickUp;
import vehicule.Voiture;


public class FabriqueVehicule extends Fabrique{
	AjouterVehicule listeVehicule= AjouterVehicule.getVehicule();
	AjouterClient listeClient= AjouterClient.getClient();
	public Vehicule creer(String typeVehicule,int matricule, int prixLoc, String marque, String modele, String couleur) {
		Vehicule v = null;
		 switch(typeVehicule)
	        {
	            case "voiture":v = new Voiture(matricule,prixLoc,marque,modele,couleur);break;
	            case "camion":v = new Camion(matricule,prixLoc,marque,modele,couleur);break;
	            case "fourgonette":v = new Fourgonette(matricule,prixLoc,marque,modele,couleur);break;
	            case "pick-up":v= new PickUp(matricule,prixLoc,marque,modele,couleur);break;

	        }
		 listeVehicule.liste.add(v);
		  v.notiferObservateurs(listeClient.liste);

	        return v;
	}
}
