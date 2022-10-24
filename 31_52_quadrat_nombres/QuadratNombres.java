//Aquest programa demana un enter positiu més gran que 0 i "dibuixa" un quadrat amb els nombres del 1 fins el valor de l'entrada.
public class QuadratNombres { 
    public static void main(String[] args) {  

        System.out.println("Valor final?"); 
        int valor = Integer.parseInt(Entrada.readLine()); 
        
        if ((valor>0)&&(valor<9)){
            for (int a = 0; a<valor; a++){
                for (int j = 0; j<valor; j++){
                    System.out.print(j+" "); 
                }
                System.out.println(); 
            }
        }
        else{
            System.out.println("valor inadequat"); 
        }

    }
}