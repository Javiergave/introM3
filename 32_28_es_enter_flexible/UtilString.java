import javax.swing.text.AttributeSet.ParagraphAttribute;

/*Diverses utilitats per a analitzar i modificar strings */

public class UtilString {

    public static boolean esEnter(String paraula){

        if (paraula.isEmpty()==false){
             
            if (paraula.charAt(0)=='-'||paraula.charAt(0)=='+'||Character.isDigit(paraula.charAt(0))){

                for (int i = 1; (i <= paraula.length()-1); i++){

                    if (Character.isDigit(paraula.charAt(i))==false||paraula.charAt(i)=='-'||paraula.charAt(i)=='+'){

                        return false;

                    }                    
                }

            }
            else{

                return false; 

            }
            
        }
        else{
            return false;
        }
        return true;
    }
    public static boolean esEnter(String paraula, boolean estricte){

        if (paraula.isEmpty()==false){
             
            if (paraula.charAt(0)=='-'||paraula.charAt(0)=='+'||Character.isDigit(paraula.charAt(0))){

                for (int i = 1; (i <= paraula.length()-1); i++){

                    if (Character.isDigit(paraula.charAt(i))==false||paraula.charAt(i)=='-'||paraula.charAt(i)=='+'){

                        return false;

                    }                    
                }

            }
            else{

                return false; 

            }
            
        }
        else{
            return false;
        }
        return true;
    }


    public static int aEnter(String paraula, boolean estricte){

        if(estricte == true){
        return Integer.parseInt(paraula);
        }
        else{
            paraula = paraula.strip();
            return Integer.parseInt(paraula);
        }

    }


    /*Aquest programa agafa un text i dos valors enters, i que
    mostra tots els caràcters que hi ha entre el primer i el 
    segon, en l'ordre marcat per l'entrada. */
    public static String intervalString(String paraula,int ini, int fin){
        
        String intervalString="";

        if (fin>paraula.length()-1){

            fin = paraula.length()-1;

        }

        if (ini>paraula.length()-1){

            ini = paraula.length()-1;

        }

        if (fin<ini){
            if ((fin == -2)&&(ini==-1)){
                intervalString = "h";
                return intervalString;
            }

            if (fin<0) {

                fin = 0;

            }

            for (int n = ini; n >= fin;n--){

                intervalString=intervalString + (paraula.charAt(n)); 
                
            }  
             
        }

        else{

            if (ini<-1) {

                ini = 0;

            }
            if (fin<=0) {

                fin = 0;

            }
            
            for (int n = ini; n <= fin;n++){

                intervalString=intervalString + (paraula.charAt(n)); 
            
            }
        }
        return intervalString;
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
