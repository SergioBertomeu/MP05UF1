Per recorrre els camins del treball anterior
 
# Pizzeria Pepe:
Un programa controla si una comanda de pizzes la pot portar un repartidor.
Heu de tenir en compte que un repartidor pot portar 10 pizzes com a màxim a la moto.
El programa retorna true si la comanda es pot portar i false en cas contrari.
Es demana:
Fer el codi font del programa.

public class pizzeriaPepe {

    public static boolean potCarregar(int pizzes){
        boolean pot = false;
        if(pizzes <=10 && pizzes >= 1){
            pot = true;
        }
        return pot;
    }
}


Fer la taula amb les particions equivalents i casos vàlids i no vàlids.
| Parametres | Condicions || Clases Valides | Clases no Valides |

Pitzzes        1. Un numero

Entre 0, 10
1. pitzzes <= 10 true
2. pitzzes >10 false


3. No es un enter
false
















Fer la taula amb l'anàlisis de valors límit i casos vàlids i no vàlids.


pitzes
Classe vàlida coberta
Resultat
5
1
true
-1
2
false
11
3
false
cuatre
4
error




Paràmetre entrada
Regla a aplicar
Classes vàlides
Classes no vàlides
pitza
0 i 10
Un numero
5. pitza = 10 i 9
6. pitza =
6. 11


 
CORREGIT





classes
pitzzes
sortida
1
7
true
2
11
false
3
dos
error






Analisi valors limits
Paràmetre entrada
Regla a aplicar
Classes vàlides
Classes no vàlides
pitza
0 i 10
4.  10
5. 9
6. 11




classes
pitzzes
sortida
4
10
true
5
9
false
6
dotce
error





Transports Jean Claude:
Un programa gestiona si una càrrega es pot portar amb una furgoneta.

Una càrrega sempre pesarà almenys 500 kg. per aprofitar el transport, però no podrà pesar més de 900kg.

Una furgoneta ha de tenir la capacitat de portar un pes mínima de 500kg i màxima de 750kg.

Si una càrrega no es pot portar el programa retorna -1, en cas contrari retorna 0.

Es demana:

Fer el codi font del programa.


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


Fer la taula amb les particions equivalents i casos vàlids i no vàlids.


Parametres
Condicions
Clases Valides
Clases no Valides
Carrega
Capacitat
1. La carrega a de se un numero
Entre 500, 900
2. La capacitat a de se un numero de 500 a 750
1. carrega <= 900 return 0
2. carrega >= 500
return 0
3. capacitat <= 750 
return 0
4. capacitat >= 500
return 0
5. cattega <= capacitat
6. carrega >900 return -1
7. carrega <500 return -1
8. capacitat >750 return -1
9. caspacitat <500 return -1

10. No es un enter
errror











Fer la taula amb l'anàlisis de valors límit i casos vàlids i no vàlids.

Analisi valors limits
Paràmetre entrada
Regla a aplicar
Classes vàlides
Classes no vàlides
Carrega
Capacitat
Carrega 500 a 900
Capacitat 500 a 750


4.  carrega 900
5. carrega 899
6.carrega 500
7. carrega 501
8. Capacitat 500
9. Capacitat 501
10. capacitat 750
11. capacitat 749
12. cattega <= capacitat


13.  carrega 901
14.  carrega 499
15.  Capacitat 751
16.  Capacitat 499
17. NO es un numero







classes
Carrega
Capacitat
sortida
4
900


0
5
899


0
6
500


0
7
501


0
8


900
0
9


899
0
10


500
0
11


501
0
12
Carrega <
< Capacitat
0
13
901


-1
14
499


-1
15
751


-1
16
499


-1
17
No es un numero


Error



