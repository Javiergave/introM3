##########################################
Anotacions sobre les propietats protegides
##########################################

* Autor/a: Javier García Vera

* Data: 10/02/2023

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de
*propietats protegides* dins de la *programació orientada a objectes*.

Considerarem la nova versió de ``GatRenat``::


::

    01   public class GatRenat {
    02       private int vides = 7;
    03       public int getVides() {  //  retorna el nombre de vides
    04           return vides;
    05       }
    06       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
    07           if (novesVides >= 0) {
    08               vides = novesVides;
    09           }
    10       }
    11   }


Pregunta 1. L'accés de sempre
=============================

Si ``UsaGatRenat`` fos:

::

       public class UsaGatRenat {
           public static void main(String[] args) {
               GatRenat renat = new GatRenat();
               System.out.println("El gat Renat té " + renat.vides + " vides");
           }
       }

Ens trobem que dona error de compilació

Penso que passa perquè renat.vides es una variable privada, per tant només es pot accedir desde la mateixa classe

Pregunta 2. Un nou accés
========================

En modificar el codi de ``UsaGatRenat`` com:

::

     public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La diferència respecte a la versió de la pregunta anterior és que utilitzem una funció per obtenir les vides.

El resultat ara és que funciona correctament

Penso que passa això perquè aquesta funció és a la matixa clase, per tant pot accedir a vides i 
a més la funció es public per tant es pot accedir des de altres classes.

Pregunta 3. Canviant valor
==========================

Per què des del ``main()`` de ``UsaGatRenat`` poguem dir que ``renat`` té
5 vides, cal fer que utilitzi la funcio setVides.

El codi de ``UsaGatRenat`` seria:

::

    public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             renat.setVides(5);
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 5 vides


La meva explicació de perquè això és així és que el modul setVides pot canviar la variable vides de renat


Pregunta 4. Un valor absurd
===========================

En intentar assignar de la manera anterior -12 en comptes de 5 vides, ens
trobem que no ens deixa 

El codi seria:

::

    public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             renat.setVides(5);
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }


La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 5 vides


La meva explicació de perquè això és així és que al modul setVides comprova si les vides que intentes introduir són menors de 0


Pregunta 5. I des de ``GatRenat``?
==================================

He experimentat com es comporta ``private`` des del ``main()`` del propi
``GatRenat``. En concret, he provat:

::

   public class GatRenat {
       private int vides = 7;
       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();
           renat.vides = -12;
           System.out.println("El gat Renat té " + renat.vides + " vides");
       }
   }

En intentar compilar i executar aquesta versió em trobo què funciona i renat té -12 vides

Comparant-lo amb el que passava a la pregunta 1, veiem que aquí no hi ha cap error de compilació.

La meva explicació és que main segueix estant a la mateixa classe que private int vides i per tant main pot modificar i accedir a vides

Pregunta 6. Valors absurds novament
===================================

Un cop hem vist el funcionament d'aquesta versió de ``GatRenat``, ens
podem fer la següent pregunta:

    És possible posar un valor absurd a les vides d'una instància de
    GatRenat sense modificar el programa ``GatRenat.java``?

La meva resposta és no a no ser que massa vides també siguin absurdes(2147483647 vides) perquè GatRenat conté la comprovacio que fa que no
es pugui canviar la quantitat de vides a no ser que sigui més de 0.

Pregunta 7. públic i privat
===========================

La meva idea del paper que juguen les paraules ``public`` i ``private`` a
les propietats d'una classe és restringir l'accés i mutabilitat dels continguts d'aquesta classe

Pregunta 8. Només *getter*
==========================

Aquesta implementació de ``GatRenat`` disposa de *getter* i de *setter*.
Aquests venen definits pels mòduls getVides i setVides.

En cas que ``GatRenat`` només disposés de *getter*, el resultat seria que podries veure la quantitat de vides però no canviar-la.

En canvi, si només en tingués *setter* el que passaria és que podires canviar les vides però no saber quantes té.

Finalment, si no en tingués cap dels dos, ens trobaríem que no seria possible fer res .


Pregunta 9. Diferències amb els mòduls ja coneguts
==================================================

Els mòduls ``getVides()`` i ``setVides()`` tenen una definició
lleugerament diferent als mòduls que hem declarat abans del tema de POO.
En concret no són public static, només son public
