package uvsq21921358;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CercleDAO implements DAO<Cercle>{

	private static String base = Connexion.base;

	@Override
	public Cercle create(Cercle obj) {
		try (Connection connect = DriverManager.getConnection(base)){
			PreparedStatement prepare = connect.prepareStatement("INSERT INTO Cercle (nomC, x, y, rayon)" +"VALUES (?, ?, ?, ?)");
			prepare.setString(1, obj.getNomC());
			prepare.setDouble(2, obj.getCentre().x);
			prepare.setDouble(2, obj.getCentre().y);
			prepare.setDouble(1, obj.getRayon());
			System.out.println("Cr�ation reussie " + obj);
			int result = prepare.executeUpdate();
			assert result == 1; 
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return obj;
	}

	
	@Override
	public Cercle read(String id) {
		Cercle C1 = null;
		try (Connection connect = DriverManager.getConnection(base)){
			System.out.println(" Recherche " + id);
			PreparedStatement prepare = connect.prepareStatement("SELECT * FROM Cercle WHERE nomC = ?");
			prepare.setString(1, id);
			ResultSet result = prepare.executeQuery();
			if(result.next()){
				C1 = new Cercle(result.getString("getNomC()"),result.getDouble("getCentre().x"), result.getDouble("getCentre().y"),result.getDouble("getRayon()"));
				result.close();
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return C1;
	}

	@Override
	public Cercle update(Cercle obj) {
		try (Connection connect = DriverManager.getConnection(base)) {
			PreparedStatement prepare = connect.prepareStatement("UPDATE Cercle "+ "SET x = ? and y = ?"+ "WHERE nomC = ?");
			prepare.setDouble(1, obj.getCentre().x);
			prepare.setDouble(2, obj.getCentre().y);
			prepare.setString(3, obj.getNomC());
			int result = prepare.executeUpdate();
			assert result == 1;
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		System.out.println("Mise A Jour " + obj);
		return obj;
	}

	@Override
	public void delete(Cercle obj) {
		try (Connection connect = DriverManager.getConnection(base)){
			PreparedStatement prepare = connect.prepareStatement("DELETE FROM Cercle "+ "WHERE nomC = ?");
			prepare.setString(1, obj.getNomC());
			int result = prepare.executeUpdate();
			assert result == 1;
			System.out.println("Suppression reussie " + obj);
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	
}
