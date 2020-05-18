package CMD;

import FORME_GRAPHIQUE.*;
import PERSISTANCE_DAO.*;

public class MoveCommand implements Command {
	public Interpreteur inter;
	  public MoveCommand(Interpreteur interpreteur) {
	    this.inter=interpreteur;
	  }

	  public Forme findComposite(String name){
	   FormeGroup formelist=null;
	    for (Forme form : inter.Mon_dessin){
	      if (form.getNom().equals(name)) return form;
	      else if(form instanceof FormeGroup){
	        formelist = (FormeGroup) form;
	        for (Forme f1 : formelist.formeList){
	          if (f1.getNom().equals(name)) return f1;
	        }
	      }
	    }
	    return null;
	  }

	  @Override
	  public void execute() {
	    if (inter.parametersT.length!=3){
	      Affichage a = new Affichage();
	      a.afficher("Erreur!!! Le nombre de paramètres saisi est incorrect!!!");
	    }
	    else{
	     Forme form = findComposite(inter.parametersT[0]);
	      if (form!=null){
	        try{
	          int a = Integer.parseInt(inter.parametersT[1]);
	          int b = Integer.parseInt(inter.parametersT[2]);
	          inter.undo.push(inter.Mon_dessin);
	          inter.redo.clear();
	          form.move(a,b);
	        }catch(Exception e){
	          e.printStackTrace();
	        }
	      }


	    }
	  }
}
