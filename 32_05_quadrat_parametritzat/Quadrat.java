/*Aquest programa demani un número per entrada estàndard, i dibuixa tants quadrats com indica el número. Si el número és 0 o negatiu, no dibuixarà res. */
public class Quadrat {
    public static void main(String[] args) {  
        int valor = Integer.parseInt(args[0]);
        if (valor>0){
            for (int i = 1;i<=valor; i++){
                dibuixaQuadrat(valor);
            }
        }
    }
    
    public static void dibuixaQuadrat(int valor){
        for (int a = 1; a<=valor; a++){
            dibuixaLinia(valor);
            System.out.println(); 
        }
    }
    public static void dibuixaLinia(int valor){ 
        for (int a = 1; a<=valor; a++){
            System.out.print(" X"); 
        }
    }
}


