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

        System.out.println(paraula.charAt(paraula.length()-1));

    }
    
}
