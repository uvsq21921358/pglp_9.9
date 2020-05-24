package INTERFACE_USER;

import java.util.Scanner;

import CMD.InitBD;
import EXCEPTIONS.DaoException;


public class DrawingApp {

	static DrawingTUI drawing=new DrawingTUI();
    static Scanner scaner = new Scanner(System.in);
    static String rep;
    static String saisie;
    
    
    public static void run( String[] args) 
	{
    	
    	//Scanner rep = new Scanner(System.in);
    			try {
    				InitBD.createTables();
    			} catch (DaoException e1) {
    				//e1.printStackTrace();	
    			}
    			
    	while(true){
    			saisie=scaner.nextLine();
    			drawing.nextCommand(saisie);
    			System.out.println("\n");
    			System.out.println("SAISIR UNE NOUVELLE COMMANDE:"); 
    			
    		}
    	
  			  
    }
    
    public static void main (String [] args) {
    	
    	
    		
    			System.out.println("*************MON LOGICIEL DE DESSIN***************\n");
    			System.out.println("La liste des commandes que vous pourriez saisir : ");
    			System.out.println("cer1 =Cercle( (0, 0), 50)");
    			System.out.println("car2 =Carre( (0, 0), 30)");
    			System.out.println("rec1 =Rectangle( (0, 0), 40, 10)");
    			System.out.println("tri1 =Triangle( (0, 0), (2, 2), (4, 0))");
    			System.out.println("translate =Move( c1, (10, 20))");
    			System.out.println("translateAll =Move( All, (10, 20))");
    			System.out.println("Affiche =View( Cercle, cer1)");
    			System.out.println("Save");
    			System.out.println("groupe =CreateGroup( nom)");
    			System.out.println("Addgroupe =Add( nomGroupe, forme)");
    			System.out.println("quitter =quit\n");
    			System.out.println("VEUILLEZ SAISIR VOTRE COMMANDE SVP:\n");
    			run(args); 
    			
    			

    	
    }
    
}
