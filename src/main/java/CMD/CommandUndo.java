package CMD;

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
