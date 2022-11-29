/* demani un text i mostri només les lletres que conté. Cada lletra apareixerà 
separada per una coma en l'ordre en que apareixia al text original. La resta de 
caràcters no es mostraran. */

public class NomesLletres {
    public static void main(String[] args) {  

        System.out.println("Text?");
        String paraula = Entrada.readLine(); 

        filtraLletres(paraula);
    
    }
    public static void filtraLletres(String paraula) {  
        int n = paraula.length()-1;

        while (Character.isLetter(paraula.charAt(n))==false){
            n = n-1;
        }
        
        for (int i= 0; i <= n-1; i++){

            if (Character.isLetter(paraula.charAt(i))){
                System.out.print(paraula.charAt(i)+", "); 
            }
            
        }
        System.out.println(paraula.charAt(n));
    }
}
