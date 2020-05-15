package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

public class JDBCTest {

	@Test()
	public void createConnexion(){
		Connexion DB=new Connexion();
		DB.connexion();
	}
	
	@Test()
	public void createTableTest(){
		Connexion DB=new Connexion();
		DB.createTables();
	}
	
	@Test()
	public void dropTableTest(){
		Connexion DB=new Connexion();
		DB.dropCreate();
	}

}
