//aquest programa repeteix els inputs fins que no rebi un
public class Lloro {
    public static void main(String[] args) {
        
        System.out.println("El lloro espera paraula:");
        String paraula = Entrada.readLine();
            while ((paraula.isEmpty())==false) {       
            System.out.println("El lloro repeteix: " + paraula);
            System.out.println("El lloro espera paraula:");
            paraula = Entrada.readLine();
            }
        System.out.println("Adéu"); 
        }
        
    }    
