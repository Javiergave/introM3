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
}
