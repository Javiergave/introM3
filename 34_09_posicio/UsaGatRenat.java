/*Aquest programa permet utilitzar l'ascensor */

public class UsaGatRenat {
    public static void main(String[] args) {  
        GatRenat renat = new GatRenat();
        System.out.println("Vides inicials: " + renat.getVides());

         System.out.println("Posició inicial: " + renat.getPosicio());

         renat.setPosicio("assegut");

         System.out.println("Posició final: " + renat.getPosicio()); 
    }
    
}
