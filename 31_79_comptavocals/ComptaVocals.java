/*Aquest programa demana un text i compta quantes vocals conté. */
public class ComptaVocals {
    public static void main(String[] args) {  

        System.out.println("Text?"); 
        String paraula = Entrada.readLine();
        int vocales = 0;

        for (int i= 0; i <= paraula.length()-1; i++){

            boolean esVocal = paraula.charAt(i)=='a'||paraula.charAt(i)=='e'||paraula.charAt(i)=='i'||paraula.charAt(i)=='o'||paraula.charAt(i)=='u';
            boolean esVocalMajus = paraula.charAt(i)=='A'||paraula.charAt(i)=='E'||paraula.charAt(i)=='I'||paraula.charAt(i)=='O'||paraula.charAt(i)=='U';
            boolean esVocalAcento = paraula.charAt(i)=='à'||paraula.charAt(i)=='è'||paraula.charAt(i)=='é'||paraula.charAt(i)=='í'||paraula.charAt(i)=='ò'||paraula.charAt(i)=='ó'||paraula.charAt(i)=='ú';
            boolean tieneDieresis = paraula.charAt(i)=='ï'||paraula.charAt(i)=='ü';
            boolean esVocalMajusAcento = paraula.charAt(i)=='À'||paraula.charAt(i)=='È'||paraula.charAt(i)=='É'||paraula.charAt(i)=='Í'||paraula.charAt(i)=='Ó'||paraula.charAt(i)=='Ò'||paraula.charAt(i)=='Ú';
            boolean majusDieresis = paraula.charAt(i)=='Ï'||paraula.charAt(i)=='Ü';
            
            if (esVocal||esVocalMajus||esVocalAcento||tieneDieresis||esVocalMajusAcento||majusDieresis){

                vocales = vocales + 1;

            }
            
        }

        System.out.println(vocales); 

    }
}
