package PERSISTANCE_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import FORME_GRAPHIQUE.Cercle;
import FORME_GRAPHIQUE.Rectangle;

public class RectangleDAO implements DAO<Rectangle> {

	private static String base = Connexion.base;

	@Override
	public Rectangle create(Rectangle obj) {
		try (Connection connect = DriverManager.getConnection(base)){
			PreparedStatement prepare = connect.prepareStatement("INSERT INTO Rectangle(nomR, x, y, Longueur,Largeur) VALUES (?, ?, ?, ?,?)");
			prepare.setString(1, obj.getNomR());
			prepare.setDouble(2, obj.getOrigineR().getX());
			prepare.setDouble(2, obj.getOrigineR().getY());
			prepare.setDouble(1, obj.getLongueur());
			prepare.setDouble(1, obj.getLargeur());
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
	public Rectangle read(String id) {
		Rectangle Rect1 = null;
		try (Connection connect = DriverManager.getConnection(base)){
			System.out.println(" Recherche " + id);
			PreparedStatement prepare = connect.prepareStatement("SELECT * FROM Rectangle WHERE nomR = ?");
			prepare.setString(1, id);
			ResultSet result = prepare.executeQuery();
			if(result.next()){
				Rect1 = new Rectangle(result.getString("nomR"),result.getDouble("x"), result.getDouble("y"),result.getDouble("Longueur"),result.getDouble("Largeur"));
				result.close();
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return Rect1;
	}

	@Override
	public Rectangle update(Rectangle obj) {
		try (Connection connect = DriverManager.getConnection(base)) {
			PreparedStatement prepare = connect.prepareStatement("UPDATE Rectangle "+ "SET x = ? and y = ? and Longeur = ? and Largeur = ?"+ "WHERE nomR = ?");
			prepare.setDouble(1, obj.getOrigineR().getX());
			prepare.setDouble(2, obj.getOrigineR().getY());
			prepare.setDouble(3, obj.getLongueur());
			prepare.setDouble(4, obj.getLargeur());
			prepare.setString(5, obj.getNomR());
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
	public void delete(Rectangle obj) {
		try (Connection connect = DriverManager.getConnection(base)){
			PreparedStatement prepare = connect.prepareStatement("DELETE FROM Rectangle "+ "WHERE nomR = ?");
			prepare.setString(1, obj.getNomR());
			int result = prepare.executeUpdate();
			assert result == 1;
			System.out.println("Suppression reussie " + obj);
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Rectangle> findAll() {
		List<Rectangle> liste = new ArrayList<>();
		try (Connection connect = DriverManager.getConnection(base)){
			PreparedStatement prepare = connect.prepareStatement("SELECT FROM Rectangle "+ "WHERE nomR = ?");
			ResultSet result = prepare.executeQuery();
	      while(result.next()){
	        liste.add(new Rectangle(result.getString("nomR"),result.getDouble("x"), result.getDouble("y"),result.getDouble("Longueur"),result.getDouble("Largeur")));
	      }
	    
	    }catch(Exception e){
	      e.printStackTrace();
	    }
	  
	    return liste;
	}
}
