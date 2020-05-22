package CMD;
/**
 * Classe CommandCarre qui permet de creer un carré. 
 */
import java.util.ArrayList;

import FORME_GRAPHIQUE.Affichage;
import FORME_GRAPHIQUE.Carre;


public class CommandCarre implements Command{


	  public Interpreteur inter;
	  
	  public CommandCarre(  Interpreteur interpreteur){
	    this.inter=interpreteur;
	  }

	  /**
	   * Methode de creation. Elle verifie d'abord que le nombre de parametre saisi est correct avant la creation. Ici le nombre de paramètre est de 4: le nom du carre, les coordonnées du point (x et y) et le coté. 
	   */
	  @Override
	  public void execute() {
	    if (inter.parametersT.length != 4) {
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
	        inter.Mon_dessin.add(new Carre(inter.parametersT[0],a,b,c));
	        //CommandSave commandS=new CommandSave(inter);
	       // commandS.execute();
	      }catch(NumberFormatException e){
	    	  System.out.println("Le type saisi pour un des param�tres est incorrect!!!!");
	        //e.printStackTrace();
	      }
	    }
}}
