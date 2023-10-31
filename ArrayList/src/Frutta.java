public class Frutta {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Frutta(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome del frutto: " + nome;
    }

    private String nome;

}
//    Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//    In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un LinkedList con elementi e stamparlo in console.
//        Aggiungere un elemento al primo posto della lista e uno all'ultimo
//        Stampare la collezione aggiornata