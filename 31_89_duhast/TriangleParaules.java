/*Aquest programa construeix un triangle de paraules */

public class TriangleParaules {
    public static void main(String[] args) {  

        System.out.println("Text?");
        String paraula = Entrada.readLine(); 
        
            for (int k = 0; (k<=paraula.length()-1); k++){
                
                if (Character.isWhitespace(paraula.charAt(k))){
                    if (Character.isLetter(paraula.charAt(k-1))){
                        System.out.println(); 
                        for (int i = 0; i<=k; i++){
                            System.out.print(paraula.charAt(i)); 
                        }
                    }
                }
                else{
                System.out.print(paraula.charAt(k)); 
                }

            }
        System.out.println(); 
    }
}

