package CMD;

import java.util.ArrayList;

import FORME_GRAPHIQUE.Affichage;
import FORME_GRAPHIQUE.Cercle;
import FORME_GRAPHIQUE.Forme;
import FORME_GRAPHIQUE.Rectangle;
import PERSISTANCE_DAO.CercleDAO;
import PERSISTANCE_DAO.RectangleDAO;

public class CommandRectangle implements Command{


	  public Interpreteur inter;
	  
	  public CommandRectangle(  Interpreteur interpreteur){
	    this.inter=interpreteur;
	  }

	  @Override
	  public void execute() {
	    if (inter.parametersT.length != 5) {
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
	        double d = Double.parseDouble(inter.parametersT[4]);
	        if(d<=c) {
	        	Affichage aff = new Affichage();
	  	      aff.afficher("Erreur!!!! la largeur d'un rectangle doit être inféreure à la longueur .");
	  	     }
	        else inter.Mon_dessin.add(new Rectangle(inter.parametersT[0],a,b,c,d));
	        
	      }catch(NumberFormatException e){
	    	  System.out.println("Le type entré pour un des paramètres est incorrect");
	        //e.printStackTrace();
	      }
	    }
}
}
