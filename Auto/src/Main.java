public class Main {
    public static void main(String[] args) {
        Auto ford = new Auto(1490, "FB444HD", "Ford", "Fiesta");

        ford.setCilindrata(1600);
        ford.setMarca("Golf");
        ford.setModello("Serie 8");
        ford.setTarga("FB555HD");

        System.out.print(ford.StampaInformazioni());
    }
}

// Get prende
// Set imposta
