package CMD;

import FORME_GRAPHIQUE.*;
import PERSISTANCE_DAO.*;
/**
 * 
 * @author utilisateur
 *Classe qui permet d'identifier la commande saisie par l'utilisateur.
 */

public class CreateCommande implements Command{
	
	private Forme forme;
	
	public CreateCommande(final Forme forme) {
        this.forme = forme;
    }

	@Override
	public void execute() {
        Connexion conn = new Connexion();
        conn.connexion();
    
       // Forme f = null; 
        if (forme.getClass() == Cercle.class) {
            DAO<Cercle> D = new CercleDAO();
    	    D.create((Cercle) forme);
                 
            
        }  else if (forme.getClass() == Carre.class) {
        	  DAO<Carre> D = new CarreDAO();
            D.create((Carre) forme);
            
        }else 
        	if (forme.getClass() == Rectangle.class) {
        	DAO<Rectangle> D = new RectangleDAO();
            
        	D.create((Rectangle) forme);
        
        	}else 
        		if(forme.getClass() == Triangle.class)
        	
        	 {
            	DAO<Triangle> D = new TriangleDAO();
                    
                D.create((Triangle) forme);
        	
        }else {
        	System.out.println("Cette Forme N'exite pas!!!!");
        }

	

}
}
