public class Lloro {
    public static void main(String[] args) {

        System.out.println("El lloro espera paraula:");
        String paraula = Entrada.readLine();;
        while (!(paraula.isEmpty())) {
            
            System.out.println("El lloro repeteix: " + paraula);
            System.out.println("El lloro espera paraula:");
            paraula = Entrada.readLine();;
            
       }    
                

        // mostrem el resultat
        System.out.println("Adéu");
    }
}
