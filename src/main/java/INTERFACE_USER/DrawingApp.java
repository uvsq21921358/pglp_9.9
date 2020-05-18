package INTERFACE_USER;

import java.util.Scanner;

import CMD.Command;

public class DrawingApp {

	private final static DrawingTUI drawing=new DrawingTUI();
    private static  Command commande;
    
    private static void run(){
    	 Scanner scaner = new Scanner(System.in);
         String saisie=scaner.nextLine();
         commande =drawing.nextCommand(saisie);
         System.out.println(commande);
         commande.execute();
    }
    public static void main (String [] args) {
    	
    	DrawingApp.run();  
    	
    }
    
}
