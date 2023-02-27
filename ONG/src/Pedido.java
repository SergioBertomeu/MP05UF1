import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    private ArrayList<Aliment> aliments;
    private LocalDate data;
    private LocalDate dataEntrega;
    private float gasto;

    public Pedido() {
        aliments = new ArrayList<>();
        data = LocalDate.now();
        gasto = 0;

        //Quan es crea una comanda es programa pel següent dia
        dataEntrega = data.plusDays(1);
    }

    public Pedido(ArrayList<Aliment> aliments, LocalDate data) {
        this.aliments = aliments;
        this.data = data;
        this.dataEntrega = data.plusDays(1);
        this.gasto = 0;
    }

    public int getQuantitatAliments() { return aliments.size(); }

    public LocalDate getData() {
        return data;
    }

    public LocalDate getDataEntrega() { return dataEntrega; }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public void adelantarDiaEntrega(){
        dataEntrega = dataEntrega.plusDays(1);
    }

    /**
     * Afegeix un nou aliment a la comanda.
     * Suma la quantitat en kg d'aquest aliment al total de la comanda.
     * Si amb el nou aliment es passa de 300 kg el total de la comanda, el nou aliment no s'hi afegeix.
     *
     * @param aliment: Aliment a afegir
     * @return: true - si la comanda s'ha afegit correctament
     * false - si en afegir el nou aliment se superen els 300 kg de la comanda
     */
    public boolean agregarAliment(Aliment aliment){
        int total = totalPedido();
        if(total + aliment.getStock() > 300){
            //La comanda no pot superar els 300 kg daliment
            return false;
        }
        //Verificar si ja està l'aliment a la comanda
        boolean alimentTrobat = false;
        for (int i = 0; i < aliments.size(); i++) {
            if(aliments.get(i).getNom().equals(aliment.getNom())){
                //Aliment trobat. Actualitzar l'estoc de la comanda
                alimentTrobat = true;
                aliments.get(i).setStock(aliments.get(i).getStock()+aliment.getStock());
                break;
            }
        }
        if(!alimentTrobat)
            aliments.add(aliment);

        return true;
    }

    public int totalPedido(){
        int total = 0;
        for (int i = 0; i < aliments.size(); i++) {
            total += aliments.get(i).getStock();
        }
        return total;
    }

    public boolean comandaBuida(){
        return aliments.isEmpty();
    }

    public void mostrarPedido() {
        for (int i = 0; i < aliments.size(); i++) {
            System.out.println((i+1)+". "+ aliments.get(i));
        }
        System.out.println("Total (kg): " + totalPedido() + " kg");
        if(gasto > 0){
            System.out.println("Gasto envio: " + gasto);
            System.out.println("Data del pedido: " + data);
            System.out.println("Data entrega del pedido: " + dataEntrega);
        }
    }

    public void setGasto(float gasto) {
        this.gasto = gasto;
    }
    public float getGasto() { return this.gasto; }
}
