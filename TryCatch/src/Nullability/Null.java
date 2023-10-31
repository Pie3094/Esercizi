package Nullability;

public class Null {
    public static void main(String[] args) {

        System.out.println(nonNull(6, 0));

    }

    public static int nonNull(Integer numeratore, Integer denominatore) {
        try {
            if (numeratore != null && denominatore != null) {
                if (denominatore != 0) {
                    return numeratore / denominatore;
                } else {
                    throw new ArithmeticException("Non posso dividere per zero");
                }
            } else {
                throw new NullPointerException("Uno dei due valori è null, errore.");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

//              userConsent == null;
//          try {
//            if (userConsent == true) {
//                System.out.println("True!");
//            } else {
//                System.out.println("Nope!");
//            }
//
//        } catch (Exception e) {
//            System.out.println("Nessun valore" + e);
//        }

}