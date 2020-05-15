package uvsq21921358;

import org.junit.Test;

public class PointTest {
	
	private Point2D P1;
	
	@Test()
	public void AffTest() {
		Affichage A =new Affichage();
		P1=new Point2D (5,10);
		A.afficher(P1.toString());
	}
}
