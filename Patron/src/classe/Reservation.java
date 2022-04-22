package classe;
import strategie.ajouter.AjouterReservation;
import strategie.modifier.ModifierReservation;
import strategie.rechercher.RechercherReservation;
import strategie.supprimer.SupprimerReservation;

public class Reservation extends Gestion{
int numRes,versement;
String dateDebut ,dateFin;
	public Reservation(int numRes,int versement,String dateDebut, String dateFin) {
	super();
	this.numRes = numRes;
	this.versement = versement;
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
}
	public int getNumRes() {
		return numRes;
	}
	public void setNumRes(int numRes) {
		this.numRes = numRes;
	}
	public Reservation() {
	comprtementajouter= new AjouterReservation();
	comprtementmodifier= new ModifierReservation();
	comprtementrechercher= new RechercherReservation();
	comprtementsupprimer=new SupprimerReservation();}
	public int getVersement() {
	return versement;
}
public void setVersement(int versement) {
	this.versement = versement;
}
public String getDateDebut() {
	return dateDebut;
}
public void setDateDebut(String dateDebut) {
	this.dateDebut = dateDebut;
}
public String getDateFin() {
	return dateFin;
}
public void setDateFin(String dateFin) {
	this.dateFin = dateFin;
}
public String affich() {
	
	 return "versement : "+this.versement+"\n"+"Date debut : "+this.dateDebut+"\n"+"Date fin : "
		+this.dateFin;
		
	
}
	
public void description()
{
	System.out.println(this.affich());
}


}
