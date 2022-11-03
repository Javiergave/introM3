/* Aquest programa demana dos texts i un enter positiu i composa un petit informe.*/

public class InformeString { 
    public static void main(String[] args) {  

        System.out.println("Text principal?"); 
        String paraula = Entrada.readLine(); 

        System.out.println("Text secundari?");
        String paraula2 = Entrada.readLine();  

        System.out.println("Número positiu?"); 
        int valor = Integer.parseInt(Entrada.readLine()); 

        System.out.println("\""+paraula +"\".length(): "+paraula.length());
        System.out.println("\""+paraula +"\".startsWith(\""+paraula2+"\"): "+paraula.startsWith(paraula2)); 
        System.out.println("\""+paraula +"\".endsWith(\""+paraula2+"\"): "+paraula.endsWith(paraula2)); 
        System.out.println("\""+paraula +"\".equals(\""+paraula2+"\"): "+paraula.equals(paraula2)); 
        System.out.println("\""+paraula +"\".equalsIgnoreCase(\""+paraula2+"\"): "+paraula.equalsIgnoreCase(paraula2));
        System.out.println("\""+paraula +"\".isBlank(): "+paraula.isBlank());
        System.out.println("\""+paraula +"\".isEmpty(): "+paraula.isEmpty());
        System.out.println("\""+paraula +"\".charAt("+valor+"): "+paraula.charAt(valor));
        System.out.println("\""+paraula +"\".concat(\""+paraula2+"\"): "+paraula.concat(paraula2));
        System.out.println("\""+paraula +"\".repeat("+valor+"): "+paraula.repeat(valor));
        System.out.println("\""+paraula +"\".toUpperCase(): "+paraula.toUpperCase());
        System.out.println("\""+paraula +"\".toLowerCase(): "+paraula.toLowerCase()); 
 

    }
}