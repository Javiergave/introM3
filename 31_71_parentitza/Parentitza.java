//Aquest programa demana un text i mostra cada lletra entre parèntesis

public class Parentitza {
    public static void main(String[] args) {  

        System.out.println("Text?");
        String paraula = Entrada.readLine(); 
        
        for (int i= 0; i <= paraula.length()-1; i++){

            if (Character.isLetter(paraula.charAt(i))){
                System.out.print("("+paraula.charAt(i)+")"); 
            }
            else{
                System.out.print(paraula.charAt(i)); 
            }
            
        }

        System.out.println();

    }
    
}