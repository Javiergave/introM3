/*Aquest programa demana un text i dibuixa un triangle amb les lletres del text. */
public class TriangleLletres {
    public static void main(String[] args) {  

        System.out.println("Text?"); 
        String paraula = Entrada.readLine(); 
        dibuixaTriangle(paraula);

    }
    public static void dibuixaTriangle(String paraula) {  
        if (paraula.length()>1){
            for (int i = 0; i <= paraula.length()-1; i++){
                dibuixaLinia(paraula, i);
            }
        }
        else{
            System.out.println(paraula); 
        }
    }
    
    public static void dibuixaLinia(String paraula, int i) {  
        for (int j = 0; j <= i;j++){
            if (i==j){
                System.out.println(paraula.charAt(j)); 
            }
            else{
                System.out.print(paraula.charAt(j)+", "); 
            }
        } 
    }
}
