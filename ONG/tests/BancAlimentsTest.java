import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancAlimentsTest {

    @Test
    void buscarAliment() {
        BancAliments bancAliments = new BancAliments();
        bancAliments.agregarAliment(new Aliment("arros"));
        bancAliments.agregarAliment(new Aliment("patata"));
        assertEquals(0, bancAliments.buscarAliment("arros"));
        assertEquals(-1, bancAliments.buscarAliment("carn"));
    }

    @Test
    void agregarAliment() {
        BancAliments bancAliments = new BancAliments();
        bancAliments.agregarAliment(new Aliment("arros"));
        bancAliments.agregarAliment(new Aliment("patata"));
        assertEquals(2, bancAliments.getQuantitatAliments());
        bancAliments.agregarAliment(new Aliment("arros"));
        assertEquals(2, bancAliments.getQuantitatAliments());
    }

    @Test
    void eliminarAliment() {
        BancAliments bancAliments = new BancAliments();
        assertFalse(bancAliments.eliminarAliment(new Aliment("arros")));

        bancAliments.agregarAliment(new Aliment("arros"));
        bancAliments.agregarAliment(new Aliment("patata"));
        assertTrue(bancAliments.eliminarAliment(new Aliment("arros")));
        assertFalse(bancAliments.eliminarAliment(new Aliment("carn")));
        assertTrue(bancAliments.eliminarAliment(new Aliment("patata")));

        assertEquals(0, bancAliments.getQuantitatAliments());
    }

    @Test
    void modificarAliment() {
        BancAliments bancAliments = new BancAliments();
        assertFalse(bancAliments.modificarAliment("banana", "platano"));

        bancAliments.agregarAliment(new Aliment("arros"));
        bancAliments.agregarAliment(new Aliment("patata"));
        assertTrue(bancAliments.modificarAliment("arros", "arros bomba"));
        assertEquals(0, bancAliments.buscarAliment("arros bomba"));
        assertFalse(bancAliments.modificarAliment("arros", "arros rodo"));
    }
}
