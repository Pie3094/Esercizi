package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc {

    private static String url = "jdbc:mysql://localhost:3306/newdb";
    private static String usr = "root";
    private static String psw = "7472";

    public static Statement collegamento() {
        try {
            Connection connection = DriverManager.getConnection(url, usr, psw);
            return connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void stampa() {
        try {
            ResultSet resultSet = collegamento().executeQuery("select * from students2");
            while (resultSet.next()) {
                System.out.print("Nome: ");
                System.out.println(resultSet.getString("name"));
                System.out.print("Cognome: ");
                System.out.println(resultSet.getString("surname"));
                System.out.print("Id studente: ");
                System.out.println(resultSet.getString("id"));
                System.out.println(" ");
            }
        } catch (Exception e) {
            new RuntimeException();
        }

    }

    public static void creaTable2Colonne(String colonna1, String colonna2) {
        try {
            String query = "CREATE TABLE IF NOT EXISTS students2 (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," + colonna1 + " VARCHAR(30) NOT NULL, " + colonna2 + " VARCHAR(30) NOT NULL);";
            collegamento().execute(query);
        } catch (Exception e) {
            new RuntimeException();
        }
    }

    public static void insertStudent(String nome, String cognome) {
        try {
            String query = "INSERT INTO students2 (name, surname) VALUES ('" + nome + "', '" + cognome + "');";
            collegamento().execute(query);
        } catch (Exception e) {
            new RuntimeException();
        }
    }

    public static void searchStudent(String nome, ResultSet rs) { // NON FUNZIONA
        try {
            String query = "SELECT *\n" +
                    "FROM students2\n" +
                    "WHERE name = '" + nome + "';";
            rs = collegamento().executeQuery(query);
            while (rs.next()) {
                rs.getString("name");
            }
        } catch (Exception e) {
            new RuntimeException();
        }
    }

    public static void alterTableAddColumn(String nomeTabella, String colonna) {
        try {
            String query = "ALTER TABLE " + nomeTabella + " ADD COLUMN " + colonna + " VARCHAR(30);";
            collegamento().execute(query);
        } catch (Exception e) {
            new RuntimeException();
        }
    }

    public static void aggiungiValoreColonna(String colonna, String valore, int id) {
        try {
            String query = "UPDATE newdb.students2 SET " + colonna + "='" + valore + "' WHERE id=" + id + ";";
            //"UPDATE newdb.students2 SET " + colonna + "='" + valore + "' WHERE name='" + name + "';";
            //  "UPDATE newdb.students2 SET country ='Italia' WHERE id=1";
            collegamento().executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void dropColumn(String nomeColonna) {
        try {
            String query = "ALTER TABLE newdb.students2 DROP " + nomeColonna + ";";
            collegamento().executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cambiaNomeColonna(String nomeColonna, String newName) {
        try {
            String query = "ALTER TABLE newdb.students2 CHANGE " + nomeColonna + " " + newName + " VARCHAR(30);";
            // "ALTER TABLE newdb.students2 RENAME " + nomeColonna + " TO '" + newName + "';";
            // "ALTER TABLE sp_rename 'newdb.students2." + nomeColonna + "', '" + newName + "', 'COLUMN'";
            // "ALTER TABLE newdb.students2 CHANGE " + nomeColonna + " " + newName + " " + tipoColonna;
            collegamento().executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void spostaTraTable(String nomeTabella1, String nomeTabella2, int id){
        try{
            String insertQuery = "INSERT INTO " + nomeTabella1 + " SELECT * FROM " + nomeTabella2 + " WHERE id=" +id;
            collegamento().executeUpdate(insertQuery);
            String deleteQuery = "DELETE FROM " + nomeTabella2 + " WHERE id=" + id;
            collegamento().executeUpdate(deleteQuery);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//            String query = "INSERT INTO " + nomeTabella1 + " (SELECT * FROM " + nomeTabella2 + " FOR UPDATE); DELETE FROM " + nomeTabella2 + " WHERE id=" + id+ ";";


//    ResultSet resultSet = collegamento().executeQuery(query);
//            while (resultSet.next()) {
//                    System.out.println(resultSet.getString("name"));
//                    System.out.print(resultSet.getString(" adress"));
//                    System.out.print(resultSet.getString(" id"));

