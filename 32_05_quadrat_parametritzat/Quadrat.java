/*Aquest programa demani un número per entrada estàndard, i dibuixa tants quadrats com indica el número. Si el número és 0 o negatiu, no dibuixarà res. */
public class Quadrat {
    public static void main(String[] args) { 
        int valor = Integer.parseInt(args[0]);  
        if (valor>=1){
            for (int i = 1;i<=valor; i++){
                for (int j = 1;j<=valor; j++){
                    dibuixaX();
                }
                System.out.println(); 
            }
        }
    }
    public static void dibuixaX(){
        System.out.print(" X"); 
    }
}


