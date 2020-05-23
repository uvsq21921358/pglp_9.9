package uvsq21921358;

import static org.junit.Assert.*;

import org.junit.Test;

import CMD.CommandCercle;
import CMD.CommandPrint;
import CMD.Interpreteur;
import FORME_GRAPHIQUE.Cercle;
import FORME_GRAPHIQUE.FormeGroup;
/**
 * test d'implementation de la commande de creation d'un cercle
 * @author utilisateur
 *
 */
public class CommandCercleTest {

	@Test
	public void executeTest() {
		
		FormeGroup form=new FormeGroup();
		Interpreteur inter=new Interpreteur();
		inter.setParametersT(new String[] {"Mon_cercle@", "0","0","3"});
		CommandCercle com=new CommandCercle(inter);
		com.execute();
		//form.AffichonsGroup(); 
		CommandPrint comAff=new CommandPrint(inter); 
		comAff.execute();
	} 

	@Test
	public void erreurSaisi_Parametre_Test() {
		FormeGroup form1=new FormeGroup();
		Interpreteur inter=new Interpreteur();
		inter.setParametersT(new String[] {"Mon_cercle@","0","3"});
		CommandCercle com=new CommandCercle(inter);
		com.execute(); 
		CommandPrint comAff=new CommandPrint(inter); 
		comAff.execute();
	}
	
	@Test
	public void erreur2Test() {
		FormeGroup form1=new FormeGroup();
		Interpreteur inter=new Interpreteur();
		inter.setParametersT(new String[] {"Mon_cercle@","0","3","fff"});
		CommandCercle com=new CommandCercle(inter);
		com.execute(); 
		CommandPrint comAff=new CommandPrint(inter); 
		comAff.execute();
	}
}
