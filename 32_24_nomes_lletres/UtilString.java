/*Diverses utilitats per a analitzar i modificar strings */

public class UtilString {


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
