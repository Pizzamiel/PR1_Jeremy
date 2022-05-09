public class PageRankClassique {

	//public static void main(String... args) {
	//	Configuration configuration = CLIClassique.configuration(args);
	//	System.out.println(configuration);
		// Le reste du programme... Omis.
	//}
	public static void main(String... args) {
		K k = new K("-K", "indice");
		C c = new C("-C", "heure");
		CLI cli = new CLI();
		cli.addOption(k);
		cli.addOption(c);
		cli.addOption(k);
		cli.viewOptions();
		CLI.analyser("-K","50","-K","3","-C");
		// Le reste du programme... Omis.
		}
	
}
