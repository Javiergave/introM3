/*Aquest programa demana un text i dibuixa un triangle amb les lletres del text. */
public class TriangleLletresInvertit {
    public static void main(String[] args) {  

        System.out.println("Text?"); 
        String paraula = Entrada.readLine(); 
        if (paraula.length()>1){
            for (int i = paraula.length(); i>=1; i--){
            
                for (int j = 1; j<=i; j++){

                    if (j!=i){
                        System.out.print(j+", ");
                    }

                    else {
                        System.out.print(j); 
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
