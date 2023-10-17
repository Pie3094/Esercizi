import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Immetti un numero da 1 a 100");
        Scanner scan = new Scanner(System.in);
        int scanner = scan.nextInt();
        try {
            if (scanner < 1 || scanner > 100) {
                throw new IllegalArgumentException(" ");
            }

            boolean vero = true;
            System.out.println(vero);

        } catch (Exception e) {
                boolean vero = false;
                System.out.println(vero);
        }

    }
}
