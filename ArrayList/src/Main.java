import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        Student studente = new Student("Piero",20);
        Student studente2 = new Student("Pietro",21);
        Student studente3 = new Student("Piera",22);
        Student studente4 = new Student("Pier",23);
        array.add(studente);
        array.add(studente2);
        array.add(studente3);
        array.add(studente4);
        System.out.println(array);
    }
}