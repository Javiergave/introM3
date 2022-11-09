//Aquest programa nomes repeteix les paraules que acabin en vocal minuscula i s'atura quan l'input sigui buit
public class LloroVocalMinuscules { 
    public static void main(String[] args) {  

        System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
        String paraula = Entrada.readLine();
 
        
        while (((paraula.isBlank()))==false) {
                
            if (paraula.charAt(paraula.length()-1)=='a'||paraula.charAt(paraula.length()-1)=='e'||paraula.charAt(paraula.length()-1)=='i'||paraula.charAt(paraula.length()-1)=='o'||paraula.charAt(paraula.length()-1)=='u'){
                System.out.println("El lloro diu: "+paraula);
            }   
                
            System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
            paraula = Entrada.readLine();
            paraula = paraula.trim();
        }

        System.out.println("Adéu");
    }
}