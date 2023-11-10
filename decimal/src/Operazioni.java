import java.math.BigDecimal;
import java.math.RoundingMode;


public class Operazioni {
    enum operation {SOMMA, SOTTRAZIONE, MOLTIPLICAZIONE, DIVISIONE, MIN, MAX}

    private BigDecimal value1;
    private BigDecimal value2;
    private operation op;

    public Operazioni(BigDecimal value1, BigDecimal value2, operation op) {
        this.value1 = value1;
        this.value2 = value2;
        this.op = op;
    }

    public BigDecimal getValue1() {
        return value1;
    }

    public void setValue1(BigDecimal value1) {
        this.value1 = value1;
    }

    public BigDecimal getValue2() {
        return value2;
    }

    public void setValue2(BigDecimal value2) {
        this.value2 = value2;
    }

    public operation getOp() {
        return op;
    }

    public void setOp(operation op) {
        this.op = op;
    }

    public BigDecimal eseguiOperaione() {
        System.out.println("Stai eseguendo: " + op + " tra i valori: " + value1 + ", " + value2);
        switch (this.op) {
            case SOMMA:
                return somma(value1, value2);
            case SOTTRAZIONE:
                return sottrazione(value1, value2);
            case MOLTIPLICAZIONE:
                return moltiplicazione(value1, value2);
            case DIVISIONE:
                return divisione(value1, value2);
            case MAX:
                return max(value1, value2);
            case MIN:
                return min(value1, value2);
        }
        return BigDecimal.ZERO;

    }

    public static BigDecimal somma(BigDecimal value1, BigDecimal value2) {
        return value1.add(value2);
    }

    public static BigDecimal sottrazione(BigDecimal value1, BigDecimal value2) {
        return value1.subtract(value2);
    }

    public static BigDecimal moltiplicazione(BigDecimal value1, BigDecimal value2) {
        return value1.multiply(value2);
    }

    public static BigDecimal divisione(BigDecimal value1, BigDecimal value2) {
        try {
            return value1.divide(value2, 10, RoundingMode.DOWN); // Aggiuggendo un RoundingMode.DOWN il numero diventa rappresentabile sempre e quindi non da errore
        } catch (Exception e) {
            throw new ArithmeticException("Non posso dividere i valori, errore : " + e);

        }
    }

    public static BigDecimal max(BigDecimal value1, BigDecimal value2) {
        return value1.max(value2);
    }

    public static BigDecimal min(BigDecimal value1, BigDecimal value2) {
        return value1.min(value2);
    }
}


// CTRL R = TROVA E SOSTITUISCI