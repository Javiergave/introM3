###########################
Anotacions sobre propietats
###########################

* Autor/a: Javier Garcia Vera

* Data: 08-02-2023

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *propietats*
dins de la *programació orientada a objectes*.

Les anotacions responen a diferents preguntes sobre aquest codi:

::

    01   public class GatRenat {
    02       public int vides = 7;         // vides disponibles del gat Renat
    03       public static void main(String[] args) {
    04           GatRenat renat;           // declarem la referència al gat
    05           renat = new GatRenat();   // creem la instància del gat Renat.
    06           System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    07       }
    08   }

Pregunta 1. El nom del fitxer
=============================

Per que funcioni, el nom del fitxer que contingui el programa anterior ha
de ser ``XXX``.

Si reanomeno el fitxer anterior a ``UnNomQualsevol.java``, em trobo el
següent resultat a l'hora de compilar:

::

    $ javac UnNomQualsevol.java
    
    Error de compilacio degut a que el nom de la class no es el mateix que el de el document

Pregunta 2. Sortida
===================

En executar el programa ``GatRenat`` m'ha generat la següent sortida:

::

    $ java GatRenat
     
    Al gat renat li queden 7 vides

Pregunta 3. Declaració de ``renat``.
====================================

La línia en que està declarada la variable ``renat`` que apareix a la
línia 6 és la línia 4

Pregunta 4. Inicialització
==========================

El valor que es mostra per pantalla, és assignat a la línia 5.

Pregunta 5. No inicialització
=============================

Si a la línia especificada per la pregunta anterior no li assignem cap
valor, el que es mostrarà per pantalla és:

::

    Mostrarà un error ja que si no s'inicialitza i s'utilitza el compilador es queixa

Pregunta 6. Eliminem la línia 5
===============================

En cas que la línia 5 no hi sigui (per exemple, si la comento), es
produeix el següent resultat:

GatRenat.java:6: error: variable renat might not have been initialized

Penso que passa això perquè no s'inicialitza renat.

Pregunta 7. Referència
======================

Penso que el el comentari de la línia 4 parla de *referència* perquè al ser un tipus no primitiu és una referéncia a una part de la memòria.

Crec que la  relació entre *referència* i *variable* és: que ambdues contenen valors.


Pregunta 8. Instància
=====================

Respecte la línia 5:

* la instància és: renat.vides = 7

* la variable és: vides

* la referència és: renat

* la classe és: GatRenat

Pregunta 9. ``vides`` i variables globals
=========================================

Les diferències presenta la variable ``vides`` respecte les 
*variables globals* són:

1. Que no és static

2. Que només es pot accedir a aquesta variable desde aquesta instància de GatRenat
