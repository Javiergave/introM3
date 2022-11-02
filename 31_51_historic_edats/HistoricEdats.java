public class HistoricEdats {
    public static void main(String[] args) {  
        
        System.out.println("El vostre nom?");
        String paraula = Entrada.readLine(); 
        
        System.out.println("La vostra edat?");
        int edat_actual = Integer.parseInt(Entrada.readLine()); 
        
        System.out.println("L'any actual?");
        int any_actual = Integer.parseInt(Entrada.readLine()); 
        
        int any_neixement = any_actual - edat_actual;
        System.out.println("El " +any_neixement+ " vau néixer"); 
        int any = any_neixement + 1;
        System.out.println("El " +any+ " teníeu 1 any");

        any = any + 1;

        for (int edat = 2; any < any_actual && edat > 1; any++, edat++ ){
            System.out.println("El " +any+ " teníeu " +edat+ " anys"); 
        }

        System.out.println("Adéu " +paraula); 

    }
}