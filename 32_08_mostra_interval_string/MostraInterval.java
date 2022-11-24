/*Aquest programa demana un text i dos valors enters, i que
mostra tots els caràcters que hi ha entre el primer i el 
segon, en l'ordre marcat per l'entrada. */

public class MostraInterval {
    public static void main(String[] args) { 
        
        System.out.println("text?"); 
        String text = Entrada.readLine(); 

        System.out.println("inicici?"); 
        int inici = Integer.parseInt(Entrada.readLine()); 

        System.out.println("fial?"); 
        int fi = Integer.parseInt(Entrada.readLine()); 

        mostraInterval(text,inici,fi);

    }
    public static void mostraInterval(String text, int inici, int fi){

        if (fi>text.length()-1){

            fi = text.length()-1;

        }

        if (inici>text.length()-1){

            inici = text.length()-1;

        }


        if (fi<inici){

            if (fi<0) {

                fi = 0;

            }

            for (int n = inici; n >= fi;n--){

                System.out.println(text.charAt(n)); 
                
            }  
        }

        else{

            if (inici<-1) {

                inici = 0;

            }
            if (fi<=0) {

                fi = 0;

            }
            
            for (int n = inici; n <= fi;n++){

                System.out.println(text.charAt(n)); 
            
            }
        }

    }
}
