package CMD;

import java.util.ArrayList;

import FORME_GRAPHIQUE.Affichage;
import FORME_GRAPHIQUE.Carre;
import FORME_GRAPHIQUE.Forme;
import FORME_GRAPHIQUE.Rectangle;
import FORME_GRAPHIQUE.Triangle;
import PERSISTANCE_DAO.CarreDAO;
import PERSISTANCE_DAO.TriangleDAO;

/**
 *  Classe CommandCarre qui permet de creer un triangle.
 */
public class CommandTriangle implements Command{

	  public Interpreteur inter;
	  
	  public CommandTriangle(  Interpreteur interpreteur){
	    this.inter=interpreteur;
	  }

	  /**
	   * Methode de creation. Elle verifie d'abord que le nombre de parametre saisi est correct avant la creation. Ici le nombre de paramètre est de 7: le nom du triangle, les coordonnées du point p1 (a et b) ,p2 (c et d) et p3 (e et f). 
	   */
	  @Override
	  public void execute() {
	    if (inter.parametersT.length != 7) {
	      Affichage a = new Affichage();
	      a.afficher("Erreur sur le nombre de param�tres.");
	    }
	    else{
	      try {
	        inter.undo.push(new ArrayList<>(inter.Mon_dessin));
	        inter.redo.clear();
	        double a = Double.parseDouble(inter.parametersT[1]);
	        double b = Double.parseDouble(inter.parametersT[2]);
	        double c = Double.parseDouble(inter.parametersT[3]);
	        double d = Double.parseDouble(inter.parametersT[4]);
	        double e = Double.parseDouble(inter.parametersT[5]);
	        double f = Double.parseDouble(inter.parametersT[6]);
	        inter.Mon_dessin.add(new Triangle(inter.parametersT[0],a,b,c,d,e,f));
	      }catch(NumberFormatException e){
	    	  System.out.println("Le type saisi pour un des param�tres est incorrect!!!!");
	        //e.printStackTrace();
	      }
	    }
}
}
