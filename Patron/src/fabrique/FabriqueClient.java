package fabrique;


import classe.Client;
import strategie.ajouter.AjouterClient;

public class FabriqueClient extends Fabrique{

	AjouterClient listeClient=AjouterClient.getClient();
	public Client creer(int permis, String tel,String nom,String prenom,String adresse)  {
		Client client = new Client(permis,tel,nom,prenom,adresse);
		listeClient.liste.add(client);
		return client;
	}

}
