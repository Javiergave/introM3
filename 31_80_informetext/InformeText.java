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
        int total = paraula.length();

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
        System.out.printf("lletres en majúscules: %d (%.2f%%)%n",
                  lletresMaj,
                  100.0 * lletresMaj / total);
        System.out.printf("lletres en minúscules: %d (%.2f%%)%n",
                  lletresMin,
                  100.0 * lletresMin / total);        
        System.out.printf("total lletres: %d (%.2f%%)%n",
                  totalLletres,
                  100.0 * totalLletres / total);
        System.out.printf("vocals en majúscules: %d (%.2f%%)%n",
                  vocalesMaj,
                  100.0 * vocalesMaj / total);
        System.out.printf("vocals en minúscules: %d (%.2f%%)%n",
                  vocalesMin,
                  100.0 * vocalesMin / total);
        System.out.printf("total vocals: %d (%.2f%%)%n",
                  totalVocals,
                  100.0 * totalVocals / total);        
        System.out.printf("digits: %d (%.2f%%)%n",
                  digits,
                  100.0 * digits / total);
        System.out.printf("altres caràcters: %d (%.2f%%)%n",
                  altres,
                  100.0 * altres / total);        
        System.out.println("total caràcters: "+total); 
    }
}
