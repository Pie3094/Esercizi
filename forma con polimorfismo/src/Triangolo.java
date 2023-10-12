public class Triangolo extends Forma {
    @Override
    public void calcolaArea(int base, int altezza) {
        System.out.println("Area del Triangolo: " + (base * altezza) / 2);
    }
}
