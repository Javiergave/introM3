public class TriangleInvertit {
    public static void main(String[] args) {     
        
        System.out.println("Nombre?");
        int valor = Integer.parseInt(Entrada.readLine()); 
        
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