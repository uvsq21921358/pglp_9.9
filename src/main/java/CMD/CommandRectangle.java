package CMD;

import java.util.ArrayList;

import FORME_GRAPHIQUE.Affichage;
import FORME_GRAPHIQUE.Rectangle;



/**
 *  Classe CommandCarre qui permet de creer un rectangle.
 */
public class CommandRectangle implements Command{


	  public Interpreteur inter;
	  
	  public CommandRectangle(  Interpreteur interpreteur){
	    this.inter=interpreteur;
	  }

	  /**
	   * Methode de creation. Elle verifie d'abord que le nombre de parametre saisi est correct avant la creation. Ici le nombre de paramètre est de 5: le nom du rectangle, les coordonnées du point (x et y) ,la longeur et la largeur. 
	   */
	  @Override
	  public void execute() {
	    if (inter.parametersT.length != 5) {
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
	        if(c<=d) {
	        	Affichage aff = new Affichage();
	  	      aff.afficher("Erreur!!!! la largeur d'un rectangle doit �tre infereure � la longueur .");
	  	     }
	        else inter.Mon_dessin.add(new Rectangle(inter.parametersT[0],a,b,c,d));
	        
	      }catch(NumberFormatException e){
	    	  System.out.println("Le type saisi pour un des param�tres est incorrect!!!!");
	        //e.printStackTrace();
	      }
	    }
}
}
