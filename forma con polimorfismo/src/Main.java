import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo = new Triangolo();

//        forma.calcolaArea(0, 0);
//        rettangolo.calcolaArea(4, 6);
//        triangolo.calcolaArea(5, 3);

        Forma[] forme = {forma, rettangolo, triangolo};
        for ( Forma formaTemp : forme ){
            formaTemp.calcolaArea(10, 5);
        }
        System.out.println();

    }
}

// ctrl + shit + a softwrap