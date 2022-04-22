package classe;


import decorateurVehicule.Carburant;
import fabrique.FabriqueClient;
import fabrique.FabriqueReservation;
import fabrique.FabriqueVehicule;
import fabriqueDecorateur.FabriqueCarburant;
import strategie.ajouter.AjouterClient;
import strategie.ajouter.AjouterReservation;
import strategie.ajouter.AjouterVehicule;

public class Simulateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AjouterClient listeClient= AjouterClient.getClient();
		AjouterVehicule listeVehicule= AjouterVehicule.getVehicule();
		AjouterReservation listeReservation= AjouterReservation.getReservation();
		
		FabriqueClient fabriqueClient= new FabriqueClient();

			Client c1=fabriqueClient.creer(100,"075455228" , "ahmed", "gueye", "8 rue ");
			Client c2=fabriqueClient.creer(200,"061125611" , "Nesrine", "ZLL", "12 rue pierre ");
			
		FabriqueVehicule fabriqueVehicule=new FabriqueVehicule();
		
			Vehicule voiture =fabriqueVehicule.creer("voiture",1,5000, "TOYOTA", "RAV4","rouge");	
			Vehicule camion =fabriqueVehicule.creer("camion",1,3000, "Renault", "3008","grise");
			

			
	FabriqueReservation fabriqueReservation = new FabriqueReservation();
	
		Reservation r1= fabriqueReservation.creer(1,250 ,"2021-04-06", "2022-02-08");
		Reservation r2= fabriqueReservation.creer(2,1000,"2022-04-06", "2025-02-08");

	
	//1
	    // explication du design fabrique avec les instanciation
	
	//2
	  //explication du design singleton
	 //listeClient.lister();
	//3 
	   // explication du design decorateur
	   
	   //voiture sans decorateur 
	      //affichage de la voiture sans decorateur
	     	//System.out.println(voiture.description());
	   //voiture avec carburant
		  FabriqueCarburant fabriqueCarburant=new FabriqueCarburant();

	     voiture= fabriqueCarburant.creerDec(voiture);
	   //System.out.println(voiture.description());
//4
	   //explication design observateur
		Client c3=fabriqueClient.creer(200,"0752369812","Melissa" , "Mezhoud", "12 rue pierre ");
	//  c3.pub();
		Vehicule pickup =fabriqueVehicule.creer("pick-up",1,3000, "Mercedes", "A730","Bleu");
	  
	   	c3.pub();
	
	}

}
