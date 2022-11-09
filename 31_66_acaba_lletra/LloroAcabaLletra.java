import java.sql.Blob;

//Aquest programa nomes repeteix les paraules que no acabin en vocal minuscula i s'atura quan l'input sigui buit
public class LloroAcabaLletra { 
    public static void main(String[] args) {  

        System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
        String paraula = Entrada.readLine();
        // A l'inici vaig probar amb un or de (paraula = paraula.trim();)
        

        while (((paraula.isBlank()))==false) {

            int ultima = paraula.length()-1;

            boolean a = Character.toLowerCase(paraula.charAt(ultima))=='a';
            boolean e = Character.toLowerCase(paraula.charAt(ultima))=='e';
            boolean i = Character.toLowerCase(paraula.charAt(ultima))=='i';
            boolean o = Character.toLowerCase(paraula.charAt(ultima))=='o';
            boolean u = Character.toLowerCase(paraula.charAt(ultima))=='u';
            
            boolean exclamacio = paraula.charAt(ultima)=='!';
            boolean interrogacio = paraula.charAt(ultima)=='?';
            boolean punt = paraula.charAt(ultima)=='.'; 

            if (exclamacio||interrogacio||punt){

                ultima = ultima - 1;

            }

            if (!(a||e||i||o||u)){
                System.out.println("El lloro diu: "+paraula);
            }   
                
            System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
            paraula = Entrada.readLine();
            paraula = paraula.trim();
        }

        System.out.println("Adéu");
    }
}