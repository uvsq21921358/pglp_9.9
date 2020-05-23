package CMD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import FORME_GRAPHIQUE.Cercle;
import FORME_GRAPHIQUE.Forme;
import FORME_GRAPHIQUE.Point2D;

/**
 * 
 * @author SIMPORE
 *Cette commande permet d'interpreter ce que l'utilisateur a saisit
 */
public class Interpreteur {

		  public HashMap<String,Command> set = new HashMap<>();
		  public String[] parametersT;
		  public List<Forme> Mon_dessin = new ArrayList<>();
		  public Stack<List<Forme>> undo = new Stack<>();
		  public Stack<List<Forme>> redo = new Stack<>();


		  public Interpreteur(){
		    set.put("Cercle",new CommandCercle(this));
		    set.put("Move", new MoveCommand(this));
		    set.put("Print", new CommandPrint(this));
		    set.put("Undo", new CommandUndo(this));
		    set.put("Redo", new CommandRedo(this));
		    set.put("Quit", new CommandQuit(this));
		    set.put("Save", new CommandSave(this));
		    set.put("Load",new CommandLaod(this));
		  }

		  public void setParametersT(String[] parametersT) {
		    this.parametersT = parametersT;
		  }

		  public void print() {
		    for(Forme forme : this.Mon_dessin){
		      forme.print();
		    }
		  }

		 
}
