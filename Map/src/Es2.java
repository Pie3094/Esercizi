import java.util.*;

public class Es2 {
    public static void main(String[] args) {
        HashMap<String, Integer> persone = new HashMap<>();
        persone.put("Piero", 29);
        persone.put("Gianpaolo", 28);
        persone.put("Luca", 22);
        persone.put("Giorgia", 24);
        persone.size();
        System.out.println(persone);
        System.out.println(persone.size());
        // Come si cicla per elementi
        for (Map.Entry<String, Integer> element : persone.entrySet()) {
            System.out.println("Gli elementi sono " + element);
        }
        // Come si cicla per chiave
        for (String key : persone.keySet()) {
            System.out.println("Le chiavi sono " + key);
        }
        // Come si cicla per oggetto
        for (Integer values : persone.values()) {
            System.out.println("I values sono " + values);
        }

        List<String> ordine = new ArrayList<>(persone.keySet());
        Collections.sort(ordine);
        System.out.println(ordine);

    }

}

