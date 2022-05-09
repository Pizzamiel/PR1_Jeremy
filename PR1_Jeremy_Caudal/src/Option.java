
public abstract class Option {
	private String access;
	private String descritpion;
	
	public Option(String access, String descritpion) {
		this.access = access;
		this.descritpion = descritpion;
	}
	
	public String getAccess() {
		return this.access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getDescritpion() {
		return descritpion;
	}

	public void setDescritpion(String descritpion) {
		this.descritpion = descritpion;
	}

	protected abstract String executer(String valeur);
}
