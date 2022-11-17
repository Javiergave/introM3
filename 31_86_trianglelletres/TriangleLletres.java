/*Aquest programa demana un text i dibuixa un triangle amb les lletres del text. */
public class TriangleLletres {
    public static void main(String[] args) {  

        System.out.println("Text?"); 
        String paraula = Entrada.readLine(); 
        if (paraula.length()>1){
            for (int i = 0; i <= paraula.length()-1; i++){
                for (int j = 0; j <= i;j++){
                    if (j==0){
                        System.out.println(paraula.charAt(j)); 
                    }
                    else{
                        System.out.print(paraula.charAt(j)+", "); 
                    }
                }

            }
        }
        else{
            System.out.println(paraula); 
        }
    }
}
