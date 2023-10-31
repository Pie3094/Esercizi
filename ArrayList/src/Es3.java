import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Es3 {
    public static void main(String[] args) {
        LinkedList<Frutta> lista = new LinkedList<>();
        Frutta frutto1 = new Frutta("Banana");
        Frutta frutto2 = new Frutta("Luca");
        Frutta frutto3 = new Frutta("Ananas");
        Frutta frutto4 = new Frutta("Giorgia");

        lista.add(frutto1);
        lista.add(frutto2);
        lista.add(frutto3);
        lista.add(frutto4);
        System.out.println("Lista base " + lista);

        Frutta frutto5 = new Frutta("Jonathan");
        Frutta frutto6 = new Frutta("Limone");
        lista.addFirst(frutto5);
        lista.addLast(frutto6);
        System.out.println("Lista aggiornata: " + lista);

        // in più per capire
        Collections.sort(lista, Comparator.comparing(Frutta::getNome));
        // lista.sort(Comparator.comparing(Frutta::getNome));
        System.out.println("Lista aggiornata2: " + lista);

    }
}
