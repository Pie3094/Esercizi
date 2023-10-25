public class range {
    public static boolean detRange() {
        try {
            int x = 101;
            if (x > 100) {
                throw new ArithmeticException();
            }
        }catch (Exception e){
            System.out.println("Errore");
        } return false;
    }
}
