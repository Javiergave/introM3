/*Aquest programa permet utilitzar l'ascensor */

public class UsaAscensor {
    public static void main(String[] args) {  
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());

         System.out.println("Moviment inicial: " + ascensor.getMoviment());

         System.out.println("Introdueix nou pis:");
         String nouPis = Entrada.readLine();
         
         if(UtilString.esEnter(nouPis)){
            ascensor.setPis(Integer.parseInt(nouPis));
         }

         System.out.println("Introdueix nou moviment:");

         ascensor.setMoviment(Entrada.readLine());

         System.out.println("Pis final: " + ascensor.getPis());

         System.out.println("Moviment final: " + ascensor.getMoviment());
    }
    
}