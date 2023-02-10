/*Aquest programa permet utilitzar l'ascensor */

public class UsaAscensor {
    public static void main(String[] args) {  
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());

        System.out.println("Moviment inicial: " + ascensor.getMoviment());

        ascensor.setMoviment("pujant");

        System.out.println("Moviment final: " + ascensor.getMoviment()); 
    }
    
}
