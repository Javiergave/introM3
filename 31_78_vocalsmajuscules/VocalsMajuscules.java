/*Aquest programa demana un text i mostra totes les lletres en minúscules 
excepte les vocals, que estaràn en majúscules. */
public class VocalsMajuscules {
    public static void main(String[] args) { 
        
        System.out.println("Text?"); 
        String paraula = Entrada.readLine();

        for (int i= 0; i <= paraula.length()-1; i++){

            boolean esVocal = paraula.charAt(i)=='a'||paraula.charAt(i)=='e'||paraula.charAt(i)=='i'||paraula.charAt(i)=='o'||paraula.charAt(i)=='u';

            if (Character.isLetter(paraula.charAt(i))&&esVocal==false){
                System.out.print(Character.toLowerCase(paraula.charAt(i))); 
            }
            else{
                System.out.print(Character.toUpperCase(paraula.charAt(i))); 
            }
            
        }

        System.out.println();

    }
}
