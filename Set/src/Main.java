import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> insieme1 = new HashSet<String>(Arrays.asList("1", "2", "3")); //Uso Set come generico per poterlo trasformare in seguito se mi serve
        insieme1.add("4");
        System.out.println("Insieme 1: " + insieme1);

        // for(String element: insieme1){
        //     System.out.println("insieme 1 element " + element);
        //      if(Objects.equals(element, "3")){
        //         insieme1.remove(element); // non funziona perché non può rimuovere l'elemento durante il ciclo
        //       }
        //    }

        Iterator<String> iterator = insieme1.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Insieme1 element: " + element);
            if (element == "3") {
                iterator.remove();
            }
        }

        Set<String> insieme2 = new HashSet<String>();
        insieme2.add("1");
        insieme2.add("2");
        insieme2.add("3");
        insieme2.remove("2");
        System.out.println("insieme 2 " + insieme2);
    }
}