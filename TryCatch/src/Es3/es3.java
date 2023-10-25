package Es3;

public class es3 {
    public static void main(String[] args) throws Exception {
        try {
            divZero(10);
        }catch (Exception e){
            System.out.println("Non puoi dividere per zero, errore " + e);
        }
    }
    public static int divZero(int x){
        int result = x / 0;
        return result;
    }
}


//Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.