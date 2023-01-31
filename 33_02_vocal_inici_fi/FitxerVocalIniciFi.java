//Aquest programa repeteix les paraules del fitxer frases.txt que comencin o acabin en vocal minuscula i s'atura quan l'input sigui buit
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FitxerVocalIniciFi{ 
    public static void main(String[] args)  throws IOException {  

        String cami = "frases.txt";

        FileReader fileReader = new FileReader(cami);

        BufferedReader input = new BufferedReader(fileReader);      // obrir

        while (true) {

            String linia = input.readLine();                        // llegir

            if (null == linia) break;

            String vocals = "aeiouàéèíóòúù";
            for (int i = 0; i<= vocals.length()-1; i++){
                if (linia.charAt(0)==vocals.charAt(i)||linia.charAt(linia.length()-1)==vocals.charAt(i)){
                    System.out.println(linia);
                    break;  
                }
            }
            
        }

        input.close();             
    }
}