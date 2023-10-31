import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Es2 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        Student studente = new Student("Piero", 20);
        Student studente2 = new Student("Pietro", 21);
        Student studente3 = new Student("Piera", 22);
        Student studente4 = new Student("Pier", 50);
        Student studente5 = new Student("Antonio", 18);
        Student studente6 = new Student("Massimo", 39);
        Student studente7 = new Student("Andrea", 29);
        Student studente8 = new Student("Luca", 21);
        Student studente9 = new Student("Merlo", 25);
        Student studente10 = new Student("AndreaGenitore1", 30);
        Student studente11 = new Student("AndreaGenitore2", 31);
        Student studente12 = new Student("Luca Salvini", 33);
        array.add(studente);
        array.add(studente2);
        array.add(studente3);
        array.add(studente4);
        array.add(studente5);
        array.add(studente6);
        array.add(studente7);
        array.add(studente8);
        array.add(studente9);
        array.add(studente10);
        array.add(studente11);
        array.add(studente12);
        System.out.println("Lista prima: " + array);
        Collections.sort(array, Comparator.comparingInt(Student::getAge));
        System.out.println("Lista dopo il sort ordine età: " + array);
        Collections.sort(array, Comparator.comparing(Student::getName));
        System.out.println("Lista dopo il sort alfabetico: " + array);
        Collections.sort(array, Collections.reverseOrder(Comparator.comparingInt(Student::getAge)));
        System.out.println("Lista dopo il sort, età al contrario: " + array);


    }
}
