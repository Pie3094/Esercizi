public class Triangolo extends Forma {
    int base;
    int altezza;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public void calcolaArea() {
        System.out.println("L'area del triangolo è: " + base * altezza / 2);

    }

}
