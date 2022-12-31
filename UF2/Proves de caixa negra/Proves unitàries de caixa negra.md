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

```

## Transports Jean Claude
```
public class TransportsJeanClaude {


    public static int c15(int carrega, int capacitat) {
        int resultat = -1;

        if (carrega <= 900 && carrega >= 500) {
            if (capacitat >= 500 && capacitat <= 750) {
                if (carrega <= capacitat) {
                    resultat = 0;
                }
            }
        }

        return resultat;
    }
}
```

```
import org.junit.jupiter.api.*;

class TransportsJeanClaudeTest {

    @Test //Valor al límit superior capacitat
    void prova1() {
        int resultat = TransportsJeanClaude.c15(500, 751);
        Assertions.assertEquals(-1, resultat);
    }
    @Test //Valor al límit inferior capacitat
    void prova2() {
        int resultat = TransportsJeanClaude.c15(500, 499);
        Assertions.assertEquals(-1, resultat);
    }

    @Test //Valor al límit superior carrega
    void prova3() {
        int resultat = TransportsJeanClaude.c15(901, 500);
        Assertions.assertEquals(-1, resultat);
    }

    @Test //Valor al límit inderior carrega
    void prova4() {
        int resultat = TransportsJeanClaude.c15(499, 500);
        Assertions.assertEquals(-1, resultat);
    }

//    @Test //Valor no és un número
//    void prova5() {
//        int resultat = TransportsJeanClaude.c15("cinc", "cinc");
//        Assertions.assertEquals("error", resultat);
//    }

    @Test //Valor entre els límits
    void prova6() {
        int resultat = TransportsJeanClaude.c15(750, 750);
        Assertions.assertEquals(0, resultat);
    }


    @Test //Valor entre els límits
    void prova7() {
        int resultat = TransportsJeanClaude.c15(749, 749);
        Assertions.assertEquals(0, resultat);
    }

    @Test //Valor entre els límits
    void prova8() {
        int resultat = TransportsJeanClaude.c15(501, 501);
        Assertions.assertEquals(0, resultat);
    }

    @Test //Valor entre els límits
    void prova9() {
        int resultat = TransportsJeanClaude.c15(500, 500);
        Assertions.assertEquals(0, resultat);
    }

    @Test //Valor entre els límits
    void prova10() {
        int resultat = TransportsJeanClaude.c15(500, 750);
        Assertions.assertEquals(0, resultat);
    }
    @Test //Valor entre els límits
    void prova11() {
        int resultat = TransportsJeanClaude.c15(500, 749);
        Assertions.assertEquals(0, resultat);
    }

    @Test //Valor entre els límits
    void prova12() {
        int resultat = TransportsJeanClaude.c15(500, 500);
        Assertions.assertEquals(0, resultat);
    }

    @Test //Valor entre els límits
    void prova13() {
        int resultat = TransportsJeanClaude.c15(500, 501);
        Assertions.assertEquals(0, resultat);
    }

}
```

## Control de temperatura

```
package org.example;

public class Calefaccio {
    public static int potencia_sistema(int medidor, int termostato){

        if(medidor < -10 || medidor > 50 || termostato < 15 || termostato > 40 ){
            //entrada no valida
            //Que fem??
            return -1;
        }

        if(medidor > termostato + 2)
            return 0;

        if(medidor < termostato - 2)
            return 2;

        return 1;
    }

}
```

```
import org.junit.jupiter.api.*;
public class CalefaccioTest {

    // valors en la clase 0 (potencia 0) amb valors valits
    @Test
    void test1(){
        Assertions.assertEquals(0, Calefaccio.potencia_sistema(18,15));
        Assertions.assertEquals(0, Calefaccio.potencia_sistema(40,15));
        Assertions.assertEquals(0, Calefaccio.potencia_sistema(50,35));
    }

    // valors en la clase 1 (potencia 1) amb valors valits
    @Test
    void test2(){
        Assertions.assertEquals(1, Calefaccio.potencia_sistema(20,20));
        Assertions.assertEquals(1, Calefaccio.potencia_sistema(21,20));
        Assertions.assertEquals(1, Calefaccio.potencia_sistema(19,20));
        Assertions.assertEquals(1, Calefaccio.potencia_sistema(17,15));
        Assertions.assertEquals(1, Calefaccio.potencia_sistema(38,40));
    }

    //valores en la clase 2 (potencia 2) amb valors valids
    @Test
    void test3(){
        Assertions.assertEquals(2, Calefaccio.potencia_sistema(17,20));
        Assertions.assertEquals(2, Calefaccio.potencia_sistema(-5,30));
        Assertions.assertEquals(2, Calefaccio.potencia_sistema(-10,15));
    }

    // valors no valids
    @Test
    void test4(){
        Assertions.assertEquals(-1, Calefaccio.potencia_sistema(80,20));
        Assertions.assertEquals(-1, Calefaccio.potencia_sistema(-5,0));
        Assertions.assertEquals(-1, Calefaccio.potencia_sistema(-20,15));
        Assertions.assertEquals(-1, Calefaccio.potencia_sistema(-20,90));
    }


}
```


