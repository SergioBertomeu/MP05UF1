# Recerca de quatre llenguatges de programació






# 1 Java

1. **Naixement, creadors i evolució històrica.**


El llenjautge java neix gracies a James Gosling i al seu equip de desarolladors en la enpresa Sun System alla cap als 1990 partin dun llenguatge ja creat el “C”. Al principi no es deia Java va neixe com a Green


En 1995 es presenta la seva primera versio i en 1996 en la sortida del JDK 1.0.2 cuan ja l’hi canvien el nom i lanomenen Java. Tal com pasaven els anys anaven sortin noves versions: 1.1, 1.2, 1.3….. fins que surten noves tecnologies com el JavaBeans, JDBC (per a l’acces a base de dades) , RMI (pepr a conexions en remot), Collections ( per a la gestio de estructuresw de dades multiples) entre molts d’altres




• Característiques del llenguatge.


Les principals característiques son, es orientat a objectes, es tipad, robust, segur, portable…. etc. 
Tmbe per tenir el consum de recursos java utilitza el Garbageollector es un recollidor de basura que gracies a ell no tenim que preocupaqrnos del consum de recursos ja que els objectes que no fem funciona a l’ejeccucio del programa els esborra.
Tambe redueix els errors mes comuns del altres llenjuatges com C o C++ ja que esta creat aparti del C






◦ Imperatiu, declaratiu, OOP…


Gracies a aquesta imatge podem observa que el llenjuatge java es imperativa i OOP, direm que Java es un llenjuatge de multiples paradicmes.


  



Java al ser de programacio imperativa podem varaia la execucio del programa gracies a les variables, instruccions i condicions per poder arriba al resultat deseat


◦ Compilat, interpretat, híbrid…


Diriem que Java es parcialment compilat ja que compila a un llenjuatge inermitg el bytecode que despres interpreta cualsevol plataforma sense la nesesitat de crar varios executables. Si volem complila tambe nesesitarem el JRE que es el que sencarrega de interplreta el bytecode


◦ Principals novetats o aportacions respecte altres llenguatges.


Java a anat evolucionant en els anys, Desde els seus inicis en l’any 1996 an anat sortin versions com el Java5, Java6, Java7 i la versio actual la Java8 i aquestes version an anat inplementan millores i nous soports a scripts amb Java6 o noves llibreries en Java7. Una de les principals abantatges es que es de codi obert i aixo el fa ser mes popular entre la comunitat de programadros




◦ Avantatges i inconvenients respecte altres llenguatges.


Els Principals avantatges del llenguatge son la portabilitat, la seva arquitectura neutra i la seva simplicitat. Aquestes sirien les tres  mes importants i que a portat a Java al mes alt en l’escala de llenjuatges mes usuts durant moltisims anys deguits, 


Pero no tot son abantatges, tambe te inconvenients com per exemple esta limitat en les opcions 3D son limitades, gasta mes memoria ram en comparacio a altres llenguatges, es totalment dependernt de la maquina virtual JVM ja que sense ella no podrem ejecutar el programa i al ser un llenjuatge interpretat pot ser una mica mes lent en la ejecucio dels programes.


• Principals entorns on es fa servir el llenguatge.


Els principals entors on es fa servir serien en la majoria de sistemes operatius ja que al ser multiplataforma ens serveix per a cualsevol plataforma


• Exemple de codi (valoraré especialment si mostreu que ho heu implementat i
provat)


Per posar un exemple podriem fer que ens 




public class Suma {
    public static void main(String[] args) {


        int a = 10;
        int b = 50;




        System.out.println(a + b );




    }


}






◦ Hola mòn (Molt fàcil de trobar)




public class Suma {


    public static void main(String[] args) {


        System.out.println("Hola mòn");


    }


}




◦ Demanar el nom a l'usuari i mostrar-lo (haureu de buscar una mica més)


import java.util.Scanner;


public class Suma {
    public static void main(String[] args) {


        Scanner ent = new Scanner(System.in);


        String teuNom;




        teuNom = ent.nextLine();


        System.out.println("El teu nom es " + teuNom);


    }






}


• Buscar com estan les ofertes de treball a Infojobs del llenguatge.


Hi ha molta feina en infojobs en concret en surten mes de mil ofertes de trebal lo que la majoria busca gent en com a minim 2 anys de experiencia
  



