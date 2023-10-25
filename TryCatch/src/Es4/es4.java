package Es4;

public class es4 {
    public static void main(String[] args) throws Exception {
        int[] array = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arrayDiv(array, 0, 5));
        } catch (Exception c) {
            System.out.println("Errore " + c);
        }
    }

    public static String arrayDiv(int[] arrayA, double divisore, int indice) throws Exception {
        for (int i = 0; i < arrayA.length; i++) {
            double risultato = arrayA[i] / divisore;
            if (indice < 0 || indice >= arrayA.length) {
                throw new Exception("Non esiste quell'indice");
            }
            if (divisore == 0) {
                throw new ArithmeticException("Non puoi dividere per zero!!");
            }

//            if (arrayA[i] / divisore == 0) {
//                System.out.println(arrayA[i]);
            System.out.print(risultato + " ");
        }
        return "eseguito";
    }
}

//Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0 e gestista sia l'eccezione della divisione che quella di indice non presente nell'array, leggendone il messaggio. Eseguire sempre un blocco di codice scrivendo un messaggio in console.