/*Aquest programa demana un text i compta quantes vocals conté. */
public class InformeText {
    public static void main(String[] args) {  

        System.out.println("Text?"); 
        String paraula = Entrada.readLine();
        int vocalesMin = 0;
        int vocalesMaj = 0;
        int totalVocals = 0;
        int totalLletres = 0;
        int lletresMin = 0;
        int lletresMaj = 0;
        int digits = 0;
        int altres = 0;
        int total = paraula.length()-1;

        for (int i= 0; i <= paraula.length()-1; i++){

            char lletra = paraula.charAt(i);

            boolean esVocal = paraula.charAt(i)=='a'||paraula.charAt(i)=='e'||paraula.charAt(i)=='i'||paraula.charAt(i)=='o'||paraula.charAt(i)=='u';
            boolean esVocalMajus = paraula.charAt(i)=='A'||paraula.charAt(i)=='E'||paraula.charAt(i)=='I'||paraula.charAt(i)=='O'||paraula.charAt(i)=='U';
            boolean esVocalAcento = paraula.charAt(i)=='à'||paraula.charAt(i)=='è'||paraula.charAt(i)=='é'||paraula.charAt(i)=='í'||paraula.charAt(i)=='ò'||paraula.charAt(i)=='ó'||paraula.charAt(i)=='ú';
            boolean tieneDieresis = paraula.charAt(i)=='ï'||paraula.charAt(i)=='ü';
            boolean esVocalMajusAcento = paraula.charAt(i)=='À'||paraula.charAt(i)=='È'||paraula.charAt(i)=='É'||paraula.charAt(i)=='Í'||paraula.charAt(i)=='Ó'||paraula.charAt(i)=='Ò'||paraula.charAt(i)=='Ú';
            boolean majusDieresis = paraula.charAt(i)=='Ï'||paraula.charAt(i)=='Ü';
            boolean esMajus = Character.isUpperCase(paraula.charAt(i));
            boolean esMinus = Character.isLowerCase(paraula.charAt(i));
            boolean esDigit = Character.isDigit(paraula.charAt(i));

            if (esVocal||esVocalAcento||tieneDieresis){

                vocalesMin = vocalesMin + 1;
                totalVocals = totalVocals + 1;
                lletresMin = lletresMin + 1;
                totalLletres = totalLletres + 1;

            }else if (esVocalMajus||esVocalMajusAcento||majusDieresis){

                vocalesMaj = vocalesMaj + 1;
                totalVocals = totalVocals + 1;
                lletresMaj = lletresMaj + 1;
                totalLletres = totalLletres + 1;

            }else if (esMajus){

                lletresMaj = lletresMaj + 1;
                totalLletres = totalLletres + 1;

            }else if (esMinus){

                lletresMin = lletresMin + 1;
                totalLletres = totalLletres + 1;

            }else if (esDigit){

                digits = digits + 1;

            }else {

                altres = altres + 1;

            }
            
        }

        System.out.println("Informe"); 
        System.out.println("======="); 
        System.out.println("lletres en majúscules: "+lletresMaj+" ("+100*lletresMaj/total+"%)"); 
        System.out.println("lletres en minúscules: "+lletresMin+" ("+100*lletresMin/total+"%)"); 
        System.out.println("total lletres: "+totalLletres+" ("+100*totalLletres/total+"%)"); 
        System.out.println("vocals en majúscules: "+vocalesMaj+" ("+100*vocalesMaj/total+"%)"); 
        System.out.println("vocals en minúscules: "+vocalesMin+" ("+100*vocalesMin/total+"%)"); 
        System.out.println("total vocals: "+totalVocals+" ("+100*totalVocals/total+"%)"); 
        System.out.println("digits: "+digits+" ("+100*digits/total+"%)"); 
        System.out.println("altres caràcters: "+altres+" ("+100*altres/total+"%)"); 
        System.out.println("total caràcters: "+total); 
    }
}
