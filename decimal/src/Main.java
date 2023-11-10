import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Operazioni operation = new Operazioni(BigDecimal.valueOf(8.2), BigDecimal.valueOf(7.6), Operazioni.operation.SOMMA);
        Operazioni operation1 = new Operazioni(BigDecimal.valueOf(18), BigDecimal.valueOf(12), Operazioni.operation.DIVISIONE);
        Operazioni operation2 = new Operazioni(BigDecimal.valueOf(2.2), BigDecimal.valueOf(7.6), Operazioni.operation.MAX);
        Operazioni operation3 = new Operazioni(BigDecimal.valueOf(2.2), BigDecimal.valueOf(7.6), Operazioni.operation.MIN);


        System.out.println(operation.eseguiOperaione());
        System.out.println(operation1.eseguiOperaione());
        System.out.println(operation2.eseguiOperaione());
        System.out.println(operation3.eseguiOperaione());

    }
}


//    Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e
//    divisione, min e max) definita in un enum, crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//        Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo