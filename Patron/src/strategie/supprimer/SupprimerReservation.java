package strategie.supprimer;

import classe.Gestion;
import classe.Reservation;
import strategie.ajouter.AjouterReservation;
public class SupprimerReservation implements ComprtementSupprimer {
	AjouterReservation listeReservation=AjouterReservation.getReservation();
	public void supprimer(Gestion g) {
		Reservation r= (Reservation) g;
		for (Reservation re : listeReservation.liste) {
			if (re.getNumRes() == r.getNumRes() ) {
			listeReservation.liste.remove(r); }
		}
	}

}
