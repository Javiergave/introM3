/*Aquest programa demana un text i dibuixa un triangle amb les lletres del text. */
public class TriangleLletresInvertit {
    public static void main(String[] args) {  

        System.out.println("Text?"); 
        String paraula = Entrada.readLine(); 
        if (paraula.length()>1){
            dibuixaTriangleInvertit(paraula);
        }
        else{
            System.out.println(paraula); 
        }

    }
    public static void dibuixaTriangleInvertit(String paraula) {  
        for (int i = paraula.length()-1; i>=0; i--){
            
            dibuixaLiniaInvertida(paraula, i);

            System.out.println(); 

        }
    }
    public static void dibuixaLiniaInvertida(String paraula, int i) {
        for (int j = i; j>=0; j--){

            if (j>0){
                System.out.print(paraula.charAt(j)+", ");
            }

            else {
                System.out.print(paraula.charAt(j)); 
            }
            
        } 
    } 
}
