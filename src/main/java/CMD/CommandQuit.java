package CMD;
/**
 * Commande qui permet de quitter le programme
 */
import java.util.Scanner;

import FORME_GRAPHIQUE.Affichage;

public class CommandQuit implements Command {

	public Interpreteur interpreteur;
	Scanner sc;

	  public CommandQuit(Interpreteur interpreteur) {
	    this.interpreteur=interpreteur;
	  }

	  /**
	   * Cette methode permet de quitter le programme, mais avant de le quitter un message de demande de sauvegarde est envoyé à l'utilisateur.
	   */
	  /* @Override
	  public void execute() {
	    Affichage A = new Affichage();
	    A.afficher("Voulez vous sauvegarder ?");
	    String reponseUtilisateur;
	    
	    while (true) {
	     sc = new Scanner(System.in);
	      reponseUtilisateur= sc.nextLine();
	      /*if (reponseUtilisateur.contentEquals("Oui") || reponseUtilisateur.contentEquals("OUI") || reponseUtilisateur.contentEquals("oui") || reponseUtilisateur.contentEquals("O"))  {
	        CommandSave commandeSave = new CommandSave(interpreteur);
	        commandeSave.execute();
	        System.exit(17);
	      }
	      if (reponseUtilisateur.contentEquals("Non") || reponseUtilisateur.contentEquals("NON") || reponseUtilisateur.contentEquals("non") || reponseUtilisateur.contentEquals("N")){
	        System.exit(18);
	       
	      }
	    }

	  }*/
	  
	  public void execute() {
	 
		  System.out.println("PROGRAMME TERMINEE AVEC SUCCES!!!");
		  System.exit(0);
	  }
}
