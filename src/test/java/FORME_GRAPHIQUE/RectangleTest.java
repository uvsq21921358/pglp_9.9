package FORME_GRAPHIQUE;

import static org.junit.Assert.*;

import org.junit.Test;

import FORME_GRAPHIQUE.Affichage;
import FORME_GRAPHIQUE.Rectangle;
/**
 * test de creation d'un rectangle
 * @author utilisateur
 *
 */
public class RectangleTest {

	@Test()
	public void moveRectangleTest() {
		Affichage A =new Affichage();
		Rectangle Rec =new Rectangle (null, 0,0,4,2);
		A.afficher(Rec.toString());
		Rec.move(2, 3);
		A.afficher(Rec.toString());
	}
	

	@Test()
	public void vu() { 
		Rectangle Rvu =new Rectangle (null,1,1,10,5);
		Rvu.print();
	}

}
