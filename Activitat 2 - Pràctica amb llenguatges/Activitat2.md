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

![alt text](fotos/Selecció_074.png)




El que he fet ha sigut instal·lar el "golang-go" i ara si l'he pogut executar creant l'executable amb build


![alt text](fotos/Selecció_075.png)










2. **Descriviu com passar de codi font a codi objecte.**


Per poder passar de codi font a codi objecte el que farem sera la comanda “go build dado.go”


![alt text](fotos/Selecció_076.png)


3. **Mostreu les extensions dels fitxers de codi font i codi objecte.**



![alt text](fotos/Selecció_076.png)


4.  **Expliqueu els avantatges d’utilitzar un llenguatge compilat i els punts febles.**

Unes de les avantatges serien; La pròpia correcció dels errors en la compilació, ja que ens avisa abans de crear l'executable els erros que hi han. L'execució és molt més ràpida pel fet que no passa d'instrucció a instrucció executa tot el bloc una volta compilat.

Els punts febles serien; No podem corregir errors fins que no acabi de compilar, quan es revisa l'error cal tornar a compilar i la dificultat d'aprenentatge.





5. **Busqueu 3 IDEs de desenvolupament pel llenguatge.**


Els IDEs serien:

Visual studio code
https://code.visualstudio.com/

![alt text](fotos/Selecció_074.png)

Netbeans
https://netbeans.apache.org/

![alt text](fotos/Selecció_078.png)

Aquest és online

go.dev
https://go.dev/play/

![alt text](fotos/Selecció_079.png)




# PYTHON d6

``` 
import random
 
numero1 = random.randint(0,10)

print ('El numero que has obtingut és ',numero1 
```


1. **Obrim un document nou on escrivim el codi font amb la funció per realitzar el programa del dau.**

Guardem el document amb extensió del llenguatge codi font que untilitzem, en aquest cas és llenguatge Python.El document serà d6_Python.py.

![alt text](fotos/Selecció_080.png)


2. **Obrim el terminal de la carpeta on està el document amb el codi que volem executar.**

Al intentar executar l'arxiu ens dóna error i demana que instal·lem el Python.

Instal·lem l'extensió python

Un cop tenim l'extensió de Python instal·lada introduim el següent comandament : ``` python3 d6_Python.py``` i obtenim el resultat del programa.


![alt text](fotos/Selecció_081.png)


3. **Descriviu com passar de codi font a codi objecte.**

per passar de codi font a codi objecte introduïm la comanda: ```pyhton3d6_Python.py```

4. **Mostreu les extensions dels fitxers de codi font i codi objecte.**

![alt text](fotos/Selecció_082.png)

5. **Ventatges i desventatges llenguatge interpretat**

Pros
És independent de la màquina i sistema operatiuc, es poden executar en qualsevol plataforma.
Es pot modificar el codi mentre s'executa.
Ocupen menys lloc en la memòria
L'entorn de treball s'encarrega de que el hardware executi les instruccions.
Molt emprat en desenvolupament web i en electrònica.

Inconvenients

La alta portabilidad afecta a la velocita al executar el codi.
Difícils de depurar.
Requereix d'un software per interpretar les instruccions del procesador.
No todos los software es troben disponibles en totes les plataformes.








# JAVA d6

