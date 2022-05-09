/**
 * @author Jeremy
 *
 */
public class K extends Option implements Options {
	private int valeur = 150;
	
	public K(String access, String descritpion, int valeur) {
		super(access, descritpion);
		this.valeur = valeur;
	}
	
	public K(String access, String descritpion) {
		super(access, descritpion);
	}

	@Override
	public String executer(String valeur) {
		if(valeur != "null") {
			this.valeur = Integer.parseInt(valeur);
		}
		return "indice = " + this.valeur;
	}
}
