//

public class NomesLletres {
    public static void main(String[] args) {  

        System.out.println("Text?");
        String paraula = Entrada.readLine(); 

        int n = paraula.length()-1;

        while (Character.isLetter(paraula.charAt(n))==false){
            n = n-1;
        }
        
        for (int i= 0; i <= n; i++){

            if (Character.isLetter(paraula.charAt(i))){
                System.out.print(paraula.charAt(i)+", "); 
            }
            
        }
        
        System.out.println(paraula.charAt(n));
    }
    
}
