package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

import FORME_GRAPHIQUE.Triangle;
import PERSISTANCE_DAO.DAO;
import PERSISTANCE_DAO.TriangleDAO;

public class TriangleDAOTest {

	@Test 
	public void createTest() {
		Triangle T =new Triangle ("T",1,2,3,4,5,6);
		DAO<Triangle> Dc1= new TriangleDAO();
		Dc1.create(T); 
	}
}
