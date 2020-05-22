package INTERFACE_USER;


import java.util.List;

import CMD.*;
import FORME_GRAPHIQUE.Forme;
import FORME_GRAPHIQUE.FormeGroup;


public class DrawingTUI {
		
	  private Interpreteur interprete = new Interpreteur();
	  
	  String str;
	  List<Forme> formeList;
	  double x,y;
	  
	  
	  public Command nextCommand(String saisie){
		   
		 String[] chaine = saisie.replaceAll("[()=,;]","").split(" ");
		 if(chaine.length>1) {
			  str=chaine[1];
		 }
		 else {
			 str=chaine[0];	
		 }
		 //System.out.println(chaine[1]);}
		 
		/* System.out.println(chaine[2]);
		 System.out.println(chaine[3]);
		 System.out.println(chaine[4]);*/
		 
	switch(str) {
			  case "Carre":
				  interprete.setParametersT(new String[]{chaine[0], chaine[2], chaine[3],chaine[4]});
					  CommandCarre commandeCarre = new CommandCarre(interprete);
					  commandeCarre.execute();					    
					  DrawingTUI afficheCarre = new DrawingTUI();
					  afficheCarre.printDessin(interprete);
					  return commandeCarre;
				   
				 case "Cercle":
					  interprete.setParametersT(new String[]{chaine[0], chaine[2], chaine[3],chaine[4]});
					  CommandCercle commandeCercle = new CommandCercle(interprete);
					  commandeCercle.execute();					    
					  DrawingTUI afficheCercle = new DrawingTUI();
					  afficheCercle.printDessin(interprete);
				    
				    return commandeCercle;
				   
				 case "Rectangle":
					  interprete.setParametersT(new String[]{chaine[0], chaine[2], chaine[3],chaine[4], chaine[5] });
					  CommandRectangle commandeRectangle = new CommandRectangle(interprete);
					  commandeRectangle.execute();
					  DrawingTUI afficheRectangle = new DrawingTUI();
					  afficheRectangle.printDessin(interprete);
					    
					    
					    return commandeRectangle;
				    
				  case "Triangle":
					  interprete.setParametersT(new String[]{chaine[0],chaine[2], chaine[3], chaine[4],chaine[5], chaine[6], chaine[7] });
					  CommandTriangle commandeTriangle = new CommandTriangle(interprete);
					  commandeTriangle.execute();				    
					  DrawingTUI afficheTriangle = new DrawingTUI();
					  afficheTriangle.printDessin(interprete);
					  return commandeTriangle;
				
				  case "Move":
					  //System.out.println("V");
					  if(chaine[2].contentEquals("All")) {
						  double a,b;
						  a=Double.parseDouble(chaine[3]);
						  b=Double.parseDouble(chaine[4]);
						 for( Forme forme : interprete.Mon_dessin) {
							 forme.move(a,b);
							 forme.print(); 
							 //System.out.println("Test");
						 }
						  
					  }
					  else {
					  interprete.setParametersT(new String[]{chaine[2],chaine[3], chaine[4] });
					  MoveCommand MoveComman = new MoveCommand(interprete);
					  MoveComman.execute();				    
					  DrawingTUI afficheMove = new DrawingTUI();
					  afficheMove.printDessin(interprete);
					  return MoveComman;
					  }		
					  
				
				  case "View":
					 
			
				 /* default:
					  System.out.println("erreur syntaxique");*/
					  
		}
	
		if(chaine[0].contentEquals("quit")) {
			
				CommandQuit quit = new CommandQuit(interprete);
				quit.execute();
		}
		/*else
		if(chaine[1].contentEquals("All")) {
			
			for (Forme form : formeList) {
				form.move(x,y);
			}
		}*/
		 
				return null;

		 
			
	   
	  }

	
	  
	  public void printDessin(Interpreteur interprete){
		  //interprete.print();
		  for(Forme forme : interprete.Mon_dessin){
		      forme.print();
		    }
	  }
	 
	
}
