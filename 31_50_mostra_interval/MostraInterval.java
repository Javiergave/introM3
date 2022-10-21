/*Aquest programa demana dos valors enters i mostra 
tots els nombres que hi hagin entre el més petit i el més gran d'ells.*/
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

