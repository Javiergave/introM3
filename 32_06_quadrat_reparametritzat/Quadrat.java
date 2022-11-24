/*Aquest programa demani un número per entrada estàndard, i dibuixa tants quadrats com indica el número. Si el número és 0 o negatiu, no dibuixarà res. */
public class Quadrat {
    public static void main(String[] args) {  
        int valor = Integer.parseInt(args[0]);
        char lletra = args[1].charAt(1);
        if (valor>0){
            
            dibuixaQuadrat(valor,lletra);
        
        }
    }
    
    public static void dibuixaQuadrat(int valor, char lletra){
        for (int a = 1; a<=valor; a++){
            dibuixaLinia(valor,lletra);
            System.out.println(); 
        }
    }
    public static void dibuixaLinia(int valor, char lletra){ 
        for (int a = 1; a<=valor; a++){
            System.out.print(lletra); 
        }
    }
}


