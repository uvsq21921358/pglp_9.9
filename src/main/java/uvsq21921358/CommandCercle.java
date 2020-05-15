package uvsq21921358;

public class CommandCercle implements Command{

	private String[] param;
	private FormeGroup group;
	
	public CommandCercle(String[] param, FormeGroup group) {
		this.param=param;
		this.group=group;
	}

	@Override
	public void execute() {
		if(this.param.length !=4) {
			Affichage Aff= new Affichage();
			Aff.afficher("Erreur!!! Votre nombre de parametres saisi est incorrect.");
		}
		else {
			try {
				double a=Double.parseDouble(this.param[1]);
				double b=Double.parseDouble(this.param[2]);
				double c=Double.parseDouble(this.param[3]);
				group.addForme(new Cercle(param[0],a,b,c));
			}
			catch(NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
	
	
}
