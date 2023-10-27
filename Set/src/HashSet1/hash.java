package HashSet1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hash {
    public static void main(String[] args) {
        System.out.println(fill());
    }

    public static String fill() {
        Scanner scan = new Scanner(System.in);
        int value;

        System.out.println("Inserisci grandezza: ");
        value = scan.nextInt();
        Set<String> x = new HashSet<>();

        System.out.println("Inserisci " + value + " valori");
        for (int i = 0; i < value; i++) {
            x.add(scan.next());
        }
        return "La grandezza è " + value + "\nGli elementi sono: " +  x;

    }
}
//    Scrivere una funzione che restituisca un hashset riempito
//    Leggere l'hashSet e stampre grandezza ed elementi