• WebGrafia


https://ca.wikipedia.org/wiki/Java_(llenguatge_de_programaci%C3%B3)


https://www.manualweb.net/java/historia-java/


https://medium.com/@Loopa/paradigmas-de-programaci%C3%B3n-programaci%C3%B3n-imperativa-y-programaci%C3%B3n-declarativa-4c4a4182fd87


https://www.crehana.com/blog/desarrollo-web/ventajas-desventajas-java/


https://www.infojobs.net/ofertas-trabajo/java




2 Python


• Naixement, creadors i evolució històrica.


El llenguatge ja fa molts de anys que el varen crea cap alla al 1989 el senyor Guido van Rossum va crea el que avui en dia coneixem pythonpero no fou fins l’any 1991 cuan es publicaria la seva primera versio del programa, despres vindria la versio 1.0 en 1994 mes tart en el 2000 es publicaria la versio 2.0 i finalment en 2008 varen treure la versio 3.0 despres de 8 anys. Despres de treure la versio 3.0 cada any i mig mes o menys an anat traent versions  com la, 3.2 febrero de 2011, 3.3 -  en septiembre de 2012, 3.4 el marzo de 2014 i aixi fins arribar a la 3.9 el 3.9 - 5 de octubre de 2020. Tot i que sempre sha actualitzat per a se compatible amb versions anteriors la versio 3 trenca la compatibilitat amb les versions aneriors.




• Característiques del llenguatge.
Una de les carecteristiques mes inportants es que es multiplataforma aixo lhi dona un plus de aprovacio per part de la comunitat de progarmadors. Esta orientat a objectes. Una altra carecteristica es que no cal tenit un gran coneixement de python per a crear pagines web ja que es relativament facil de programat, com tambe podrem crear scrips o software per al SO windows 




◦ Imperatiu, declaratiu, OOP…
Es imperatiu permeten la modificacio del codi amb condicions o intruccions dienli com realitza la tasca
  



◦ Compilat, interpretat, híbrid…


Cuan parlem de Python parlem de llenguatje interpretat ja que tenim un interpret que ejeccuta el codi font, es podria pensar que es mes lent per ser interpretat pero en python no es aixi


◦ Principals novetats o aportacions respecte altres llenguatges.
Una aportacio davant de altres llenjuatges de programacio es que no nesesites dir-li de quin tipo son les variables, tu cuan la declares hi ha agafa els valors he interpreta si es un int, String, dooble, etc…..


◦ Avantatges i inconvenients respecte altres llenguatges.


Les principals aventatges serien qie es lliure i gratuit, facil de llegir, sha prent en bastanta facilitat, es multiplataforma, gran varietatd e llibreries compta amb una gran comunitat, interpretat i fortament tipat.


Els inconvenients mes clas serien la incompatibilitat amb la versio 2 en la 3, un alt consum de memoria, no es pot desarrolar per dispositius movils i les llibreries de terces no sempre funcionen be 


• Principals entorns on es fa servir el llenguatge.


Els principals entorns serien Windows, linux, Mac




• Exemple de codi (valoraré especialment si mostreu que ho heu implementat i
provat)
cantidad = float(input("Quina quantitat de euros vols canbiar? "))
print(f"{cantidad} en euros son {round(cantidad * 166.386)} pesetes")


◦ Hola mòn (Molt fàcil de trobar)


print “Hola mòn”


◦ Demanar el nom a l'usuari i mostrar-lo (haureu de buscar una mica més)


print("¿Introdueix el teu nom?")
nombre = input()
print(f"El teu nom és, {nombre}")


• Buscar com estan les ofertes de treball a Infojobs del llenguatge.
Actualment hi ha la mitad de feina que en Java (sobre un 500 ofertes de treball) i tambe es demana com a minim 2 anys de experiencia
  



• WebGrafia
https://es.wikipedia.org/wiki/Historia_de_Python


https://lenguajesdeprogramacion.net/python/


https://aprendepython.es/core/introduction/python/




3 JavaScript


• Naixement, creadors i evolució històrica.


