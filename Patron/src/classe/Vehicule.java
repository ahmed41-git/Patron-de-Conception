package classe;
import java.util.List;
import strategie.ajouter.AjouterVehicule;
import strategie.modifier.ModifierVehicule;
import strategie.rechercher.RechercherVehicule;
import strategie.supprimer.SupprimerVehicule;

public abstract class  Vehicule extends Gestion { 
	protected int matricule;
	protected int prixLoc;
	protected String marque;
	protected String modele;
	protected String couleur;


	public Vehicule(int matricule, int prixLoc, String marque, String modele, String couleur) {
		super();
		this.matricule = matricule;
		this.prixLoc = prixLoc;
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		
	}
	public Vehicule() {
		comprtementajouter= new AjouterVehicule();
		comprtementmodifier= new ModifierVehicule();
		comprtementrechercher= new RechercherVehicule();
		comprtementsupprimer=new SupprimerVehicule();
	}
	public abstract String description();

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public int getPrixLoc() {
		return prixLoc;
	}

	public void setPrixLoc(int prixLoc) {
		this.prixLoc = prixLoc;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String affich() {
		 return "marque : "+this.marque+"\n"+"modele : "+this.modele+"\n"+"couleur : "
			+this.prixLoc+"\n"+" Couleur : "+this.couleur;
			
	}

    public void notiferObservateurs(List<Client> observateurs) {
        for ( Client obs: observateurs) {
            obs.notifierClient(this);
        }

    }
   
}
