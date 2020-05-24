package CMD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import EXCEPTIONS.DaoException;

public class InitBD {
	public static String base = "jdbc:derby:base;create=true";
	//private static final String DRIVER="org.apache.derby.jdbc.EmbeddedDriver";
	
	public static void dropCreateTables() throws  DaoException {
		try (Connection connect = DriverManager.getConnection(base)){
			Statement state = connect.createStatement();
			state.addBatch("DROP TABLE Cercle");
			state.addBatch("DROP TABLE Carre");
			state.addBatch("DROP TABLE Rectangle");
			state.addBatch("DROP TABLE Triangle");
			state.addBatch("DROP TABLE Groupe");
			
			state.addBatch("CREATE TABLE Cercle ("+ "nomC VARCHAR(100) PRIMARY KEY,"+  "x double ,"+ " y double ,"+ " rayon double" + ")");
			state.addBatch("CREATE TABLE Carre ("+ "nomCarre VARCHAR(100) PRIMARY KEY,"+  " x double,"+ " y double,"+ " cote double" + ")");
			state.addBatch("CREATE TABLE Rectangle ("+ "nomR VARCHAR(100) PRIMARY KEY,"+  " x double,"+ " y double,"+ " Longueur double," + " Largeur double"+ ")");
			state.addBatch("CREATE TABLE Triangle ("+ "nomT VARCHAR(100) PRIMARY KEY,"+  " a double,"+ " b double,"+ " c double," + " d double ,"+ " e double ,"+ "f double" + ")");
			state.addBatch("create table Groupe(Id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,name varchar(40) NOT NULL UNIQUE)");
			state.executeBatch();
			state.close();
		}catch (SQLException e) {
			throw new DaoException(e.getMessage());
		}
	}
	
	public static void createTables() throws DaoException {
		try (Connection connect = DriverManager.getConnection(base)){
			Statement state = connect.createStatement();
			state.addBatch("CREATE TABLE Cercle ("+ "nomC VARCHAR(100) PRIMARY KEY,"+  "x double ,"+ " y double ,"+ " rayon double" + ")");
			state.addBatch("CREATE TABLE Carre ("+ "nomCarre VARCHAR(100) PRIMARY KEY,"+  " x double,"+ " y double,"+ " cote double" + ")");
			state.addBatch("CREATE TABLE Rectangle ("+ "nomR VARCHAR(100) PRIMARY KEY,"+  " x double,"+ " y double,"+ " Longueur double," + " Largeur double"+ ")");
			state.addBatch("CREATE TABLE Triangle ("+ "nomT VARCHAR(100) PRIMARY KEY,"+  " a double,"+ " b double,"+ " c double," + " d double ,"+ " e double ,"+ "f double" + ")");
			state.addBatch("create table Groupe(Id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,name varchar(40) NOT NULL UNIQUE)");
			state.executeBatch();
			state.close();
		}catch (SQLException e) {
			//e.getErrorCode()
			//throw new DaoException(e.getMessage());
		}
	}

}
