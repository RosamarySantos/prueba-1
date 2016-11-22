
import java.util.Scanner;

/**Clase que experimenta con String
* devolviendo la cadena en plural y
* nos dice si empieza por vocal y
* si es una conjunción copulativa
* @author Manuel
* @version 1.0 
*/

public class Repaso {
    public static void main(String[] arg) {
      //creamos un Scanner para leer una palabra
      //almacenamos el contenido en una variable llamada palabraLeida
      System.out.println("Introduce una palabra");
      Scanner in = new Scanner(System.in);
      String palabraLeida = in.next();
      in.close(); //cierro el Scanner
      System.out.println("Palabra leida: " + palabraLeida);
      //descomentamos la siguiente línea cuando tengamos hecho el método
      String palabraPlural= devolverPalabraPlural(palabraLeida);
      System.out.printf("El plural de %s es %s%n", palabraLeida, palabraPlural);
      //descomentamos la siguiente línea cunado tengamos hecho el método
      boolean empiezaVocal = empiezaPorVocal(palabraLeida);
      System.out.printf("¿Comienza %s por vocal? %b%n", palabraLeida, empiezaVocal);
    
      //descomentamos la siguiente línea cunado tengamos hecho el método
      boolean conjuncionCopulativa= esUnaConjuncionCopulativa(palabraLeida);
      System.out.printf("¿Es %s una conjunción copulativa? %b%n", palabraLeida, conjuncionCopulativa);

    }
    //implementación del método devolverPalabraPlural
    /** método devolverPalabraPlural
    * @param palabra parámetro de tipo String
    * @return la palabra en plural
    */
    public static String devolverPalabraPlural(String palabra){
      return palabra+"s";
    }
    //implementación del método empiezaPorVocal
    /** método empiezaPorVocal
    * @param palabra parámetro de tipo String
    * @return true si comienza por vocal
    */
    public static boolean empiezaPorVocal(String palabra){
      char primeraLetra = palabra.toLowerCase().charAt(0);//primer caracter en minúscula
      return primeraLetra == 'a' || primeraLetra == 'e' || primeraLetra == 'i'
          || primeraLetra == 'o' || primeraLetra == 'u' || primeraLetra == 'á'
          || primeraLetra == 'é' || primeraLetra == 'ó' || primeraLetra == 'í'
          || primeraLetra == 'ú' ;
	
    }

    //implementación del método  esUnaConjuncionCopulativa
    /** método esUnaConjuncioCopulativa
    * @param palabra parámetro de tipo String
    * @return true si es una conjunción copulativa
    */
    //las conjunciones copulativas son:  Y, E, NI, QUE
    public static boolean esUnaConjuncionCopulativa(String palabra){
      return palabra.equalsIgnoreCase("ni") || palabra.equalsIgnoreCase("y")
          || palabra.equalsIgnoreCase("e") || palabra.equalsIgnoreCase("que");
    }







  }

  
