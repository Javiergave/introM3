//Aquest programa nomes repeteix les paraules que no acabin en vocal minuscula i s'atura quan l'input sigui buit
public class LloroAcabaLletra { 
    public static void main(String[] args) {  

        System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
        String paraula = Entrada.readLine();
        // A l'inici vaig probar amb un or de (paraula = paraula.trim();)
        
        while (((paraula.isBlank()))==false) {
                
            if (!(paraula.charAt(paraula.length()-1)=='a'||paraula.charAt(paraula.length()-1)=='e'||paraula.charAt(paraula.length()-1)=='i'||paraula.charAt(paraula.length()-1)=='o'||paraula.charAt(paraula.length()-1)=='u')){
                System.out.println("El lloro diu: "+paraula);
            }   
                
            System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
            paraula = Entrada.readLine();
            paraula = paraula.trim();
        }

        System.out.println("Adéu");
    }
}