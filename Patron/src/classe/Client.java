package classe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import observer.ObservateurClient;
import strategie.ajouter.AjouterClient;
import strategie.modifier.ModifierClient;
import strategie.rechercher.RechercherClient;
import strategie.supprimer.SupprimerClient;



public class Client extends Gestion implements ObservateurClient{
int permis;
String nom, prenom, adresse,tel;
Date date;
List<String> publicite=new ArrayList<String>();

//List <Client> listeclient = new ArrayList<Client>();

public Client(int permis, String tel, String nom, String prenom, String adresse) {
	super();
	this.permis = permis;
	this.tel = tel;
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	comprtementajouter= new AjouterClient();
	comprtementmodifier= new ModifierClient();
	comprtementrechercher= new RechercherClient();
	comprtementsupprimer=new SupprimerClient();
}
public Client() {
	comprtementajouter= new AjouterClient();
	comprtementmodifier= new ModifierClient();
	comprtementrechercher= new RechercherClient();
	comprtementsupprimer=new SupprimerClient();
	
}
public int getPermis() {
	return permis;
}
public void setPermis(int permis) {
	this.permis = permis;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String  Affich() {
	 return "nom : "+this.nom.toLowerCase()+"\n"+"prenom : "+this.prenom+"\n"+"tel : "
	+this.tel+"\n"+"Adresse : "+this.adresse;
	
}

public void notifierClient(Vehicule v)
{
	this.publicite.add(v.description());
}

public void pub()
{
	if(publicite.isEmpty()) { 
		System.out.println("pas de pub ");
		return;
	}
	//String chaine="";
	for (String string : publicite) {
	//	chaine+=string+"\n"; 
		System.out.println(string);
	}

}
public void description()
{
	System.out.println(this.Affich());
}
}
