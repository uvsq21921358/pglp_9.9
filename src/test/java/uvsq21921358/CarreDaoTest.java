package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

import FORME_GRAPHIQUE.Carre;
import PERSISTANCE_DAO.CarreDAO;
import PERSISTANCE_DAO.DAO;

public class CarreDaoTest {

	@Test 
	public void createTest() {
		Carre Car2=new Carre ("Mon_carre2", 1,1,3);
		DAO<Carre> Dc1= new CarreDAO();
		Dc1.create(Car2); 
	} 

}
