package uvsq21921358;

import java.util.HashMap;

public class ListeCommad {

	protected HashMap<String,Command> set=new HashMap<>();
	private String[] params;
	private FormeGroup forme;
	public ListeCommad() {
		set.put("Cercle", new CommandCercle(params,forme));
	}
	
	public void setParams(String[] params) {
		this.params=params;
	}
}
