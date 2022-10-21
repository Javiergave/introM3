/*Aquest programa demana dos valors enters i suma 
tots els nombres que hi hagin entre el més petit i el més gran d'ells.*/
public class SumaInterval { 
    public static void main(String[] args) { 

        System.out.println("Inici?"); 
        int ini = Integer.parseInt(Entrada.readLine()); 

        System.out.println("Final?"); 
        int fin = Integer.parseInt(Entrada.readLine()); 

        int total = 0;

        for (int n = ini; n <= fin;n = n+1){

            total = total + n;
            
        }
        System.out.println(total); 
    }
}

