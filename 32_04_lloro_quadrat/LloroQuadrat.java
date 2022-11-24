//aquest programa repeteix els inputs fins que no rebi un
public class LloroQuadrat {
    public static void main(String[] args) {
        
        String paraula ="a";
        // A l'inici vaig probar amb un or de (paraula = paraula.trim();)
        while (((paraula.isBlank())==false)) {       
            
            System.out.println("El lloro espera paraula:");
            paraula = Entrada.readLine();
            if (paraula.equals("dibuixa quadrat")||paraula.equals("dibuixa rectangle")){
                if(paraula.equals("dibuixa quadrat")){
                    dibuixaQuadrat();
                }
                else{
                    dibuixaRectangle();
                }
            }
            else if (paraula.isBlank()==false){
                System.out.println("El lloro repeteix: " + paraula);
            }
            else{
                break;
            }
        }
        
        System.out.println("Adéu"); 
        
    }

    public static void dibuixaQuadrat(){ 
        for (int a = 1; a<=5; a++){
            for (int j = 1; j<=5; j++){
                System.out.print(" X"); 
            }
            System.out.println(); 
        }
    }
    public static void dibuixaRectangle(){ 
        for (int a = 1; a<=5; a++){
            for (int j = 1; j<=10; j++){
                System.out.print(" X"); 
            }
            System.out.println(); 
        }
    }
}    
