/*Aquest programa demana dos valors enters i suma 
tots els nombres que hi hagin entre el més petit i el més gran d'ells.*/
public class SumaInterval { 
    public static void main(String[] args) { 

        System.out.println("inici?"); 
        int ini = Integer.parseInt(Entrada.readLine()); 

        System.out.println("final?"); 
        int fin = Integer.parseInt(Entrada.readLine()); 

        int total = 0;

        if (fin<ini){

            for (int n = ini; n >= fin;n--){

                total = total + n;
                
            }  
        }

        else{

            for (int n = ini; n <= fin;n++){

                total = total + n;
            
            }
        }
          
        System.out.println(total); 
    }
}