El naixement de JavaScrip fou gracies al senyor Brendan Eich  a principi dels anys 90, ja que per aquella època comensaben a incloure formularis complexos i la velocitat paxima de internet era de 28,8 kbps, aixo era un velocitat lentisima que apenes podies carregar pagines web i nesesitaven una altra manera de carrega la informacio i sels va ocorre que podien ejecutarla en el navegado del usuari a mes de que tot ho carreges la paguina web.
La primera versio fou per al navegador Netscape Navigator 2.0 que es llansaria a l’any 1995. Microsoft tambe va teure una copia del JavaScript per al seu  Internet Explorer 3 anomenat JScript per evtar accions legals, per lo que la versio 1.1 de JavaScript es va presenta al ECMA European Computer Manufacturers Association), per a evitar copies del seu llengutje i plagi del mateix.
Les versions de JavaScript serien la primera versio en 1995 amb el nom de Mocha o LiveScript, la 1.2 en 1997 tambe anomenada ECMA-262, en 1998 apareix el JavaScript 1.3, en 2000 la versio 1.5 despres daltem 10 anys a 2010 amb la versio 1.8.5 i finalment la ultima versio la  ECMA-262 sixth edition (ECMAScript es un estandart pero volin dir el mateix que JavaScript)








• Característiques del llenguatge.


les principals caracteristiques serien; que sexecuta a la maquina de l’usuari, es un llenguatje orientat a objectes permeten de una forma simple ordenar i reutilitza codi, es de tipatge devil ja que no cal espesificar quin tipo de dada es la variable i es de alt nivell ja que la sintaxis es mes humana i no tant en el llenjuatge d emaquina


◦ Imperatiu, declaratiu, OOP…


JavaScript es tant imperatiu com declaratiu auxo supasa que podem programa de dues maneres diferents i ens dona moltes opcions a la manera de arriba a una solucio




◦ Compilat, interpretat, híbrid…


El JavaScript es un llenguatge interpretat ja que transforma les linies de codi a llenjuatge maquina aixo es molt interesant per que podem executarlo en el navegado de l’usuari guanyant rapidesa com tambe es valit oer a multiplataformes


◦ Principals novetats o aportacions respecte altres llenguatges.






◦ Avantatges i inconvenients respecte altres llenguatges.


Els avantatges serien que no cal dir-li quin tipus de dada es la variables al ser no tipat, es un llenjuatge allunyat del llenguatge maquina i es mes huma la sintaxis, al ser interpretat es mes rapit que altres llenguatjes.


• Principals entorns on es fa servir el llenguatge.


Els entorns on es mou aques llenguatje seria en navegadors web, en el codi HTML, podem crear jocs en 2 i 3D es multiplataforma sen posible executa el codi en diferentes arquitectures.




• Exemple de codi (valoraré especialment si mostreu que ho heu implementat i
provat)


<html>
<body>
Sumador de numeros...
<script>
  var n1 = prompt("Disme un numero");
  var n2 = prompt("Disme un altre numero");
  document.write("La suma de "+ n1 + " i "+ n2 + " es: ");
  document.write(parseInt(n1)+parseInt(n2));
</script>
</body>
</html>




◦ Hola mòn (Molt fàcil de trobar)


´´´<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>EL meu primer Hola mon</title>
</head>
<body>
<h1> El meu primer hola mon</h1>
<script>
  document.write("Hola mòn");
</script>


</body>
</html>








◦ Demanar el nom a l'usuari i mostrar-lo (haureu de buscar una mica més)


<html>
<body>
<script>
  var n1 = prompt("Com et diuen?");


  document.write("El teu nom es " +n1);
  document.write(parseInt(n1));
</script>
</body>
</html>


• Buscar com estan les ofertes de treball a Infojobs del llenguatge.


en infojobs hi han 880 ofertes de treball de moment el guanyador es java 


  



• WebGrafia


https://uniwebsidad.com/libros/javascript/capitulo-1/breve-historia


https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=817:versiones-de-javascript-diferencia-con-ecmascript-262-o-isoiec-especificacion-oficial-historia-cu01137e&catid=78&Itemid=206


https://cosasdigitales.com/articulos-diseno-web/javascript-programacion-declarativa-vs-imperativa/






4 C


• Naixement, creadors i evolució històrica.


