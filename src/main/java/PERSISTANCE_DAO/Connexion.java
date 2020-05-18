package uvsq21921358;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Connexion {

	private static final String Nom = "Nayima";
	private static final String password = "pwd";
	public static String base = "jdbc:derby:base;create=true";
	
	public void connexion() {
		Properties connectionProps = new Properties();
		connectionProps.put("user", Nom);
		connectionProps.put("user", password);
		System.out.println("Connexion reussie ");
	}
	
	public void dropCreate(){

		try (Connection connect = DriverManager.getConnection(base)){
			Statement state = connect.createStatement();
			//state.addBatch("DROP TABLE formeGroupes");
			state.addBatch("DROP TABLE Cercle");
			state.executeBatch();
			System.out.println("Suppression reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();
		}	
	}
	
	public void createTables(){

		try (Connection connect = DriverManager.getConnection(base)){
			Statement state = connect.createStatement();
			state.addBatch("CREATE TABLE formeGroup ("+ "id VARCHAR(100) PRIMARY KEY"+ ")"); 
			state.addBatch("CREATE TABLE Cercle ("+ "nomC VARCHAR(100) PRIMARY KEY,"+  "x double"+ "y double"+ "rayon double"+ ")");
			state.executeBatch();
		} 
		catch (SQLException e){
			e.printStackTrace();

		}		

	}
	
}
