package CMD;

import java.util.ArrayList;

import FORME_GRAPHIQUE.Affichage;
import FORME_GRAPHIQUE.Carre;
import FORME_GRAPHIQUE.Cercle;
import FORME_GRAPHIQUE.Forme;
import PERSISTANCE_DAO.CarreDAO;
import PERSISTANCE_DAO.CercleDAO;

public class CommandCarre implements Command{


	  public Interpreteur inter;
	  
	  public CommandCarre(  Interpreteur interpreteur){
	    this.inter=interpreteur;
	  }

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
	      }catch(NumberFormatException e){
	    	  System.out.println("Le type entr� pour un des param�tres est incorrect");
	        //e.printStackTrace();
	      }
	    }
}}