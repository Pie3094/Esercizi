public class Modelli {
    public String marca;

    public String modello;

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Modelli(String marca, String modello, String targa, int cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String targa;
    public int cilindrata;

}
// cilindrata, targa, marca e modello.