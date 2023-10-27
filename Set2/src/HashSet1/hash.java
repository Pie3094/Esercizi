package HashSet1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hash {
    public static void main(String[] args) {
        Set<String> x = new HashSet<>();
        System.out.println(fill(x));
        System.out.println(verifica(x));
        System.out.println(remove(x));
    }

    public static String fill(Set<String> x) {
        Scanner scan = new Scanner(System.in);
        int value;

        System.out.println("Inserisci grandezza: ");
        value = scan.nextInt();
        scan.nextLine();

        System.out.println("Inserisci " + value + " valori");
        for (int i = 0; i < value; i++) {
            x.add(scan.next());
        }
        return "La grandezza è " + value + "\nGli elementi sono: " + x;

    }

    public static String verifica(Set<String> x) {
        Scanner scan = new Scanner(System.in);
        String value;

        System.out.println("Verifica valore");
        value = scan.nextLine();
        boolean isThere = false;

        for (int i = 0; i < x.size(); i++) {
            if (x.contains(value.toLowerCase())) {
                isThere = true;
                return "il valore " + value + " è presente? " + isThere;
            }
        }
        return "il valore " + value + " è presente? " + isThere;

    }
    public static String remove(Set<String> x) {
        Scanner scan = new Scanner(System.in);
        String value;

        System.out.println("Elimina valore");
        value = scan.nextLine();
        boolean isThere = false;

        for (int i = 0; i < x.size(); i++) {
            if (x.contains(value.toLowerCase())) {
                x.remove(value);
                isThere = true;
                return "il valore " + value + " è stato rimosso, nuova stampa: " + x;
            }
        }
        return "il valore " + value + " non è presente.";

    }
}
//    Scrivere una funzione che restituisca un hashset riempito
//    Leggere l'hashSet e stampre grandezza ed elementi