/*Aquest programa demani un número per entrada estàndard, i dibuixa tants quadrats com indica el número. Si el número és 0 o negatiu, no dibuixarà res. */
public class Quadrat {
    public static void main(String[] args) { 
        int valor = Integer.parseInt(args[0]);  
        if (valor>1){
            for (int i = 0;i<=valor; i++){
                dibuixaLinia();
                System.out.println(); 
            }
        }
    }
    public static void dibuixaLinia(){ 
        for (int a = 1; a<=5; a++){
            System.out.print(" X"); 
        }
    }
}


