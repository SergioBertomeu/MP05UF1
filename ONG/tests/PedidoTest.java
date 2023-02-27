import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void adelantarDiaEntrega() {
        Pedido pedido = new Pedido();

        //Se verifican las pruebas de caja negra y caja blanca
        pedido.setDataEntrega(LocalDate.of(2023, 2, 11));
        pedido.adelantarDiaEntrega();
        assertEquals(pedido.getDataEntrega(), LocalDate.of(2023, 2, 12));

        pedido.setDataEntrega(LocalDate.of(2023, 2, 28));
        pedido.adelantarDiaEntrega();
        assertEquals(pedido.getDataEntrega(), LocalDate.of(2023, 3, 1));

        pedido.setDataEntrega(LocalDate.of(2023, 12, 31));
        pedido.adelantarDiaEntrega();
        assertEquals(pedido.getDataEntrega(), LocalDate.of(2024, 1, 1));
    }

    @Test
    void agregarAliment() {
        Pedido pedido = new Pedido();
        assertTrue(pedido.agregarAliment(new Aliment("arros", 100)));
        assertTrue(pedido.agregarAliment(new Aliment("patata", 50)));
        assertTrue(pedido.agregarAliment(new Aliment("arros", 50)));
        assertFalse(pedido.agregarAliment(new Aliment("carn", 120)));
        assertEquals(2, pedido.getQuantitatAliments());
    }

    @Test
    void totalPedido() {
        Pedido pedido = new Pedido();
        pedido.agregarAliment(new Aliment("arros", 100));
        assertEquals(100, pedido.totalPedido());
        pedido.agregarAliment(new Aliment("patata", 50));
        assertEquals(150, pedido.totalPedido());
        pedido.agregarAliment(new Aliment("arros", 50));
        assertEquals(200, pedido.totalPedido());
        pedido.agregarAliment(new Aliment("carn", 120));
        assertEquals(200, pedido.totalPedido());
    }
}
