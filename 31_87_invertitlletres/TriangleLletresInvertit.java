/*Aquest programa demana un text i dibuixa un triangle amb les lletres del text. */
public class TriangleLletresInvertit {
    public static void main(String[] args) {  

        System.out.println("Text?"); 
        String paraula = Entrada.readLine(); 
        if (paraula.length()>1){
            for (int i = paraula.length()-1; i>=0; i--){
            
                for (int j = i; j>=0; j--){

                    if (j>0){
                        System.out.print(paraula.charAt(j)+", ");
                    }

                    else {
                        System.out.print(paraula.charAt(j)); 
                    }
                    
                }

                System.out.println(); 

            }
        }
        else{
            System.out.println(paraula); 
        }

    }
}
