/*
 * Programa que indica si el número proporcionat com a primer argument
 * és parell o senar.
 * Si no s'especifica cap número, el resultat és indeterminat.
 */
public class Ternari {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        int resultat = (numero%2)!=0;
        int resultat = condicio ? 1 : 2;
        System.out.println("El número "+numero+" és "+resultat);
    }
}

