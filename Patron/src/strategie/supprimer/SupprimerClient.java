package strategie.supprimer;

import classe.Client;
import classe.Gestion;
import strategie.ajouter.AjouterClient;

public class SupprimerClient implements ComprtementSupprimer{
	AjouterClient listeClient=AjouterClient.getClient();
	
		public  void supprimer(Gestion g) {
	Client cl=(Client) g;
			for (Client c : listeClient.liste) {
				if (c.getPermis()== cl.getPermis() ) {
				listeClient.liste.remove(c); }
			}
		}
	

}
