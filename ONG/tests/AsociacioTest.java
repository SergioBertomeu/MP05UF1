import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AsociacioTest {

    @Test
    void agregarPedido() {
        ArrayList<Aliment> aliments = new ArrayList<>();
        aliments.add(new Aliment("patata", 50));
        aliments.add(new Aliment("carn", 100));

        Pedido pedido1 = new Pedido(aliments, LocalDate.of(2023, 2, 10));
        Asociacio asociacio = new Asociacio("Asociacio", "99999", 100);
        asociacio.agregarPedido(pedido1);


        //se comprueba el gasto del pedido asociado, que la fecha de entrega es el día siguiente
        //El total del pedido es 150 kg, las distancia es 100 => 0.19*100 == costo del pedido
        assertEquals(19.0f, asociacio.ultimPedido().getGasto());
        assertEquals(LocalDate.of(2023, 2, 11), asociacio.ultimPedido().getDataEntrega());
        assertEquals(1, asociacio.getCantidadPedidos());

        aliments.add(new Aliment("alubias", 150));
        Pedido pedido2 = new Pedido(aliments, LocalDate.of(2023, 2, 10));
        asociacio.agregarPedido(pedido2);
        //El total del pedido es 300 kg, las distancia es 100 => 0.22*100 == costo del pedido
        assertEquals(22.0f, asociacio.ultimPedido().getGasto());
        assertEquals(LocalDate.of(2023, 2, 12), asociacio.ultimPedido().getDataEntrega());
    }
}
