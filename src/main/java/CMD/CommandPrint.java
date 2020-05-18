package CMD;

import FORME_GRAPHIQUE.Forme;

public class CommandPrint implements Command {

	public Interpreteur inter;
	  public CommandPrint(Interpreteur interpreteur) {
	    this.inter=interpreteur;
	  }

	  @Override
	  public void execute() {
	    for(Forme forme : inter.Mon_dessin){
	      forme.print();
	    }
	  }
}
