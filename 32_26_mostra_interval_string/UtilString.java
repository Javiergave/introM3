/*Diverses utilitats per a analitzar i modificar strings */

public class UtilString {


    /*Aquest programa agafa un text i dos valors enters, i que
    mostra tots els caràcters que hi ha entre el primer i el 
    segon, en l'ordre marcat per l'entrada. */
    public static void intervalString(String paraula,int ini, int fin){

        if (fin<ini){

            if (fin<0) {

                fin = 0;

            }

            for (int n = ini; n >= fin;n--){

                System.out.print(paraula.charAt(n)); 
                
            }  
            System.out.println(); 
        }

        else{

            if (ini<-1) {

                ini = 0;

            }
            if (fin<=0) {

                fin = 0;

            }
            
            for (int n = ini; n <= fin;n++){

                System.out.print(paraula.charAt(n)); 
            
            }
            System.out.println(); 
        }

    }


     /*rep un caràcter i retorna un booleà indicant si el caràcter correspon o no amb una vocal.*/
    public static boolean esVocal(char lletra1) {  
        String vocals = "aàeèéiíïoóòuúüAÀÁEÉÈUÜÚIÏÍOÓÒ";
        for (int i=0; i < vocals.length(); i++) {
            char lletra2 = vocals.charAt(i);
            if (lletra1 == lletra2) {
                return true;
            }
            
        }
        return false;
    }
    /*Guarda una string de només les lletres de la String donada */
    public static String nomesLletres(String paraula) {
        String nomesLletres = "";  
        for (int i= 0; i <= paraula.length()-1; i++){

            if (Character.isLetter(paraula.charAt(i))){
               nomesLletres = nomesLletres+paraula.charAt(i); 
            }
            
        }
        return nomesLletres;
    }
    /*Separa les lletres d'una string */
    public static String lletresSeparades(String paraula) {
        String separades = "";
        for (int i= 0; i <= paraula.length()-1; i++){
            if (i==paraula.length()-1){
                separades = separades+paraula.charAt(i);
            }
            else{
                separades = separades+paraula.charAt(i)+", "; 
            }
        }
        
        return separades;
    }

}