Control de temperatura:
Un programa gestiona el modificador de temperatura del sistema de calefacció d'un restaurant.
Aquest programa rep la medició de la temperatura del restaurant en graus celsius, acceptant com entrades vàlides de -10 a 50 graus. (medidor)
A més té una entrada d'usuari/a amb la temperatura que es vol mantenir, que va de 15 a 40 graus. (termostat).
El sistema té tres sortides possibles que representen la potencia del sistema de calefacció: 0, 1, 2.
Segons la informació que té en cada moment el programa farà el següent:
Si la temperatura del medidor és més alta que la del termostat, la potencia del sistema serà 0. Si la temperatura del medidor és més baixa o més alta que la del termostat però només entre 0 i 2 graus, la potència serà 1. Si la temperatura del medidor és més baixa que la del termostat en més de dos graus, la potència del sistema serà 2.
Es demana:
Fer el codi font del programa.
public class ContolDeTemperatura {
    public static void main(String[] args) {
    }
    public static int mitsubushi (int medidor, int termostat){
        if (medidor > termostat + 2 || medidor < termostat -2)
            return 1;
        if (medidor < termostat -3)
            return 2;
        return 0;
    }
}
Fer la taula amb les particions equivalents i casos vàlids i no vàlids.

Parametres
Condicions
Clases Valides
Clases no Valides
medidor
termostat
1. El medidor sera -10 a 50
2. El termostat sera 15 a 40
3. sera un numero
1. medidor > termostat 
return 0
2. medidor >= termostat + 2
return 1
3. medidor <= termostat -2
return 1
4. medidor < termostat -3
return 2


5. NO es un numero


 
 
Fer la taula amb l'anàlisis de valors límit i casos vàlids i no vàlids.

classes
medidor
tormostat
sortida
1
medidor >
> tormostat
0
2
medidor >= +2
tormostat
1
3
medidor <=  -2
tormostat
1
4
medidor < -3
tormostat
2
5
no es un numero
no es un numero
error


Factorial:

El factorial d'un nombre és el resultat de multiplicar el número per ell mateix -1 tantes vegades com siguin necessàries fins arrivar a 1.

Per exemple el factorial de 5 és:

5 * 4 * 3 * 2 * 1
Fes una funció factorial que rebi un número com paràmetre i retorni el seu factorial.
Es demana:
Codi del programa.
package MP05.UF2Activitats2;
 
import java.util.Scanner;
 
public class Factorial2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int iFactorial = 1;
        System.out.println("Introdueix un número enter: ");
        int iNumero=ent.nextInt();
        String sCadena = (iNumero) + "! = 1";
        for (int x=2;x<=iNumero;x++) {
            iFactorial = iFactorial * x;
            sCadena = sCadena + " x " + (x);
        }
        System.out.println("El factorial es: " + sCadena + " = " + (iFactorial));
    }
}
 
Captura de pantalla amb un punt d'interrupció que deixi veure totes les crides a la funció (agafeu un valor menor a 10).


 
Taula de multiplicar:
Fes un programa que crea una matriu de números del 1 al 10. Aquest programa rep per argument d'entrada un número sencer i retorna per terminal la taula de multiplicar d'aquest número multiplicant el argument per cada valor de la matriu.
Es demana:
Codi del programa.
 
import java.util.Scanner;
public class TaulaX {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
 
        //int per = ent.nextInt();
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Introdueix un número enter: ");
        int num = ent.nextInt();
        System.out.println("Taula del " + num);
        for (int i = 0; i < values.length; i++) {
           System.out.println(num + " * " + i + " = " + values[i] * num);
        }
    }
}
 
 
Captura de pantalla de com li passeu a IntelliJ com argument del programa un número. (Mireu exemple findAverage).

 

 
 
 
Captura de com feu un punt d'interrupció al bucle de creació de la matriu i mostreu els valors de la matriu.
 

Captura de punt d'interrupció al bucle de multiplicació i com modifiqueu a ma els valors de la matriu de números per a que l'execució retorni el número 1 10 vegades quan l'argument d'entrada era 1.
El que farem sira clic secundari en set values o F2 i canviar els numeros per el numero 1

 


 
