//Aquest programa nomes repeteix les paraules que acabin en vocal minuscula i s'atura quan l'input sigui buit
public class LloroVocalMinuscules { 
    public static void main(String[] args) {  

        System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
        String paraula = Entrada.readLine();
        // A l'inici vaig probar amb un or de (paraula = paraula.trim();)
        
        while (((paraula.isBlank()))==false) {
                
            if (paraula.charAt(paraula.length())=='a'||paraula.charAt(paraula.length())=='e'||paraula.charAt(paraula.length())=='i'||paraula.charAt(paraula.length())=='o'||paraula.charAt(paraula.length())=='u'){
                System.out.println("El lloro diu: "+paraula);
            }   
                
            System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
            paraula = Entrada.readLine();
            paraula = paraula.trim();
        }

        System.out.println("Adéu");
    }
}