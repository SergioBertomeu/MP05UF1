import java.util.ArrayList;
import java.time.LocalDate;

public class ONG {

    private BancAliments bancAliments;
    private ArrayList<Asociacio> asociacions;

    public ONG() {
        bancAliments = new BancAliments();
        asociacions = new ArrayList<>();
    }

    public BancAliments getBancAliments() {
        return bancAliments;
    }

    public ArrayList<Asociacio> getAsociacions() {
        return asociacions;
    }

    public ArrayList<Aliment> getAliments(){
        return bancAliments.getAliments();
    }

    public void agregarAsociacion(Asociacio asoc){
        //Verificar si el nom de l'associació ja existeix?
        asociacions.add(asoc);
    }

    public void mostrarAsociacions(){
        for (int i = 0; i < asociacions.size(); i++) {
            System.out.println((i+1) + ". " + asociacions.get(i));
        }
    }

    public boolean teAsociacions(){
        return !asociacions.isEmpty();
    }

    public int quantitatAssociacions(){
        return asociacions.size();
    }

    public void mostrarPedidos(){
        for (int i = 0; i < asociacions.size(); i++) {
            System.out.println("ASOCIACIO " + (i+1));
            System.out.println(asociacions.get(i));
            System.out.println("===============");
            asociacions.get(i).mostrarPedidos();
        }
    }

    public void mostrarPedidos(LocalDate dataComanda){
        for (int i = 0; i < asociacions.size(); i++) {
            asociacions.get(i).mostrarPedidos(dataComanda);
        }
    }
}
