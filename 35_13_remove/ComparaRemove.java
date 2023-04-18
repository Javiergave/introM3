/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */

/*

    Comparació de l'operació remove() en ArrayList i LinkedList

    eliminant per l'inici, pel final i pel mig.


    Els resultats obtinguts han estat:


    Primera execució:

    =================


Comparant l'eficiència de les llistes


Comparació quan eliminem sempre de l'inici

test remove(0) LinkedList:     9964966

test remove(0) ArrayList:      1231624189


Comparació quan eliminem sempre del final

test remove(últim) LinkedList: 13934964

test remove(últim) ArrayList:  10019909


Comparació quan eliminem sempre del mig

test remove(mig) LinkedList:   4853074100

test remove(mig) ArrayList:    430235294


        Segona execució:

        ================


Comparant l'eficiència de les llistes


Comparació quan eliminem sempre de l'inici

test remove(0) LinkedList:     10870086

test remove(0) ArrayList:      948444977


Comparació quan eliminem sempre del final

test remove(últim) LinkedList: 16362854

test remove(últim) ArrayList:  7416841


Comparació quan eliminem sempre del mig

test remove(mig) LinkedList:   5522350031

test remove(mig) ArrayList:    725995306


        Tercera execució:

        =================


Comparant l'eficiència de les llistes


Comparació quan eliminem sempre de l'inici

test remove(0) LinkedList:     9660109

test remove(0) ArrayList:      1349756053


Comparació quan eliminem sempre del final

test remove(últim) LinkedList: 16054985

test remove(últim) ArrayList:  2863966


Comparació quan eliminem sempre del mig

test remove(mig) LinkedList:   7436128181

test remove(mig) ArrayList:    491087238


        Resultats

        =========


========== ================== ================== ======================================================

**prova**  **linkedList**      **ArrayList**      **resultat**

---------- ------------------ ------------------ ------------------------------------------------------

inici       10165053           1176608406         És millor linkedList

final       15450934           6766905            És millor arrayList

mig         5937184103         549105946          És millor arrayList

========== ================== ================== ======================================================


    Per calcular cada columna:


    * la cel·la (1, 1) correspon al temps mig de la implementació LinkedList eliminant des de l'inici

      Es calcula sumant els valors obtinguts a les tres execucions i dividint-los per 3


    * el resultat per la fila inici indica quantes vegades és més ràpid un que l'altre. Per fer-ho, dividim

      el valor més petit pel més gran i arrodonim a l'enter.


    Conclusions

    ===========


    En vistes als resultats, en cas que hagi de fer servir una List per eliminar molts valors, escolliré XXX


     */

     import java.util.List;

     import java.util.ArrayList;
     
     import java.util.LinkedList;
     
     public class ComparaRemove {
     
         private static final int LONGITUD = 100000;
     
         private static List<Integer> emplena(List<Integer> llista) {
    
            for (int i=0; i < LONGITUD; i++) {
    
                llista.add(i);
    
            }
    
            return llista;
     
         }
     
         private static long testRemove0(List<Integer> llista) {
     
             long tempsInicial = System.nanoTime();
     
             for (int i=LONGITUD-1; i >0; i--) {
    
                llista.remove(0);
    
            }     
             return System.nanoTime() - tempsInicial;
     
         }
     
         private static long testRemove(List<Integer> llista) {
     
             long tempsInicial = System.nanoTime();
     
             for (int i=LONGITUD-1; i >0; i--) {
    
                llista.remove(i);
    
            }       
             return System.nanoTime() - tempsInicial;
     
         }
     
         private static long testRemoveMig(List<Integer> llista) {
     
             long tempsInicial = System.nanoTime();
     
             for (int i=LONGITUD-1; i >0 ; i--) {

                int mig = llista.size() / 2;
    
                llista.remove(mig);
    
            }     
             return System.nanoTime() - tempsInicial;
     
         }
     
         public static void main(String[] args) {
     
             System.out.println("Comparant l'eficiència de les llistes");
     
             System.out.println();
     
     
             System.out.println("Comparació quan eliminem sempre de l'inici");
     
             System.out.printf("test remove(0) LinkedList:     %10d%n", testRemove0(emplena(new LinkedList<Integer>())));
     
             System.out.printf("test remove(0) ArrayList:      %10d%n", testRemove0(emplena(new ArrayList<Integer>())));
     
             System.out.println();
     
     
             System.out.println("Comparació quan eliminem sempre del final");
     
             System.out.printf("test remove(últim) LinkedList: %10d%n", testRemove(emplena(new LinkedList<Integer>())));
     
             System.out.printf("test remove(últim) ArrayList:  %10d%n", testRemove(emplena(new ArrayList<Integer>())));
     
             System.out.println();
     
     
             System.out.println("Comparació quan eliminem sempre del mig");
     
             System.out.printf("test remove(mig) LinkedList:   %10d%n", testRemoveMig(emplena(new LinkedList<Integer>())));
     
             System.out.printf("test remove(mig) ArrayList:    %10d%n", testRemoveMig(emplena(new ArrayList<Integer>())));
     
             System.out.println();
     
         }
     
     }