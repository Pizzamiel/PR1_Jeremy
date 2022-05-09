
public class C extends Option implements Options {
	public Mode mode = Mode.CREUSE;
	
	public C(String access, String descritpion) {
		super(access, descritpion);
	}

	@Override
	public String executer(String valeur) {
		return "Mode = " + mode;
	}
}