/*Aquest programa permet jugar al penjat */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.lang.model.type.UnionType;
public class Penjat {
    public static void main(String[] args) throws IOException {  

        System.out.println("Comencem a jugar"); 

        String cami = "paraules.txt";

        FileReader fileReader = new FileReader(cami);

        BufferedReader input = new BufferedReader(fileReader);      // obrir

        int linias = 0;

        while (true){

            String linia = input.readLine();

            if (null == linia){

                if(linias<1){

                    System.out.println("No tinc paraues per jugar"); 
                    break;

                }
                else{

                    linias++;
                    break;

                }
            }
        }

        String[] paraules = new String[linias];

        linias = 0;

        for (int i = 0; i<=paraules.length-1; i++){

            String linia = input.readLine();                        // llegir
            paraules[i] = linia;

        }

        boolean victoria = false;
        char[] utilitzades = new char[25];
        

        for(int fallos=0,int paraula = 0;fallos<10, victoria==false, paraula<=paraules.length-1;) {

            boolean haFallat = false;
            if (fallos>0){
                mostraAhorcado(fallos);
            }

            System.out.println("Paraula: "+mostraParaula(paraules[paraula],utilitzades)); 
            System.out.println("Utilitzades: "+utilitzadesValides(utilitzades)); 
            System.out.println("Intents disponibles: "+(10-fallos)); 
            System.out.println("Introdueix una lletra");

            String usuari = entrada.readLine();
            usuari.trim();
            if (usuari == "prou"){
                System.out.println("Vols finalitzar?");
                usuari = entrada.readLine();
                if (UtilitatsConfirmacio.respostaABoolean(usuari)){
                    System.out.println("Paraules jugades: "+(paraula+1));
                    System.out.println("Paraules encertades: "+paraula);
                    System.out.println("paraules fallades: "+);   
                    System.out.println("Paraules cancel·lades: 1"); 
                    return;
                }
            }
            if (usuari=="glups"){
                paraula++;
                continue;
            }

        }
        
        input.close();      

    }
    public static void mostraParaula(String paraula,char[] utilitzades){
        for (int i = 0;i<=paraula.length()-1;i++){
            for (int j= 0; utilitzades.length;j++){
                if (paraula.charAt(i)==utilitzades[j]){
                    System.out.print(utilitzades[j]); 
                }
                else{
                    System.out.print("*");
                }
            }
        }
    }
    public static char[] utilitzadesValides(char[] utilitzades){
        int quantesValides = 0;
        for (int i = 0; i<=utilitzades.length-1;i++){  

            if(utilitzades[i]!='\u0000'){
                quantesValides++;
            }

        }
        char[] utilitzadesValides = new char[quantesValides];

        for (int i = 0; i<=utilitzadesValides.length-1;i++){  
            for (int j = 0; j<=utilitzades.length-1;j++){
                if(utilitzades[j]!='\u0000'){
                    utilitzadesValides[i] = utilitzades[j];
                    break;
                }
            }
        }
        return utilitzadesValides;
    }
    public static void mostraAhorcado(int fallos) {  
        switch(fallos){
            case 1:
                String cami1 = "figura0.txt";

                FileReader fileReader = new FileReader(cami1);

                BufferedReader input = new BufferedReader(fileReader);

                while (true) {

                    String linia = input.readLine();                        // llegir
        
                    if (null == linia) break;
        
                    else{
                        System.out.println(linia); 
                    }
                }
                input.close();
            break;
            case 2:
                String cami1 = "figura0.txt";

                FileReader fileReader = new FileReader(cami1);

                BufferedReader input = new BufferedReader(fileReader);

                while (true) {

                    String linia = input.readLine();                        // llegir
        
                    if (null == linia) break;
        
                    else{
                        System.out.println(linia); 
                    }
                }
                input.close();
            break;
            case 3:
                String cami1 = "figura0.txt";

                FileReader fileReader = new FileReader(cami1);

                BufferedReader input = new BufferedReader(fileReader);

                while (true) {

                    String linia = input.readLine();                        // llegir
        
                    if (null == linia) break;
        
                    else{
                        System.out.println(linia); 
                    }
                }
                input.close();
            break;
            case 4:
                String cami1 = "figura0.txt";

                FileReader fileReader = new FileReader(cami1);

                BufferedReader input = new BufferedReader(fileReader);

                while (true) {

                    String linia = input.readLine();                        // llegir
        
                    if (null == linia) break;
        
                    else{
                        System.out.println(linia); 
                    }
                }
                input.close();
            break;
            case 5:
                String cami1 = "figura0.txt";

                FileReader fileReader = new FileReader(cami1);

                BufferedReader input = new BufferedReader(fileReader);

                while (true) {

                    String linia = input.readLine();                        // llegir
        
                    if (null == linia) break;
        
                    else{
                        System.out.println(linia); 
                    }
                }
                input.close();
            break;
            case 6:
                String cami1 = "figura0.txt";

                FileReader fileReader = new FileReader(cami1);

                BufferedReader input = new BufferedReader(fileReader);

                while (true) {

                    String linia = input.readLine();                        // llegir
        
                    if (null == linia) break;
        
                    else{
                        System.out.println(linia); 
                    }
                }
                input.close();
            break;
            case 7:
                String cami1 = "figura0.txt";

                FileReader fileReader = new FileReader(cami1);

                BufferedReader input = new BufferedReader(fileReader);

                while (true) {

                    String linia = input.readLine();                        // llegir
        
                    if (null == linia) break;
        
                    else{
                        System.out.println(linia); 
                    }
                }
                input.close();
            break;
            case 8:
                String cami1 = "figura0.txt";

                FileReader fileReader = new FileReader(cami1);

                BufferedReader input = new BufferedReader(fileReader);

                while (true) {

                    String linia = input.readLine();                        // llegir
        
                    if (null == linia) break;
        
                    else{
                        System.out.println(linia); 
                    }
                }
                input.close();
            break;
            case 9:
                String cami1 = "figura0.txt";

                FileReader fileReader = new FileReader(cami1);

                BufferedReader input = new BufferedReader(fileReader);

                while (true) {

                    String linia = input.readLine();                        // llegir
        
                    if (null == linia) break;
        
                    else{
                        System.out.println(linia); 
                    }
                }
                input.close();
            break;            

        }
    }
}
