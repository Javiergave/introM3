/*Aquest programa demani un nombre positiu més gran que 0. El programa escriurà 
una línia per nombre entre el 1 i el nombre introduït (es a dir, creixentment). 
A cada línia escriurà tots els nombres des del nombre corresponent a la línia fins 
al 1.*/

public class TriangleNombres{
    public static void main(String[] args) {  
        
        System.out.println("Nombre?");
        int valor = Integer.parseInt(Entrada.readLine()); 

        if (valor > 0){
              
            for(int i=1; i<=valor; i++){  

                for(int j=i; j>=1; j--){
   
                    System.out.print(j+" ");  

                }   

                System.out.println();
               
            } 
        }

    }
}