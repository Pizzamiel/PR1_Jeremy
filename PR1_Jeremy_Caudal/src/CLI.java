import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jeremy
 *
 */
public class CLI {
	static List <Option> options = new ArrayList<>();
	
	public List<String> toString(List<Option> options) {
		List <String> result = new ArrayList<>();
		for (Option option : options) {
				result.add(option.getAccess());
		}
		return result;
	}
	
	private static String toString1(Option option) {
		// TODO Auto-generated method stub
		return option.getAccess();
	}
	
	public void addOption(Option newOption) {
		boolean check = false;
		for (Option option : options) {
			if (option.getAccess() == newOption.getAccess()) {
				check=true;
			}
		}
			if(check) {
			System.out.println("Option ou acces deja utilise : " + toString1(newOption));
			}else {
				options.add(newOption);
			}
	}
	
	public void removeOption(Option oldOption) {
		boolean check = false;
		for (int i = 0; i < options.size() ; i++) {
			if (options.get(i) == oldOption) {
				options.remove(i);
				check = true;
			}
		}
			if(!check) {
			System.out.println("Option inconnue : " + toString1(oldOption));
			}
	}

	public void viewOptions() {
		if(options.isEmpty()) {
			System.out.println("aucunes options");	
		}else {
			System.out.println(toString(options));
		}
	}
	
	public static void analyser(String... args) {
		Map <String, String> result = new HashMap<>();
		
		boolean check = false;
		int i = 1;
		while (i <= args.length) {
		check = false;
			try {
				for (Option option : options) {
					if(args[i-1].matches("[+-]?\\d*(\\.\\d+)?")) {
						//System.out.println("next");
						check = true;
					}else {
						if (option.getAccess() == args[i-1]) {
							//option.executer(args[++i]);
							if(i < args.length) {
								//System.out.println(args.length);
								if(args[i].matches("[+-]?\\d*(\\.\\d+)?")) {
									//result.add(option.executer(args[++i]));
									result.put(option.getAccess(),option.executer(args[i]));
									check = true;
								}else {
									result.put(option.getAccess(),option.executer("null"));
									check = true;
								}
							}else {
								result.put(option.getAccess(),option.executer("null"));
								check = true;
							}
						}else {
						}
					}
				}
				if(!check) {
						System.out.println("Option inconnue : " + args[i-1]);	
				}
				i++;
			}catch (NumberFormatException e) {
				System.out.println(args[i] + " n'est pas le format attendu pour "+args[i-1]);
			}
		}
		if(result.isEmpty() == false) {
			System.out.println(result.values());
		}
	}
}
