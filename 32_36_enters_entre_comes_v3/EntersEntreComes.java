/*Aquest programa mostra tres enters separats per comes tenint en 
comptes que els tres valors es troben emmagatzemats en un array 
d'enters. */

public class EntersEntreComes {

    public static void main(String[] args) {

        System.out.println("Quants?"); 
        int valor = Integer.parseInt(Entrada.readLine()); 

        int[] numeros;

        numeros = new int[valor];

        for (int i = 0; i<valor-1; i++){
            System.out.println("Valor"+i+"?"); 
            numeros [i] = Integer.parseInt(Entrada.readLine()); 
        }

        System.out.print(numeros[0]);

        for (int i = 1; i < numeros.length; i++) {

            System.out.print(", " + numeros[i]);

        }

        System.out.println();

    }

}