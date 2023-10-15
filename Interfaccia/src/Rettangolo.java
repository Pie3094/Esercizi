public class Rettangolo implements Forma {
    int base;
    int altezza;
    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    public void calcolaArea() {
        System.out.println("L'area del rettangolo è: " + base * altezza);

    }
}
