/*Aquest programa construeix un triangle de paraules */

public class TriangleParaules {
    public static void main(String[] args) {  

        System.out.println("Text?");
        String paraula = Entrada.readLine(); 
    
        int cantidadPalabras = 0;
        for (int i = 0; i<=paraula.length()-1;i++){
            if (Character.isWhitespace(paraula.charAt(i))){
                if (Character.isLetter(paraula.charAt(i-1))){
                    cantidadPalabras += 1;
                }
            }
        }
        System.out.println(cantidadPalabras); 
        for (int j = 0; j<= cantidadPalabras; j++){
            for (int k = 0; (k<= paraula.length()-1)&&(Character.isWhitespace(paraula.charAt(k))==false); k++){
                
                System.out.print(paraula.charAt(k)); 

            }
            System.out.println(); 
        }
    }
}

