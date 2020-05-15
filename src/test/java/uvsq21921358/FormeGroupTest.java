package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormeGroupTest {

	@Test
	public void Addtest() {
		Cercle C1=new Cercle(null, 0,0,3);
		Cercle C2=new Cercle(null, 1,2,3);
		FormeGroup fg=new FormeGroup();
		fg.addForme(C1);
		fg.addForme(C2);
		System.out.println(fg.formeList.size());
	}
	
	@Test()
	public void MoveTest() {
		Cercle C1=new Cercle(null, 0,0,3);
		Cercle C2=new Cercle(null, 1,2,3);
		FormeGroup fg=new FormeGroup();
		fg.addForme(C1);
		fg.addForme(C2);
		fg.move(2, 1);
		
		fg.AffichonsGroup();
		
	}

}
