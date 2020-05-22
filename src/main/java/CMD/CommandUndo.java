package CMD;
/**
 * 
 * @author SIMPORE
 *Commande qui permet de revenir en arriere
 */
public class CommandUndo implements Command{

	public Interpreteur interpreteur;

	  public CommandUndo(Interpreteur interpreteur) {
	    this.interpreteur=interpreteur;
	  }

	  @Override
	  public void execute() {
	    interpreteur.redo.push(interpreteur.Mon_dessin);
	    interpreteur.Mon_dessin=interpreteur.undo.pop();
	  }
}
