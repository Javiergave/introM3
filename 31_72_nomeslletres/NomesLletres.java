//

public class NomesLletres {
    public static void main(String[] args) {  

        System.out.println("Text?");
        String paraula = Entrada.readLine(); 
        
        for (int i= 0; i <= paraula.length()-2; i++){

            if (Character.isLetter(paraula.charAt(i))){
                System.out.print(paraula.charAt(i)+", "); 
            }
            
        }
        int n = paraula.length()-1;
        while (Character.isLetter(paraula.charAt(n))){
            n = n-1;
        }
        System.out.println(paraula.charAt(paraula.length()-n));
    }
    
}
