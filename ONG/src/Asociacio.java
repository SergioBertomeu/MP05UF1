import java.time.LocalDate;
import java.util.ArrayList;

public class Asociacio {
    private String nom;
    private String telefono;
    private int distancia;
    private ArrayList<Pedido> pedidos;

    public Asociacio(String nom, String telefono, int distancia) {
        this.nom = nom;
        this.telefono = telefono;
        this.distancia = distancia;
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido){
        //Veure si aquesta associació no té cap altra comanda en la mateixa data
        //Mentre hi hagi una altra comanda en la mateixa data s'avança 1 dia
        while(comandaEnData(pedido)){
            pedido.adelantarDiaEntrega();
        }

        //Calcular gasto del pedido
        if(pedido.totalPedido() > 200){
            pedido.setGasto(distancia * 0.22f);
        }
        else{
            pedido.setGasto(distancia * 0.19f);
        }

        pedidos.add(pedido);
    }

    private boolean comandaEnData(Pedido pedido){
        for (int i = 0; i < pedidos.size(); i++) {
            if(pedidos.get(i).getDataEntrega().equals(pedido.getDataEntrega())){
                return true;
            }
        }
        return false;
    }

    public int getCantidadPedidos(){
        return pedidos.size();
    }

    public void mostrarPedidos(){
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println("PEDIDO " + (i+1));
            pedidos.get(i).mostrarPedido();
        }
    }

    public Pedido ultimPedido(){
        if(!pedidos.isEmpty()){
            return pedidos.get(pedidos.size()-1);
        }
        return null;
    }

    public void mostrarPedidos(LocalDate fechaPedido){
        for (int i = 0; i < pedidos.size(); i++) {
            if(fechaPedido.equals(pedidos.get(i).getData())){
                pedidos.get(i).mostrarPedido();
            }
        }
    }

    @Override
    public String toString() {
        return nom + ". Telef: " + telefono + ", Distancia: " + distancia + " kms.";
    }
}
