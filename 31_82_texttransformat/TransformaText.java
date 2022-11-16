/*Aquest programa demana un text i mostra una versió transformada segons les següents regles:

    les vocals (les catalanes) apareixeran en minúscules

    les lletres no vocals apareixeran en majúscules

    els nombres (atenció, no els dígits!) apareixeran entre parèntesis ()

    la resta de caràcters, excepte els blancs, desapareixen a la versió transformada
 */
public class TransformaText {
    public static void main(String[] args) {  
        
        System.out.println("Text?");
        String paraula = Entrada.readLine();
        String vocals = "aeiouàèéíïòóüúAEIOUÀÈÉÍÏÓÒÜÚ";
        boolean esVocal = false;
        for (int i = 0; i <= paraula.length()-1; i++){

            esVocal = false;

            if (Character.isLetter(paraula.charAt(i))){

                for (int j = 0; j<=vocals.length()-1; j++){

                    System.out.println("for"); 

                    if (paraula.charAt(i)==vocals.charAt(j)){
     
                        esVocal = true;

                    }
    
                }
                if (esVocal){

                    System.out.print(Character.toLowerCase(paraula.charAt(i))); 

                }
                else{
                System.out.print(Character.toUpperCase(paraula.charAt(i))); 
                }

            }
            else if (Character.isDigit(paraula.charAt(i))){

                String digits = "";

                for (int k = i; (k<=paraula.length()-1)||(Character.isDigit(paraula.charAt(k))==false);k++){

                    digits = digits + paraula.charAt(k);

                    i = k;

                }

                System.out.print("("+digits+")"); 

            }
            else if (Character.isWhitespace(paraula.charAt(i))){

                System.out.print(paraula.charAt(i)); 

            }

        }


    }  
}
