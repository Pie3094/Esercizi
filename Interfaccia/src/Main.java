import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(10, 5);
        Triangolo triangolo = new Triangolo(2, 6);
        triangolo.calcolaArea();
        rettangolo.calcolaArea();

    }

}


//    Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().
//        Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metvodo per il calcolo dell'area in maniera specifica.