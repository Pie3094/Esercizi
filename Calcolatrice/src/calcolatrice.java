import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        double numero1 = scan.nextDouble();
        System.out.println("Inserisci operatore algebrico: ");
        char algebra = scan.next().charAt(0);
        System.out.println("Inserisci il secondo numero: ");
        double numero2 = scan.nextDouble();

        double finale = 0;

        switch (algebra) {
            case '+':
                finale = numero1 + numero2;
                break;
            case '-':
                finale = numero1 - numero2;
                break;
            case '*':
                finale = numero1 * numero2;
                break;
            case '/':
                if (numero1 != 0 && numero2 != 0) {
                    finale = numero1 / numero2;
                } else {
                    System.out.println("Non posso dividere per zero");
                } break;
            default:
                System.out.println("Immetti, per primo un numero, poi l'operatore algebrico e infine un altro numero");

        } System.out.println("Il risultato finale è : " + finale);
    }
}

//    public static void Calcolo(int valore1, int valore2, char algebra){}


