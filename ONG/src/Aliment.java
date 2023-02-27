public class Aliment {

    private String nom;
    private int stock;

    public Aliment(String nom) {
        this.nom = nom;
        this.stock = 0;
    }

    public Aliment(String nom, int stock) {
        this.nom = nom;
        this.setStock(stock);
    }

    public String getNom() {
        return nom;
    }

    public void setStock(int stock) {
        if(stock >= 0)
            this.stock = stock;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getStock() {
        return stock;
    }

    public void enviar(int quantitat) {
        if(quantitat >= 0 && quantitat <= stock){
            stock -= quantitat;
        }
    }

    public void donar(int quantitat){
        if(quantitat >= 0)
            stock += quantitat;
    }

    @Override
    public String toString() {
        return nom + " (" + stock + " kg)";
    }
}
