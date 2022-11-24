/*Aquest programa demani un número per entrada estàndard, i dibuixa tants quadrats com indica el número. Si el número és 0 o negatiu, no dibuixarà res. */
public class Quadrats {
    public static void main(String[] args) {  
        System.out.println("Quants?");
        int valor = Integer.parseInt(Entrada.readLine());
        if (valor>0){
            for (int i = 1; i<=valor; i++){
                dibuixaQuadrat();
                System.out.println(); 

            }
        }
    }
    public static void dibuixaQuadrat(){ 
        for (int a = 1; a<=5; a++){
            dibuixaLinia();
            System.out.println(); 
        }
    }
    public static void dibuixaLinia(){ 
        for (int j = 1; j<=5; j++){
            System.out.print(" X"); 
        }
    }
}


