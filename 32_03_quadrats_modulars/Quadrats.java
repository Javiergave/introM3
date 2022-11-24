/*Aquest programa demani un número per entrada estàndard, i dibuixa tants quadrats com indica el número. Si el número és 0 o negatiu, no dibuixarà res. */
public class Quadrats {
    public static void main(String[] args) {  
        dibuixaQuadrats();
    }
    public static void dibuixaQuadrats(){ 
        System.out.println("Quants?");
        int valor = Integer.parseInt(Entrada.readLine());
        if (valor>0){
            dibuixaQuadrat();
            
        }
        
    }
    
    public static void dibuixaQuadrat(){
        for (int a = 1; a<=5; a++){
            dibuixaLinia();
            System.out.println(); 
        }
    }
    public static void dibuixaLinia(){ 
        for (int a = 1; a<=5; a++){
            System.out.print(" X"); 
        }
    }
}


