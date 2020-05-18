package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

import FORME_GRAPHIQUE.Cercle;
import PERSISTANCE_DAO.DAO;
import PERSISTANCE_DAO.DAOFactory;
import PERSISTANCE_DAO.DAOFactory.DAOType;

public class DAOFactoryTest {

	@Test
	public void CercleDAOTest() {
		DAO<Cercle> ajout =((DAOFactory) DAOFactory.getFactory(DAOType.CERCLE)).getCercleDAO();
		
	}

}
