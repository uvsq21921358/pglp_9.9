package PERSISTANCE_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import FORME_GRAPHIQUE.Rectangle;
import FORME_GRAPHIQUE.Triangle;

public class TriangleDAO implements DAO<Triangle> {

	private static String base = Connexion.base;

	@Override
	public Triangle create(Triangle obj) {
		try (Connection connect = DriverManager.getConnection(base)){
			PreparedStatement prepare = connect.prepareStatement("INSERT INTO Triangle (nomT, a, b, c, d, e, f) VALUES (?, ?, ?, ?, ?, ?, ?)");
			prepare.setString(1, obj.getNomT());
			prepare.setDouble(2, obj.getP1().getX());
			prepare.setDouble(3, obj.getP1().getY());
			prepare.setDouble(4, obj.getP2().getX());
			prepare.setDouble(5, obj.getP2().getY());
			prepare.setDouble(6, obj.getP3().getX());
			prepare.setDouble(7, obj.getP3().getY());
			System.out.println("Creation reussie " + obj);
			int result = prepare.executeUpdate();
			assert result == 1; 
		}
		catch (SQLException e){
			e.printStackTrace(); 
		}
		return obj;
	}

	@Override
	public Triangle read(String id) {
		Triangle tri = null;
		try (Connection connect = DriverManager.getConnection(base)){
			System.out.println(" Recherche " + id);
			PreparedStatement prepare = connect.prepareStatement("SELECT * FROM Triangle WHERE nomT = ?");
			prepare.setString(1, id);
			ResultSet result = prepare.executeQuery();
			if(result.next()){
				tri = new Triangle(result.getString("nomT"),result.getDouble("a"), result.getDouble("b"),result.getDouble("c"),result.getDouble("d"),result.getDouble("e"),result.getDouble("f"));
				result.close();
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return tri;
	}

	@Override
	public Triangle update(Triangle obj) {
		try (Connection connect = DriverManager.getConnection(base)) {
			PreparedStatement prepare = connect.prepareStatement("UPDATE Triangle "+ "SET a = ? and b = ? and c = ? and d = ? and e = ? and f = ?"+ "WHERE nomCarre = ?");
			prepare.setDouble(1, obj.getP1().getX());
			prepare.setDouble(1, obj.getP1().getY());
			prepare.setDouble(1, obj.getP2().getX());
			prepare.setDouble(2, obj.getP2().getY());
			prepare.setDouble(1, obj.getP3().getX());
			prepare.setDouble(2, obj.getP3().getY());
			prepare.setString(3, obj.getNomT());
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
	public void delete(Triangle obj) {
		try (Connection connect = DriverManager.getConnection(base)){
			PreparedStatement prepare = connect.prepareStatement("DELETE FROM Triangle "+ "WHERE nomT = ?");
			prepare.setString(1, obj.getNomT());
			int result = prepare.executeUpdate();
			assert result == 1;
			System.out.println("Suppression reussie " + obj);
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Triangle> findAll() {
		List<Triangle> liste = new ArrayList<>();
		try (Connection connect = DriverManager.getConnection(base)){
			PreparedStatement prepare = connect.prepareStatement("SELECT FROM Triangle "+ "WHERE nomT = ?");
			ResultSet result = prepare.executeQuery();
	      while(result.next()){
	        liste.add(new Triangle(result.getString("nomT"),result.getDouble("a"), result.getDouble("b"),result.getDouble("c"),result.getDouble("d"),result.getDouble("e"),result.getDouble("f")));
	      }
	    
	    }catch(Exception e){
	      e.printStackTrace();
	    }
	  
	    return liste;
	}
	
}
