/*Aquest programa et pregunta quants pacmans vols i imprimeix aquesta quantitat 

           *******
         ***********
       **************
      ****************
      ****************
      *************
      ***********
      *********
      *******
      *********
      ***********
      *************
      ***************
      ***************
       *************
         **********
           ******
*/
      
public class Pacman {
    public static void main(String[] args) {  
    
        System.out.println("Quants Pacmans vols?"); 
        int valor = Integer.parseInt(Entrada.readLine()); 

        String fila1 = "           ******";
        String fila2 = "         **********";
        String fila3 = "       *************";
        String fila4 = "      ***************";
        String fila5 = "      ****************";
        String fila6 = "      *************";
        String fila7 = "      ***********";
        String fila8 = "      *********";

        for (int i = valor; i>= 1; i--){
            
            System.out.println(fila1); 
            System.out.println(fila2); 
            System.out.println(fila3); 
            System.out.println(fila4); 
            System.out.println(fila5); 
            System.out.println(fila6); 
            System.out.println(fila7); 
            System.out.println(fila8); 
            System.out.println("      *******"); 
            System.out.println(fila8); 
            System.out.println(fila7); 
            System.out.println(fila6); 
            System.out.println(fila5); 
            System.out.println(fila4); 
            System.out.println(fila3); 
            System.out.println(fila2); 
            System.out.println(fila1); 
 
            System.out.println(); 
        }
        
    

    }

}