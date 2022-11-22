/*Aquest programa construeix un triangle de paraules */

public class TriangleParaules {
    public static void main(String[] args) {  

        System.out.println("Text?");
        String paraula = Entrada.readLine(); 
    
        int cantidadPalabras = 1;
        for (int i = 0; i<=paraula.length()-1;i++){
            if (Character.isWhitespace(paraula.charAt(i))){
                if (Character.isLetter(paraula.charAt(i-1))){
                    cantidadPalabras += 1;
                }
            }
        }
        int l = 0;
        for (int i = 0; i<=paraula.length()-1;i++){
            if (Character.isWhitespace(paraula.charAt(i))){
                if (Character.isLetter(paraula.charAt(i-1))){
                    l = i;
                    break;
                }
            }
        }
        
        for (int j = 1; j<= cantidadPalabras; j++){
            for (int k = 0; (k<=paraula.length()-1)&&(k<=l); k++){
                if (Character.isWhitespace(paraula.charAt(k))){
                    if (Character.isLetter(paraula.charAt(k-1))){
                        
                        break;
                    }
                }
                System.out.print(paraula.charAt(k)); 

                

            }
            System.out.println(); 
        }
    }
}

