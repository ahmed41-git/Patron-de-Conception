package classe;
import strategie.ajouter.CompretementAjouter;
import strategie.modifier.ComprtementModification;
import strategie.rechercher.CompretementRechercher;
import strategie.supprimer.ComprtementSupprimer;

public abstract class Gestion {
	CompretementAjouter 	comprtementajouter;
	ComprtementModification comprtementmodifier;
	CompretementRechercher comprtementrechercher; 
	ComprtementSupprimer comprtementsupprimer;
	
	public void effecterajout() {
		comprtementajouter.ajouter(this);
	}
	 
	public void effectermodif() {
		int x=0;
		comprtementmodifier.modifier(x);
	}
	
	public void effectuersupprim() {
		comprtementsupprimer.supprimer(this);
	}
	public void effectuerrecherche(int x) {
		comprtementrechercher.rechercher(x);
	}
	
}
