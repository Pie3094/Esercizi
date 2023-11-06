import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> persone = new HashMap<>();
        persone.put(29, "Piero");
        persone.put(18, "Gianpaolo");
        persone.put(22, "Luca");
        persone.put(24, "Giorgia");
        System.out.println(persone);

        Map<Integer, String> saluti = new HashMap<>() {
            {
                put(10, "Ciao");
                put(11, "Hello");
                put(12, "Buongiorno");
                put(13, "Buonpranzo");
            }

        };
        System.out.println(saluti);

        Map<String, Boolean> auto = new HashMap<>();
        auto = (Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Ford", true),
                new AbstractMap.SimpleEntry<>("Golf", true),
                new AbstractMap.SimpleEntry<>("Punto", true)

                ));
    }
}