El llenguatge C te ja més de 50 anys i es la base de molts de llenguatges molt coneguts com ara; Java, C++. Tot va començar cap allà a l'any 1970 gràcies a Dennis Ritchie junt a Brian Kernighan en els laboratoris Bell,  comencen  a crear el llenguatge C. El que es volia aconseguir era un llenjuatge eficient i rapit i que puges evoluciona i el que sels va ocorre va ser unir el llenjuatge BCPL rapid i sencill amb el B que era molt mes lent i aixi va neixe el llenjuatge C que va reescrivir completament UNIX.
les versions pasen de C# 1.0 que era molt basic i pesat, en 2005 surt la versió 2.0 on varen surtir les etiquetes Enumerable  i tems de llista i el bucle foreach, en 2007 surtiria la versio 3.0






• Característiques del llenguatge.


Les caracteristiques son varies com per exe,ple; el llenguatje es estructurat, la programacioio es de nivell mig podent teni les bentatges del baix i alt nivell, no depent del hardware, podent aixi migrar a altres Sistemes, ames no es un llenjuatge per a una tasca espesifica, es poden crear jocs, fulles de calcul, sistemes operatius.








◦ Imperatiu, declaratiu, OOP…


El llenjuatge C es imeratiu lo que significa que te un estil estructurat de programacio
per evita instruccions de salto de afegeixen complexitat. Com tambe desglosa les tasques en trosos de codi més menuts per poder reutilitza en altres programes


◦ Compilat, interpretat, híbrid…


El llenguatge és compilat això vol dir que tenen que convertir el codi a codi màquina avans de ser ejecutat el cual por ser una mica mes lent a l’hora del desenvolupament del codi pero molt mes rapit a l’ora de corre el programa final.




◦ Principals novetats o aportacions respecte altres llenguatges.


En novetats ja no es molt novedos ja que aquest llengutge ja te 50 anys pero ha format la base de llenguatjes com Java, C++ aiixi podem dir que a aportat la base del llenjuatges mes important davui en dia i podria ser el llenguatje mes versatiil de tots ja que sutilitza per desarrola sistemes grans i mitjans gracies a la traduccio directa al llenjuatge maquina


◦ Avantatges i inconvenients respecte altres llenguatges.


Les principals abantages serien la eficiencia que te fent operacions directes al sistema operatiu, es miltiplataforma en totes les abantatges que aixo comporta, es un llenguatge que te una molt bona gestio en les bases de dades podent consultar almacena i actualitza dades


Els principals inconvenients serien la dificultat en laprenentatge i poder dominar el llenjuatge de forma efectiva, tampoc conta amb les cadenes de carecters que son molt inportants per a segons wu evolem programa, no es recomanable per a paguines web






• Principals entorns on es fa servir el llenguatge.


En el kernel de de Windows podriem trobarlo en Mac tambe esyta present en el nucli OS X en linux, com tambe enb les bases de dades, movils…..




• Exemple de codi (valoraré especialment si mostreu que ho heu implementat i
provat)


#include <stdio.h>
#include <stdlib.h>


int main (void)
{
    float a, b, suma;
    printf ("Ingresa el primer numero: ");
    scanf ("%f", &a);
    (void) getchar ();
    printf ("Ingresa el segon numero: ");
    scanf ("%f", &b);
    (void) getchar ();
    suma=a+b;
    printf ("Valor de suma: %g\n", suma);
    putchar ('\n');
    system ("pause");
   return 0;


  }


  



◦ Hola mòn (Molt fàcil de trobar)


#include <stdio.h>
#include <stdlib.h>


int main(){


printf("Hola mon\n");
system("pause");
return 0;


}




  





◦ Demanar el nom a l'usuari i mostrar-lo (haureu de buscar una mica més)




#include <stdio.h>
#include <string.h>


int main () {
    char nom [20];
    puts ("Escriu el teu nom");
   scanf ("%s", nom);
   printf ("El teu nom es: %s %s\n", nom);
   system("pause");
   return 0;
}
  

























• Buscar com estan les ofertes de treball a Infojobs del llenguatge.


Doncs per estrany que em paregui en infojobs hi han 1974 ofertes de treball, es el que té més ofertes de treball en diferencia
  





• WebGrafia
https://openwebinars.net/blog/que-es-c/


https://blog.makeitreal.camp/lenguajes-compilados-e-interpretados/


https://algoritmosurgentes.com/algoritmo-en-lenguaje-c/suma-de-dos-numeros
