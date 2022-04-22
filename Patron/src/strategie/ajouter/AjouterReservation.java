package strategie.ajouter;

import java.util.ArrayList;
import java.util.List;

import classe.Gestion;
import classe.Reservation;


public class AjouterReservation  implements CompretementAjouter{
	public List <Reservation> liste = new ArrayList<Reservation>();
	private static AjouterReservation instanceAjout;
	public static synchronized AjouterReservation getReservation()
	{
		if(instanceAjout==null) instanceAjout= new AjouterReservation();
		return instanceAjout;
	}
	public void ajouter(Gestion g) {
		Reservation re= (Reservation) g;
		instanceAjout.liste.add(re);
	}
	
	public void lister() {
		for (Reservation reservation : liste) {
			System.out.println(reservation.affich());
		}
	}

}
