## Pizzeria Pepe
 
```
public class pizzeriaPepe {

    public static boolean potCarregar(int pizzes){
        boolean pot = false;
        if(pizzes <=10 && pizzes >= 1){
            pot = true;
        }
        return pot;
    }
}
```

```
import org.junit.jupiter.api.*;


class pizzeriaPepeTest {


    @Test //Valor entre els límits
    void prova1() {
        boolean pot = pizzeriaPepe.potCarregar(3);
        Assertions.assertTrue(pot);
    }

    @Test //Valor superior al límit superior
    void prova2() {
        boolean pot = pizzeriaPepe.potCarregar(11);
        Assertions.assertFalse(pot);
    }


    @Test //Valor inferior al límit inferior
    void prova3() {
        boolean pot = pizzeriaPepe.potCarregar(-2);
        Assertions.assertFalse(pot);
    }


    @Test //Valor no és un número
    void prova4() {
        boolean pot = pizzeriaPepe.potCarregar(Integer.parseInt("cinc"));
        Assertions.assertFalse(pot);
    }



    @Test //Valor límit 0
    void prova5() {
        boolean pot = pizzeriaPepe.potCarregar(0);
        Assertions.assertFalse(pot);
    }
    @Test //Valor límit 1
    void prova6() {
        boolean pot = pizzeriaPepe.potCarregar(1);
        Assertions.assertTrue(pot);
    }
    @Test //Valor límit 2
    void prova7() {
        boolean pot = pizzeriaPepe.potCarregar(2);
        Assertions.assertTrue(pot);
    }
    @Test ///Valor límit 9
    void prova8() {
        boolean pot = pizzeriaPepe.potCarregar(9);
        Assertions.assertTrue(pot);
    }
    @Test //Valor límit 10
    void prova9() {
        boolean pot = pizzeriaPepe.potCarregar(10);
        Assertions.assertTrue(pot);
    }
    @Test //Valor límit 11
    void prova10() {
        boolean pot = pizzeriaPepe.potCarregar(11);
        Assertions.assertFalse(pot);
    }
}

``
