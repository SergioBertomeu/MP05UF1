import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlimentTest {

    @Test
    void setStock() {
        Aliment aliment = new Aliment("carn");
        aliment.setStock(-10);
        assertEquals(0, aliment.getStock());
        aliment.setStock(15);
        assertEquals(15, aliment.getStock());
        aliment.setStock(0);
        assertEquals(0, aliment.getStock());
    }

    @Test
    void enviar() {
        Aliment aliment = new Aliment("carn", 10);
        aliment.enviar(5);
        assertEquals(5, aliment.getStock());
        aliment.enviar(-10);
        assertEquals(5, aliment.getStock());
        aliment.enviar(20);
        assertEquals(5, aliment.getStock());
        aliment.enviar(5);
        assertEquals(0, aliment.getStock());
    }

    @Test
    void donar(){
        Aliment aliment = new Aliment("carn");
        aliment.donar(10);
        assertEquals(10, aliment.getStock());
        aliment.donar(-15);
        assertEquals(10, aliment.getStock());
        aliment.donar(0);
        assertEquals(10, aliment.getStock());
    }
}
