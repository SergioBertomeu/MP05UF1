# GO d6

1.  **Utilitzant la línia de comandes, sense utilitzar un IDE de desenvolupament escriureu el programa en un fitxer de text que sigui el codi font, el codi font l’adjunteu dins el document.**

Primer crearem amb un touch a la carpeta quer vulguem l'arxiu "dado.go"
l'extensio és importantíssima, després entrem a l'arxiu i posem el codi.

```
 package main

 import (
 	"fmt"
 	"math/rand"
 	"sync"
 	"time"
 )

 var onlyOnce sync.Once

 // preparacio del dado   
 var dado = []int{1, 2, 3, 4, 5, 6}

 func rollDice() int {

 	onlyOnce.Do(func() {
 		rand.Seed(time.Now().UnixNano()) // ejecutar nomes una vegada
 	})

 	return dado[rand.Intn(len(dado))]
 }

 func main() {
 	dado1 := rollDice()
 	

 	fmt.Println("La teva cara del Dau es: ", dado1)
 	
 }
```
Guardem l’arxiu i obrim la terminal i al fer el build o el run em donava error 


El que he fet ha sigut instal·lar el "golang-go" i ara si l'he pogut executar creant l'executable amb build













2. **Descriviu com passar de codi font a codi objecte.**
Per poder passar de codi font a codi objecte el que farem sera la comanda “go build dado.go”





3. **Mostreu les extensions dels fitxers de codi font i codi objecte.**




● Expliqueu els avantatges d’utilitzar un llenguatge compilat i els punts febles.

Unes de les avantatges serien; La pròpia correcció dels errors en la compilació, ja que ens avisa abans de crear l'executable els erros que hi han. L'execució és molt més ràpida pel fet que no passa d'instrucció a instrucció executa tot el bloc una volta compilat.

Els punts febles serien; No podem corregir errors fins que no acabi de compilar, quan es revisa l'error cal tornar a compilar i la dificultat d'aprenentatge.





● Busqueu 3 IDEs de desenvolupament pel llenguatge.
Els IDEs serien:

Visual studio code
https://code.visualstudio.com/



Netbeans
https://netbeans.apache.org/



Aquest és online

go.dev
https://go.dev/play/






** PYTHON d6
``` import random
 
numero1 = random.randint(0,10)

print ('El numero que has obtingut és ',numero1 ```


Obrim un document nou on escrivim el codi font amb la funció per realitzar el programa del dau.

Guardem el document amb extensió del llenguatge codi font que untilitzem, en aquest cas és llenguatge Python.El document serà d6_Python.py.

Obrim el terminal de la carpeta on està el document amb el codi que volem executar.

Al intentar executar l'arxiu ens dóna error i demana que instal·lem el Python.

Instal·lem l'extensió python

Un cop tenim l'extensió de Python instal·lada introduim el següent comandament : ``` python3 d6_Python.py``` i obtenim el resultat del programa.




** JAVA d6
