package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

public class CercleDaoTest {

	@Test
	public void createTest() {
		Cercle C2=new Cercle (null, 0,0,3);
		DAO<Cercle> D1= new CercleDAO();
		assertSame(C2,D1.create(C2));
	}

}
