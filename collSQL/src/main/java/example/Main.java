package example;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        jdbc.collegamento();
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci comando: \n 1)Stampa students2 \n 2)Inserisci 2 colonne in students2 \n 3)Inserisci nome e congnome in students2 \n 4)Cerca studente per nome \n 5)Alter una table [aggiungi 1 colonna] \n 6)Update 1 valore tramite indicizzazione ID \n 7)Elimina una colonna \n 8)Cambia nome a colonna \n 9)SPOSTA con ID tra tabelle");
        menu.menu1(scan.nextInt());
        scan.nextLine();
    }
}