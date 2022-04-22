package fabrique;


import classe.Reservation;
import strategie.ajouter.AjouterReservation;

public class FabriqueReservation extends Fabrique {
AjouterReservation listeReservation=AjouterReservation.getReservation();
	public Reservation creer(int num, int versement,String debut,String fin)  {
		Reservation reservation = new Reservation(num,versement,debut,fin);
		listeReservation.liste.add(reservation);
		return reservation;
	}
}
	
