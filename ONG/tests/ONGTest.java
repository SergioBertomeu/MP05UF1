import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ONGTest {

    @Test
    void agregarAsociacio() {
        ONG ong = new ONG();
        Asociacio asoc = new Asociacio("Asociacio", "999999", 300);

        ong.agregarAsociacion(asoc);
        assertEquals(1, ong.quantitatAssociacions());
    }
}
