import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il numero di auto: ");
        int selected = scan.nextInt();

        Modelli macchina1 = new Modelli("Audi", "A1", "FB999AD", 1400);
        Modelli macchina2 = new Modelli("Ford", "Fiesta", "Fb394EG", 1500);
        Modelli macchina3 = new Modelli("Wolkswagen", "Golf", "JF359OL", 1900);
        switch (selected) {
            case 1:
                System.out.println("La macchina selezionata è: " + macchina1);
                break;
            case 2:
                System.out.println("La macchina selezionata è: " + macchina2);
                break;
            case 3:
                System.out.println("La macchina selezionata è: " + macchina3);
                break;

        }

    }
}