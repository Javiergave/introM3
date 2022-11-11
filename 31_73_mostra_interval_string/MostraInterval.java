/*Aquest programa demana un text i dos valors enters, i que
mostra tots els caràcters que hi ha entre el primer i el 
segon, en l'ordre marcat per l'entrada. */

public class MostraInterval {
    public static void main(String[] args) {  

        System.out.println("inici?"); 
        int ini = Integer.parseInt(Entrada.readLine()); 

        System.out.println("final?"); 
        int fin = Integer.parseInt(Entrada.readLine()); 

        if (fin<ini){

            for (int n = ini; n >= fin;n--){

                System.out.println(n); 
                
            }  
        }

        else{

            for (int n = ini; n <= fin;n++){

                System.out.println(n); 
            
            }
        }

    }
}
