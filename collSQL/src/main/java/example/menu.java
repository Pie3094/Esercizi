package example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;

public class menu {
    public static void menu1(int caso) throws SQLException {
        try {
            Scanner scan = new Scanner(System.in);

            switch (caso) {
                case 1:
                    jdbc.stampa();
                    return;
                case 2:
                    System.out.println("Inserisci i nomi delle 2 colonne che vuoi aggiungere: ");
                    jdbc.creaTable2Colonne(scan.nextLine(), scan.nextLine());
                    break;
                case 3:
                    System.out.println("Inserisci Nome e poi Cognome: ");
                    jdbc.insertStudent(scan.nextLine(), scan.nextLine());
                    break;
                case 4:
                    System.out.println("Inserisci il nome di chi vuoi cercare");
                    jdbc.searchStudent(scan.nextLine().toLowerCase(), jdbc.collegamento().getResultSet());
                    break;
                case 5:
                    System.out.println("Inserisci nome della tabella da modificare, quindi il nome della colonna da aggiungere");
                    jdbc.alterTableAddColumn(scan.nextLine(), scan.nextLine());
                    break;
                case 6:
                    System.out.println("Inserisci il nome della colonna, poi il valore da aggiungere, infine decidi dove in base all'ID");
                    jdbc.aggiungiValoreColonna(scan.nextLine(), scan.nextLine(), scan.nextInt());
                    break;
                case 7:
                    System.out.println("Inserisci il nome della colonna da eliminare");
                    jdbc.dropColumn(scan.nextLine());
                    break;
                case 8:
                    System.out.println("Inserisci prima il nome della colonna da modificare, quindi il nuovo nome");
                    jdbc.cambiaNomeColonna(scan.nextLine(), scan.nextLine());
                    break;
                case 9:
                    System.out.println("Inserisci, per primo la tabella in cui spostare l'oggetto, poi quella da cui prenderlo, e infine l'id");
                    jdbc.spostaTraTable(scan.nextLine(), scan.nextLine(), scan.nextInt());
            }
        } catch (Exception e) {
            new RuntimeException();
        }

    }
}
