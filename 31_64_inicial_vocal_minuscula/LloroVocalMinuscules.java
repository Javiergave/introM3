//Aquest programa nomes repeteix les paraules que comencin en vocal minuscula i s'atura quan l'input sigui buit
public class LloroVocalMinuscules { 
    public static void main(String[] args) {  

        System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
        String paraula = Entrada.readLine();
        // A l'inici vaig probar amb un or de (paraula = paraula.trim();)
        
        while (((paraula.isBlank()))==false) {
                
            if (paraula.charAt(0)=='a'||paraula.charAt(0)=='e'||paraula.charAt(0)=='i'||paraula.charAt(0)=='o'||paraula.charAt(0)=='u'){
                System.out.println("El lloro diu: "+paraula);
            }   
                
            System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
            paraula = Entrada.readLine();
            paraula = paraula.trim();
        }

        System.out.println("Adéu");
    }
}