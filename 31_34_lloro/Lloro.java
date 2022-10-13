//aquest programa repeteix els inputs fins que no rebi un
public class Lloro {
    public static void main(String[] args) {

        System.out.println("El lloro espera paraula:");
        String paraula = Entrada.readLine();;
        if (!(paraula.isEmpty())) {
            
            System.out.println("El lloro repeteix: " + paraula);
            System.out.println("El lloro espera paraula:");
            paraula = Entrada.readLine();;
            
       } else {    
    
        System.out.println("Adéu");
    }
}
}
