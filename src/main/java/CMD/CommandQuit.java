package CMD;
/**
 * Commande qui permet de quitter le programme
 */
import java.util.Scanner;

import FORME_GRAPHIQUE.Affichage;

public class CommandQuit implements Command {

	public Interpreteur interpreteur;

	  public CommandQuit(Interpreteur interpreteur) {
	    this.interpreteur=interpreteur;
	  }

	  /**
	   * Cette methode permet de quitter le programme, mais avant de le quitter un message de demande de sauvegarde est envoyé à l'utilisateur.
	   */
	  @Override
	  public void execute() {
	    Affichage A = new Affichage();
	    A.afficher("Voulez vous sauvegarder ?");
	    String reponseUtilisateur;
	    
	    while (true) {
	    Scanner sc = new Scanner(System.in);
	      reponseUtilisateur= sc.nextLine();
	      if (reponseUtilisateur.compareTo("Oui")==0) {
	        CommandSave commandeSave = new CommandSave(interpreteur);
	        commandeSave.execute();
	        System.exit(17);
	      }
	      if (reponseUtilisateur.compareTo("Non")==0){
	        System.exit(18);
	      }
	    }

	  }
}
