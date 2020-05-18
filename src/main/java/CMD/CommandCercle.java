package CMD;

import java.util.ArrayList;

/**
 * Classe de ccommande pour la forme Cercle. Elle permettra de créer une classe et de l'afficher
 */
import FORME_GRAPHIQUE.Affichage;
import FORME_GRAPHIQUE.Cercle;
import FORME_GRAPHIQUE.Forme;
import FORME_GRAPHIQUE.FormeGroup;
import PERSISTANCE_DAO.CercleDAO;

public class CommandCercle implements Command{

	  public Interpreteur inter;
	  
	  public CommandCercle(  Interpreteur interpreteur){
	    this.inter=interpreteur;
	  }

	  @Override
	  public void execute() {
	    if (inter.parametersT.length != 4) {
	      Affichage a = new Affichage();
	      a.afficher("Erreur sur le nombre de paramètres.");
	    }
	    else{
	      try {
	        inter.undo.push(new ArrayList<>(inter.Mon_dessin));
	        inter.redo.clear();
	        double a = Double.parseDouble(inter.parametersT[1]);
	        double b = Double.parseDouble(inter.parametersT[2]);
	        double c = Double.parseDouble(inter.parametersT[3]);
	        inter.Mon_dessin.add(new Cercle(inter.parametersT[0],a,b,c));
	      }catch(NumberFormatException e){
	    	  System.out.println("Le type entré pour un des paramètres est incorrect");
	        //e.printStackTrace();
	      }
	    }
	  


}
}
	

