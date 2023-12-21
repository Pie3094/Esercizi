package org.example;

import jdk.jfr.Experimental;

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
        } return null;
    }

    public static void stampa() {
        try{
        ResultSet resultSet = collegamento().executeQuery("select * from students");
        while (resultSet.next()) {
            System.out.print("Nome: ");
            System.out.println(resultSet.getString("last_name"));
            System.out.print("Cognome: ");
            System.out.println(resultSet.getString("first_name"));
            System.out.print("Id studente: ");
            System.out.println(resultSet.getString("student_id"));
            System.out.println(" ");
        }}catch (Exception e){
            new RuntimeException();
        }

    }

}
