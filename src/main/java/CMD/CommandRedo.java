package CMD;
/**
 *Commande qui permet d'enregistrer les commandes dans une liste
 */
import java.util.ArrayList;

public class CommandRedo implements Command{
	
	  public Interpreteur interpreteur;

	  public CommandRedo(Interpreteur interpreteur) {
	    this.interpreteur=interpreteur;
	  }

	  /**
	   * 
	   */
	  public void execute() {
	    interpreteur.undo.push(new ArrayList<>(interpreteur.Mon_dessin));
	    interpreteur.Mon_dessin=interpreteur.redo.pop();
	  }
}
