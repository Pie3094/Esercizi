package Scan;

import java.util.Scanner;

public class nner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 1;
        while(input!=0){
            System.out.println("Cosa vuoi fare");
            String test = scan.nextLine();
            scan.nextLine();
            if(test.equals("Aggiuingere un oggetto")){
                System.out.println("Stiamo aggiungendo un oggetto");
            } else{
                System.out.println("non stiamo aggiungendo niente");
            }
        }

    }

}