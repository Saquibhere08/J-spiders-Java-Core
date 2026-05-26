package commandLine;

public class args1 {
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}
/** why we use command line Arguments
 * It is used because it allows us to provide input at runtime without modifying the whole program.
 * It helps to run programs automatically by giving them the needed information from outside.

Working of Command-Line Arguments
*Command-line arguments in Java are space-separated values passed to the main(String[] args) method
*JVM wraps them into the args[] array, where each value is stored as a string (e.g., args[0], args[1], etc.).
*The number of arguments can be checked using args.length.
*/
