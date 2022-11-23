/*Aquest programa demani un número per entrada estàndard, i dibuixa tants quadrats com indica el número. Si el número és 0 o negatiu, no dibuixarà res. */
public class Quadrats {
    public static void main(String[] args) {  
        System.out.println("Quants?");

        dibuixaQuadratsDemanats();

    }
    public static void dibuixaQuadratsDemanats(){ 
        int valor = Integer.parseInt(Entrada.readLine()); 
        if (valor>0){
            for (int a = 1; a<=valor; a++){
                for (int j = 1; j<=5; j++){
                    System.out.print(" X"); 
                }
                System.out.println(); 
            }
        }
    }
}

