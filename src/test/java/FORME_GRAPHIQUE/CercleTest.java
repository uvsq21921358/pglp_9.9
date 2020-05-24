package FORME_GRAPHIQUE;

import org.junit.Test;

import FORME_GRAPHIQUE.Affichage;
import FORME_GRAPHIQUE.Cercle;

public class CercleTest {

	@Test()
	public void moveTest() {
		Affichage A =new Affichage();
		Cercle C =new Cercle (null, 0,0,3); 
		A.afficher(C.toString());
		C.move(2, 5);
		A.afficher(C.toString());
	} 
	
	@Test()
	public void vu() {
		Cercle Cvu =new Cercle (null, 1,1,5);
		Cvu.print();
	} 
}
