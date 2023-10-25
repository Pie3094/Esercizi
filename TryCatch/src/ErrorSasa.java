import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class ErrorSasa {

    public static void sasa() {
        try{
        String test = "1";
        if (test.equals("1")) {
            throw new ArithmeticException("1");
        }
    }catch (Exception e){
            System.out.println("Errore " + e);
        }
    }
}
