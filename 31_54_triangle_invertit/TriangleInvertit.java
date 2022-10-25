//Aquest programa et Desenvolupa un programa que demani un nombre positiu més gran que 0. El programa escriu una línia per nombre entre el nombre introduït i el 1 (és a dir, decreixentment). A cada línia escriu tots els nombres des de l’1 fins el nombre corresponent a la línia.

public class TriangleInvertit {
    public static void main(String[] args) {     
        
        System.out.println("Nombre?");
        int valor = Integer.parseInt(Entrada.readLine()); 
        
        if (valor > 0){

        

            for (int i = valor; i>=1; i--){
            
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

    }
}