package PERSISTANCE_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Connexion {

	/**
	 * Variable de connexion
	 */
	private static final String Nom = "Nayima";
	private static final String password = "pwd";
	public static String base = "jdbc:derby:base;create=true";
	
	/**
	 * Etablissement de la connexion
	 */ 
	public void connexion() {
		Properties connectionProps = new Properties();
		connectionProps.put("user", Nom);
		connectionProps.put("user", password); 
		System.out.println("Connexion reussie ");
	}
	
	/**
	 *Methode de Creation et de suppression de la table Cercle
	 */
	public void dropTableCercle(){

		try (Connection connect = DriverManager.getConnection(base)){
			Statement state = connect.createStatement();
			state.addBatch("DROP TABLE Cercle");
			state.executeBatch();
			System.out.println("Suppression table Cercle reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();
		}	
	}
	
	public void createTableCercle(){

		try (Connection connect = DriverManager.getConnection(base)){
			Statement state = connect.createStatement(); 
			state.addBatch("CREATE TABLE Cercle ("+ "nomC VARCHAR(100) PRIMARY KEY,"+  "x double ,"+ " y double ,"+ " rayon double" + ")");
			state.executeBatch();
			System.out.println("Creation table Cercle reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();

		}		

	}
	
	/**
	 *Methode de Creation et de suppression de la table Carre
	 */
	public void dropTableCarre(){

		try (Connection connect = DriverManager.getConnection(base)){
			Statement state = connect.createStatement();
			state.addBatch("DROP TABLE Carre");
			state.executeBatch();
			System.out.println("Suppression table Carre reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();
		}	
	}
	
	public void createTableCarre(){

		try (Connection connect = DriverManager.getConnection(base)){
			Statement state = connect.createStatement(); 
			state.addBatch("CREATE TABLE Carre ("+ "nomCarre VARCHAR(100) PRIMARY KEY,"+  " x double,"+ " y double,"+ " cote double" + ")");
			state.executeBatch();
			System.out.println("Creation table Carre reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();

		}		

	}
	
	/**
	 *Methode de Creation et de suppression de la table Rectangle
	 */
	public void dropTableRectangle(){

		try (Connection connect = DriverManager.getConnection(base)){
			Statement state = connect.createStatement();
			state.addBatch("DROP TABLE Rectangle");
			state.executeBatch();
			System.out.println("Suppression table Rectangle reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();
		}	
	}
	
	public void createTableRectangle(){

		try (Connection connect = DriverManager.getConnection(base)){
			Statement state = connect.createStatement(); 
			state.addBatch("CREATE TABLE Rectangle ("+ "nomR VARCHAR(100) PRIMARY KEY,"+  " x double,"+ " y double,"+ " Longueur double," + " Largeur double"+ ")");
			state.executeBatch();
			System.out.println("Creation table Rectangle reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();

		}		
	}
	
	/**
	 *Methode de Creation et de suppression de la table Triangle
	 */
	public void dropTableTriangle(){

		try (Connection connect = DriverManager.getConnection(base)){
			Statement state = connect.createStatement();
			state.addBatch("DROP TABLE Triangle");
			state.executeBatch();
			System.out.println("Suppression table Triangle reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();
		}	
	}
	
	public void createTableTriangle(){

		try (Connection connect = DriverManager.getConnection(base)){
			Statement state = connect.createStatement(); 
			state.addBatch("CREATE TABLE Triangle ("+ "nomT VARCHAR(100) PRIMARY KEY,"+  " a double,"+ " b double,"+ " c double," + " d double ,"+ " e double ,"+ "f double" + ")");
			state.executeBatch();
			System.out.println("Creation table Triangle reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();

		}		
	}
	
	
}
