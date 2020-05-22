package CMD;
/**
 * Cette commande permet à la demande de l'utlisateur de sauvegarder les informations qu'il a saisi
 */
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
	      else 
	    	  if(form instanceof Carre) DAOFactory.getCarreDAO().create((Carre) form);
	    	  else
	    		  if(form instanceof Rectangle) DAOFactory.getRectangleDAO().create((Rectangle) form);
	    		  else
	    			  if(form instanceof Triangle)DAOFactory.getTriangleDAO().create((Triangle) form); 
	    			  if(form instanceof FormeGroup) saveList(((FormeGroup) form).formeList);
	      
	      	/*Fonction de base
	      	 * if (form instanceof Cercle) DAOFactory.getCercleDAO().create((Cercle) form);
	    	 // if (form instanceof FormeGroup) saveList(((FormeGroup) form).formeList)
			*/
	    	  
	    }
	  }

	  @Override
	  public void execute() {
	    saveList(interpreteur.Mon_dessin);
	    System.out.println("Enregistrement bien effectué!!!!");
	  }
}
