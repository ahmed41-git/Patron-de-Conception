package strategie.rechercher;

import classe.Reservation;
import strategie.ajouter.AjouterReservation;
public class RechercherReservation implements CompretementRechercher{
	//List <Reservation> listereservation = new ArrayList<Reservation>();
	AjouterReservation listeReservation=AjouterReservation.getReservation();

	public void rechercher(int numRes){
		for (Reservation r : listeReservation.liste) {
			if (r.getNumRes() == numRes ) {
			r.affich(); }
		}
	}

}
