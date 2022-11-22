/*Aquest programa demana un text i dibuixa un triangle amb les lletres del text en 
ordre invers al text introduït. */
public class PiramideLletres {
    public static void main(String[] args) {  
        System.out.println("Text?");
        String paraula = Entrada.readLine(); 

        int files = paraula.length();
        
        for (int i = 0; i <= files; i++){
            for (int j = 0; j <= i;j++){
                for (int k = 4-i; k >=0; k--){
                    System.out.print("."); 
                }
                for (int k = 0; k <=i; k++){
                    System.out.print(paraula.charAt(k)+"-"+paraula.charAt(k)); 
                }
                
                for (int k = 4-i; k >=0; k--){
                    System.out.print("."); 
                }
                System.out.println(); 
            } 
        }
    }
}
