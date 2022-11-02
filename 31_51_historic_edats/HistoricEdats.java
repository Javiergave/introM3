/*Aquest programa demana el nom d'una persona, la seva edat i l'any actual, 
i escriu l'edat que tenia aquella persona cada any des del seu naixement. */
public class HistoricEdats {
    public static void main(String[] args) {  
        
        System.out.println("El vostre nom?");
        String paraula = Entrada.readLine(); 
        
        System.out.println("La vostra edat?");
        int edat_actual = Integer.parseInt(Entrada.readLine()); 
        
        System.out.println("L'any actual?");
        int any_actual = Integer.parseInt(Entrada.readLine()); 
        
        if (edat_actual>0){

            int any_neixement = any_actual - edat_actual;

            if (edat_actual>0){

                System.out.println("El " +any_neixement+ " vau néixer");
        
            }

            int any = any_neixement + 1;

            if  (edat_actual > 1){

                System.out.println("El " +any+ " teníeu 1 any");
        
            }

            any = any + 1;

            for (int edat = 2; any < any_actual; any++, edat++ ){
                System.out.println("El " +any+ " teníeu " +edat+ " anys"); 
            }

            System.out.println("Adéu " +paraula); 
        }

        else{
            System.out.println("Entrada incorrecta");
        }

    }
}