/*Aquest programa demana un text i dibuixa un triangle amb les lletres del text. */
public class TriangleLletresInvertit {
    public static void main(String[] args) {  

        System.out.println("Text?"); 
        String paraula = Entrada.readLine(); 
        if (paraula.length()>1){
            for (int i = paraula.length()-1; i>=0; i--){
            
                for (int j = 0; j<=i; j++){

                    for (int k = paraula.length()-1; k<=j;k++){

                        if (k!=j){
                            System.out.print(paraula.charAt(k)+", ");
                        }

                        else {
                            System.out.print(paraula.charAt(k)); 
                        }
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
