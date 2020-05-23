package uvsq21921358;

import org.junit.Test;

import CMD.CommandCarre;
import CMD.CommandPrint;
import CMD.Interpreteur;
import FORME_GRAPHIQUE.FormeGroup;
import INTERFACE_USER.DrawingTUI;
/**
 * test d'implementation de la commande de creation d'un carré
 * @author utilisateur
 *
 */
public class CommandCarraTest {

	@Test
	public void executeTest() {
		
		//FormeGroup form=new FormeGroup();
		Interpreteur inter=new Interpreteur();
		inter.setParametersT(new String[] {"Mon_carre@", "0","0","4"});
		CommandCarre com=new CommandCarre(inter);
		com.execute(); 
		 DrawingTUI affich = new DrawingTUI();
		 affich.printDessin(inter);
	}
	
	@Test
	public void erreurSaisi_Parametre_Test() {
		//FormeGroup form1=new FormeGroup();
		Interpreteur inter=new Interpreteur();
		inter.setParametersT(new String[] {"Mon_Carree@","0","3"});
		CommandCarre com=new CommandCarre(inter);
		com.execute(); 
		DrawingTUI affich = new DrawingTUI();
		affich.printDessin(inter);
	}
	
	@Test
	public void erreurSaisi__Test() {
		//FormeGroup form1=new FormeGroup();
		Interpreteur inter=new Interpreteur();
		inter.setParametersT(new String[] {"Mon_Carree@","0","3","ddd"});
		CommandCarre com=new CommandCarre(inter);
		com.execute(); 
		DrawingTUI affich = new DrawingTUI();
		affich.printDessin(inter);
	}
}
