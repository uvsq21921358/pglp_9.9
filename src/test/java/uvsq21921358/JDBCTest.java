package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

import PERSISTANCE_DAO.Connexion;

public class JDBCTest {

	/**
	 * Methode de test de l'etablissement de la connexion "Methode Connexion"
	 */
	@Test()
	public void createConnexion(){
		Connexion DB=new Connexion();
		DB.connexion();  
	} 
	  
	/**
	 * Test de la creation et de la suppression de la table Cercle dans la Connexion
	 */
	//Creation de la table cercle
	/*@Test()
	public void createTableCercleTest(){ 
		Connexion DB=new Connexion();
		DB.createTableCercle();
	}
	
	//Suppression de la table cercle
	/*@Test() 
	public void dropTableCercleTest(){
		Connexion DB=new Connexion();
		DB.dropTableCercle();
	}
	
	/**
	 * Test de la creation et de la suppression de la table Carre dans la Connexion
	 */
	//Creation de la table carre
	/*@Test()
	public void createTableCarreTest(){
		Connexion DB=new Connexion();
		DB.createTableCarre();
	}
	
	//Suppression de la table Carre
	@Test()
	public void dropTableCarreTest(){
		Connexion DB=new Connexion();
		DB.dropTableCarre();
	}
	
	/**
	 * Test de la creation et de la suppression de la table Rectangle dans la Connexion
	 */
	//Creation de la table Rectangle
	/*@Test()
	public void createTableRectangleTest(){
		Connexion DB=new Connexion();
		DB.createTableRectangle();
	}
	
	//Suppression de la table Rectangle
	/*@Test()
	public void dropTableRectangleTest(){
		Connexion DB=new Connexion();
		DB.dropTableRectangle();
	}
	
	/**
	 * Test de la creation et de la suppression de la table Triangle dans la Connexion
	 */
	//Creation de la table Rectangle
	@Test()
	public void createTableTriangleTest(){
		Connexion DB=new Connexion();
		DB.createTableTriangle();
	}
	
	//Suppression de la table Rectangle
	/*@Test()
	public void dropTableTriangleTest(){
		Connexion DB=new Connexion();
		DB.dropTableTriangle();
	}*/
}
