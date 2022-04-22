package strategie.rechercher;

import classe.Client;
import strategie.ajouter.AjouterClient;

public class RechercherClient implements CompretementRechercher {
	//List <Client> listeclient = new ArrayList<Client>();
	AjouterClient listeClient=AjouterClient.getClient();

	public void rechercher(int permis) {
		for (Client c : listeClient.liste) {
			if (c.getPermis()== permis ) {
			c.Affich();; }
		
	}
	}

}
