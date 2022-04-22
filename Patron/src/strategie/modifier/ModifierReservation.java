package strategie.modifier;

import java.util.ArrayList;
import java.util.List;

import classe.Reservation;
public class ModifierReservation implements ComprtementModification {
	List <Reservation> listereservation = new ArrayList<Reservation>();
	public void modifier( int numRes) {
		for (Reservation r : listereservation) {
			if (r.getNumRes() == numRes ) {
			r = new Reservation(); }
		}
	}

}
