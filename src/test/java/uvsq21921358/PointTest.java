package uvsq21921358;

import org.junit.Test;

import FORME_GRAPHIQUE.Affichage;
import FORME_GRAPHIQUE.Point2D;

public class PointTest {
	
	private Point2D P1;
	
	@Test()
	public void AffTest() {
		Affichage A =new Affichage();
		P1=new Point2D ("Mon_point",5,10);
		A.afficher(P1.toString());
	} 
}
