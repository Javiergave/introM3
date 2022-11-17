/*Aquest programa demana un text i dibuixa un triangle amb les lletres del text. */
public class TriangleLletres {
    public static void main(String[] args) {  

        System.out.println("Text?"); 
        String paraula = Entrada.readLine(); 

        for (int i = 0; i <= paraula.length()-2; i++){
            for (int j = 0; j <= i;j++){
                System.out.print(paraula.charAt(j)+", "); 
            }
            if (i == paraula.length()-2){
                System.out.println(paraula.charAt(i+1)); 
            }
            else{
                System.out.println();
            } 
        }
 

    }
}
