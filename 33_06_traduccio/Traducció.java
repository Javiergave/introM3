/*Aquest programa que rep tres arguments per línia de comandes, escriurà en la destinació el contingut de l'origen pel 
que haurà reemplaçat les aparicions de les claus pels corresponents valors. */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Traducció {
    public static void main(String[] args) throws IOException{
        
        String fitxerOrigen = args[0];
        String fitxerTraduccio = args[1];
        String fitxerDestinacio = args[2];
        
        if(args.length!=3){
            System.out.println("ERROR: Cal especificar els fitxers origen, traduccio i destinació"); 
            return;
        }

        tradueix(fitxerOrigen,fitxerTraduccio,fitxerDestinacio);

    }  
    public static void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) { 

        FileReader fileReader = new FileReader(fitxerOrigen);

        BufferedReader input = new BufferedReader(fileReader);

        while(true){
            if (input == null){
                break;
            }
            else{
                String linia = input.readLine();
                tradueixLinia(linia,fitxerTraduccio);
            }
        }

        input.close();

        FileWriter fileWriter = new FileWriter(fitxerDestinacio);

        BufferedWriter output = new BufferedWriter(fileWriter);

        output.close();

    } 
    public static String tradueixLinia(String linia, String fitxerTraduccio) {  

        FileReader fileReader = new FileReader(fitxerTraduccio);

        BufferedReader inputTrad = new BufferedReader(fileReader);



        input.close();


    }
}
