package strategie.ajouter;

import java.util.ArrayList;
import java.util.List;

import classe.Client;
import classe.Gestion;


public class AjouterClient implements CompretementAjouter  {
public List <Client> liste = new ArrayList<Client>();
	private static AjouterClient instanceAjout;
	public static synchronized AjouterClient getClient()
	{
		if(instanceAjout==null) instanceAjout= new AjouterClient();
		return instanceAjout;
	}
	public void ajouter( Gestion g) {
		Client cl=(Client) g;
		instanceAjout.liste.add(cl);
	}
	public void lister() {
		for (Client client : liste) {
			System.out.println(client.Affich());
		}
	}
	

}
