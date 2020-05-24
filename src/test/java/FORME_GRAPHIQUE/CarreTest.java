package FORME_GRAPHIQUE;

import static org.junit.Assert.*;

import org.junit.Test;

import FORME_GRAPHIQUE.Affichage;
import FORME_GRAPHIQUE.Carre;

public class CarreTest { 

	/**
	 * Methode de test de deplacement du carre
	 */
	@Test()
	public void moveCarreTest() {
		Affichage A =new Affichage();
		Carre Car =new Carre (null, 0,0,4);
		A.afficher(Car.toString());
		Car.move(2, 3);
		A.afficher(Car.toString());
	}
	 
	/*@Test()
	public void vu() { 
		Carre Cvu =new Carre (null, 1,1,5);
		Cvu.print();
	}*/
 
}
