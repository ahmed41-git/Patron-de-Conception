package strategie.modifier;

import java.util.ArrayList;
import java.util.List;

import classe.Client;

public class ModifierClient implements ComprtementModification {
	List <Client> listeclient = new ArrayList<Client>();

	@Override
	public void modifier(int permis) {
		for (Client c : listeclient) {
			if (c.getPermis() == permis) {
				c = new Client();
			}
		}
	
	}
}
