/*
 * Aquest programa demana el nom i el primer cognom als usuaris
 * i els mostra un missatge amistós.
 *
 * El programa no controla valors no adequats d'entrada
 */
public class NomCognom {
    public static void main(String[] args)
     {
  
        System.out.println("Nom?");
        String nom = Entrada.readLine();
        
        System.out.println("Primer cognom?");
        String cognom = Entrada.readLine();
        
        System.out.println("Ei " + nom + ", tinc una amiga que també és " + cognom + ".");
        }
     }
