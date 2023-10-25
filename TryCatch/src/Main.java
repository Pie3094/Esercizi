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

    }

    static void controllo(int value, int max, int min) {
        if (value < max && value > min) {
            System.out.println("Il valore è compreso");
        } else throw new ArithmeticException();
    }

}