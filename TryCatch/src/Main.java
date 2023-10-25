import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        try {
            controllo(10, 9, 0);
            System.out.println("Il numero è compreso");

        } catch (Exception e) {
            System.out.println("Il numero non è compreso, errore " + e);
        }

        try {
            charInt('a');
        } catch (Exception e) {
            System.out.println("Errore, non un numero");
        }

    }

    static void controllo(int value, int max, int min) {
        if (value < max && value > min) {
            System.out.println("Il valore è compreso");
        } else throw new ArithmeticException();
    }

    public static void charInt(char mioChar) throws Exception {
        if (Character.isDigit(mioChar)) {
            System.out.println(mioChar);
        } else throw new Exception("Non è un carattere, errore");
    }
}