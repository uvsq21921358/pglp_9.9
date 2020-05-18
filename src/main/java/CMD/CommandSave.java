package CMD;

import java.util.List;

import FORME_GRAPHIQUE.*;
import PERSISTANCE_DAO.*;

public class CommandSave implements Command{

	public Interpreteur interpreteur;

	  public CommandSave(Interpreteur interpreteur) {
	  this.interpreteur=interpreteur;
	  }

	  public void saveList(List<Forme> list){
	    for (Forme form : list){
	      if (form instanceof Cercle) DAOFactory.getCercleDAO().create((Cercle) form);
	      else if (form instanceof FormeGroup) saveList(((FormeGroup) form).formeList);
	    }
	  }

	  @Override
	  public void execute() {
	    saveList(interpreteur.Mon_dessin);
	  }
}
