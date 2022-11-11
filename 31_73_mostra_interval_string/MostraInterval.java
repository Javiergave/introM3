/*Aquest programa demana un text i dos valors enters, i que
mostra tots els caràcters que hi ha entre el primer i el 
segon, en l'ordre marcat per l'entrada. */

public class MostraInterval {
    public static void main(String[] args) { 
        
        System.out.println("text?"); 
        String paraula = Entrada.readLine(); 

        System.out.println("inici?"); 
        int ini = Integer.parseInt(Entrada.readLine()); 

        System.out.println("final?"); 
        int fin = Integer.parseInt(Entrada.readLine()); 

        if (fin<ini){

            if (fin<0) {

                fin = 0;

            }

            for (int n = ini; n >= fin;n--){

                System.out.println(paraula.charAt(n)); 
                
            }  
        }

        else{

            if (ini<0) {

                ini = 0;

            }

            for (int n = ini; n <= fin;n++){

                if (n<paraula.length()){

                System.out.println(paraula.charAt(n)); 

                }
            
            }
        }

    }
}
