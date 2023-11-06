public class recor2 {
    public static void main(String[] args) {
        recor primo = new recor(11, 15);
        recor secondo = new recor(11, 16);
        recor terzo = new recor(11, 20);

        if (primo.x() == primo.y()) {
            System.out.println("Si trova nello stesso punto di coordinate uguali x e y: " + primo.x());
        } else {
            System.out.println("Il punto si trova alla posizione x: " + primo.x() + " e y: " + primo.y());
        }
        Boolean sonoUguali = primo.equals(secondo);
        System.out.println("sono uguali? " + sonoUguali);
    }
}
