//Aquest programa calcularà la nota mitja dels estudiants que apareixen al fitxer de text notes.csv
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class NotaMitja {
    public static void main(String[] args) throws IOException  {

        String cami = "notes.csv";

        FileReader fileReader = new FileReader(cami);

        BufferedReader input = new BufferedReader(fileReader);      // obrir

        while (true) {
            int a=0;

            String linia = input.readLine();

            if (a!=0&&(linia==null)){
                System.out.println("Cap entrada"); 
                break;
            }
            
            if(linia==null){
                break;
            }   
            if (linia.equals("alumne,uf1,uf2,uf3,uf4,uf5,uf6")) continue;

            String[] elements = linia.split(",");
            int[] enters = new int[elements.length-1];

            for (int i = 1; i<=elements.length-1;i++){
                if (UtilString.esEnter(elements[i])){
                    enters[i-1] = UtilString.aEnter(elements[i],false);
                }
            }

            int total = 0;
            int quants = enters.length;

            for (int i = 0; i<=enters.length-1;i++){
                total =total + enters[i];

            }
            
            float mitja = total / (float) quants;

            System.out.println(elements[0]+" ("+String.format("%.2f", mitja)+")");
            a++;
        }
        input.close();
    }

}