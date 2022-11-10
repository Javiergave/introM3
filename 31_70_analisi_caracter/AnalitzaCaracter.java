/*el programa indicarà:

el caràcter que correspon a la posició demanada

la categoria del caràcter:

    lletra

    nombre

    altre: quan no sigui cap dels anteriors
*/


public class AnalitzaCaracter {
    public static void main(String[] args) {  

        System.out.println("Text?");
        String paraula = Entrada.readLine(); 
        System.out.println("Posició"); 
        int valor = Integer.parseInt(Entrada.readLine());

        char selecionat = 1;

        if (Math.abs(valor)<paraula.length()){

            if (valor<0){

                selecionat = paraula.charAt(paraula.length() - Math.abs(valor));

            }



            if (Character.isLetter(selecionat)){

                System.out.println("'"+selecionat+"' és una lletra");

            }
            else if (Character.isDigit(selecionat)){

                System.out.println("'"+selecionat+"' és un nombre"); 

            }
            else{

                System.out.println("'"+selecionat+"' és una altra cosa"); 

            }
        }
        else{

            System.out.println("Fora de rang"); 

        }

    }
    
}
