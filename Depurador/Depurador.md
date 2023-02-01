## Factorial:

El factorial d'un nombre és el resultat de multiplicar el número per ell mateix -1 tantes vegades com siguin necessàries fins arrivar a 1.

Per exemple el factorial de 5 és:

5 * 4 * 3 * 2 * 1
Fes una funció factorial que rebi un número com paràmetre i retorni el seu factorial.
Es demana:
Codi del programa.

``` 
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

```
 
Captura de pantalla amb un punt d'interrupció que deixi veure totes les crides a la funció (agafeu un valor menor a 10).

![Selecció_500](https://user-images.githubusercontent.com/91250228/210116470-b81b3276-5393-4e75-82bf-0797c923be82.png)

 
Taula de multiplicar:
Fes un programa que crea una matriu de números del 1 al 10. Aquest programa rep per argument d'entrada un número sencer i retorna per terminal la taula de multiplicar d'aquest número multiplicant el argument per cada valor de la matriu.
Es demana:
Codi del programa.
 
```
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
```
 
Captura de pantalla de com li passeu a IntelliJ com argument del programa un número. (Mireu exemple findAverage).

 
![Selecció_502](https://user-images.githubusercontent.com/91250228/210116594-67aeb378-e95e-42f2-b694-dde0b4a85574.png)

 
 
 
Captura de com feu un punt d'interrupció al bucle de creació de la matriu i mostreu els valors de la matriu.

![Selecció_503](https://user-images.githubusercontent.com/91250228/210116614-7eb949d6-f8aa-4156-906d-f0056187676c.png)

 

Captura de punt d'interrupció al bucle de multiplicació i com modifiqueu a ma els valors de la matriu de números per a que l'execució retorni el número 1 10 vegades quan l'argument d'entrada era 1.
El que farem sira clic secundari en set values o F2 i canviar els numeros per el numero 1

 
![Selecció_504](https://user-images.githubusercontent.com/91250228/210116625-d3681a57-04e7-4bc7-bce6-abcadbd314f6.png)



![Selecció_505](https://user-images.githubusercontent.com/91250228/210116631-bd3b78c3-5669-4847-9f31-99a9675745df.png)


![Selecció_506](https://user-images.githubusercontent.com/91250228/210116638-3b0293cd-2324-4ba3-a72b-3923fb0531f5.png)
