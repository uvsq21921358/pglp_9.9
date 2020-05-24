package INTERFACE_USER;


import java.util.ArrayList;
import java.util.List;

import CMD.*;
import FORME_GRAPHIQUE.*;
import PERSISTANCE_DAO.DAOFactory;


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
					  if(chaine[2].contentEquals("All")) {
						  if (chaine[3].contentEquals("Cercle") ) {
							  List<Cercle> listCercle= DAOFactory.getCercleDAO().findAll();
							  for (int i=0; i<listCercle.size();i++) {
									System.out.println(listCercle.get(i));
								}
						  }
					  }
					  else
					  {
						  
							  if (chaine[2].contentEquals("Cercle") ) {
								  Cercle C1=  DAOFactory.getCercleDAO().read(chaine[3]);
								  if(C1!=null) { 
									  //System.out.println("C'est un cercle");
									  C1.print();
								  }else System.out.println("Cette forme n'existe pas");
							  }
							  else
								  if (chaine[2].contentEquals("Carre") ) {
									 Carre Ca= DAOFactory.getCarreDAO().read(chaine[3]);
									 if(Ca!=null) {
										 System.out.println("C'est un carre");
										 Ca.print();
									 }else System.out.println("Cette forme n'existe pas");
								  }
								  else
									  if (chaine[2].contentEquals("Rectangle") ) {
										Rectangle R1= DAOFactory.getRectangleDAO().read(chaine[3]);
										if(R1!=null) {
										  System.out.println("C'est un rectangle");
										  R1.print();
										}else System.out.println("Cette forme n'existe pas");
									  }
									  else
										  if (chaine[2].contentEquals("Triangle") ) {
											 Triangle TR1= DAOFactory.getTriangleDAO().read(chaine[3]);
											 if(TR1!=null) {
											  System.out.println("C'est un triangle");
											  TR1.print();
											 }else System.out.println("Cette forme n'existe pas");
										  }
										  else 	
											  System.out.println("L'élément recherché n'existe pas!!!!");
							 
					  
						  
						 // DrawingTUI affiche = new DrawingTUI();
						 // affiche.printDessin(interprete);
					  }
					 
			
				 /* default:
					  System.out.println("erreur syntaxique");*/
					  
				  case "CreateGroup": 
					 // List<Forme> liste = new ArrayList<>();
					  FormeGroup fg=new FormeGroup(chaine[2]);
					  for(Forme forme : interprete.Mon_dessin) {
						  fg.addForme(forme);
						  forme.print();
						  
					  }
					  
					  System.out.println("CREATION REUSIE!!!!");
				
				 
					  
		}
	
		if(chaine[0].contentEquals("quit") || chaine[0].contentEquals("QUIT") || chaine[0].contentEquals("quitter")) {
			
				CommandQuit quit = new CommandQuit(interprete);
				quit.execute();
		}
		else
		if(chaine[0].contentEquals("Save") || chaine[0].contentEquals("save") || chaine[0].contentEquals("SAVE")) {
			
			 CommandSave commandeSave = new CommandSave(interprete);
		        commandeSave.execute();
		}
		 
				return null;

		 
			
	   
	  }

	
	  
	  public void printDessin(Interpreteur interprete){
		  //interprete.print();
		  for(Forme forme : interprete.Mon_dessin){
		      forme.print();
		    }
	  }
	 
	
}
