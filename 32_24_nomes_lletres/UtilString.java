public class UtilString {


    /*Comprova si es una vocal */
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
    public static String nomesLletres(String paraula) {
        String nomesLletres = "";  
        for (int i= 0; i <= paraula.length()-1; i++){

            if (Character.isLetter(paraula.charAt(i))){
                System.out.print(nomesLletres = nomesLletres+paraula.charAt(i)); 
            }
            
        }
        return nomesLletres;
    }
    public static String lletresSeparades(String paraula) {
        String separades = "";
        for (int i= 0; i <= paraula.length()-1; i++){

            if (Character.isLetter(paraula.charAt(i))){
                System.out.print(separades = separades+paraula.charAt(i)+", "); 
            }
            
        }
        return separades;
    }

}
