//Aquest programa mostra el pisos on són el ascensors, hi ha tants ascensors com vulgui l'usuari
public class Ascensor {
    static int pis;
    public static Ascensor[] creaAscensors(int quants) {
                
        Ascensor[] ascensor = new Ascensor[quants];
        for (int i = 0; i<quants;i++){
            ascensor[i] = new Ascensor();
            ascensor[i].pis=i;
            System.out.println(i);
        }
        return ascensor;
    }
    public static void main(String[] args){
        int quants = 0;
        
        if(UtilString.esEnter(args[0])){
            quants = Integer.parseInt(args[0]);
        }
                
        if(quants == 0){
            System.out.println("Cap ascensor"); 
        }
        else{
            Ascensor[] ascensor = creaAscensors(quants);
            
            for (int i = 0; i < ascensor.length; i++) {

                System.out.printf("Ascensor %d al pis %d%n", i, ascensor[i].pis);
            
            }
        }
    }
}
