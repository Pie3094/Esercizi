package Box;

public class autobox {
    public static void main(String[] args) {
        System.out.println(sum(10, 2));
        System.out.println(sumInteger(10, 2));
        System.out.println(oneChar('g'));
        System.out.println(oneCharacter('e'));
        System.out.println(autoboxing(1, 2.34, 'ì'));
        System.out.println(unboxing(2, 2.345, 'ù'));
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sumInteger(Integer x, Integer y) {
        return x + y;
    }

    public static char oneChar(char a) {
        return a;
    }

    public static char oneCharacter(Character a) {
        return a;
    }

    public static String autoboxing(int x, double y, char z) {
        Integer ger = x;
        Double doub = y;
        Character cha = z;
        return "I valori trasformati sono, int: " + ger + ", double: " + doub + ", char: " + cha;
    }


    public static String unboxing(Integer x, Double y, Character z) {
        int ger = x;
        double doub = y;
        char cha = z;
        return "I valori trasformati sono, Integer: " + ger + ", Double: " + doub + ", Character: " + cha;
    }

}

