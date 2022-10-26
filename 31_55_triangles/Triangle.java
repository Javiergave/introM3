//Aquest programa et demana un nombre i fa la quantitat de triangles desitjada
public class Triangle {
    public static void main(String[] args) {     
        
        System.out.println("Nombre?");
        int valor = Integer.parseInt(Entrada.readLine()); 
        
        for (int i = valor; i>=1; i--){
            
            for (int j = 1; j<=9; j++){
                
                for (int l = j; l<=1; l--){
                    System.out.print("."); 
                }

                System.out.print(j);

                

            }
            for (int k = 8; k>=1; k--){
                
                

                System.out.print(k);

                

            }
            


            System.out.println(); 

        }

    }
}