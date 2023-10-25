import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try { //Esegui (prova) questa parte di codice
            System.out.println("Inserisci num 1");
            int x = scan.nextInt();
            System.out.println("Inserisci num 2");
            int y = scan.nextInt();

            int result = x / y;
            System.out.println("Risultato : " + result);
        } catch (ArithmeticException e) { //Se dai 5 / 0 restituirà questo anziché errore
            System.out.println("Non puoi dividere per zero");
        }catch(InputMismatchException e){ //Questi 2 sono errori specifici per tipo di errore
            System.out.println("Non puoi dividere un numero per una Stringa");
        }catch(Exception e){ //Questo è generico se succede un errore
            System.out.println("C'è stato un problema");
        }finally{ //Viene eseguito sempre e comunque
            System.out.println("Eseguito comunque");
            scan.close();
        }
    }
}