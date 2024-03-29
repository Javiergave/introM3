/*

 * programa que simula un lloro que recorda les frases que li han dit

 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Recordat {

    public static final String NOMFITXER = "records.txt";
        
    public static void main(String[] args) throws IOException{
        
        System.out.println("El lloro pregunta paraula:");
        processaEntrada(NOMFITXER);
        
        System.out.println("D'acord"); 
        mostraRecords(NOMFITXER);
        System.out.println("Adéu"); 
    }
    

     /**

     * Demana frases per entrada estàndard i les guarda a un fitxer

     * @param nomFitxer: records.txt

     */

    public static void processaEntrada(final String nomFitxer) throws IOException {
        
        String record = Entrada.readLine().trim();

        FileWriter fileWriter = new FileWriter(NOMFITXER);

        BufferedWriter output = new BufferedWriter(fileWriter);

        if (record.isEmpty()==false){
            while(record.isEmpty()==false){

                output.write(record+"\n");

                System.out.println("El lloro registra: " + record);

                System.out.println("El lloro pregunta paraula:");

                record = Entrada.readLine().trim();

            }
        }
        
        output.close();
    }


    /**

     * Mostra el contingut del fitxer amb nom records

     * @param nomFitxer: records.txt

     */

    public static void mostraRecords(final String nomFitxer) throws IOException {

        FileReader fileReader = new FileReader(NOMFITXER);

        BufferedReader input = new BufferedReader(fileReader);

        int contador = 0;

        while (true){
            String record =input.readLine();
                
            if (null == record){

                break;
    
            }
            else{
    
                System.out.println("El lloro recorda: "+record);
                contador++; 

            }
        }

        input.close();
        if(contador==0){
            System.out.println("El lloro no recorda res");
        }
    }
}
