/*Aquest programademana un text i mostra el mateix text amb les 
inicials de cada paraula en majúscules i la resta en minúscules. */
public class MajusculitzaInicials {
    public static void main(String[] args) {  

        System.out.println("Text?");
        String paraula = Entrada.readLine(); 
        
        for (int i = 0; i<= paraula.length()-1; i++){
            
            if (i==0|| Character.isLetter(paraula.charAt(i-1))==false){
                System.out.print(Character.toUpperCase(paraula.charAt(i))); 
            }
            else{

                System.out.print(paraula.charAt(i)); 

            }

            
        }

    }
}
