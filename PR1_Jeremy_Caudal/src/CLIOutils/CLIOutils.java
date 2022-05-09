package CLIOutils;
import java.lang.reflect.Field;

public class CLIOutils<T> {
	
  @SuppressWarnings("unchecked")
public CLI fromClass(T configuration) {
	  String nomClass;
      nomClass = configuration.getClass().getName();
      //CLI  = new CLI();
      System.out.println(nomClass);
      Field[] fields = configuration.getClass().getDeclaredFields();
      for (int i = 0; i < fields.length; i++) {
    	  System.out.println("Field found: " +
               fields[i].toString());
      }
      //string test = (String)fields[0];
      return new CLI();
  }
}    //Pas réussi