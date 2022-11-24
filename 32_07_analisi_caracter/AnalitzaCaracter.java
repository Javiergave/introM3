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
        System.out.println("Posició?"); 
        int valor = Integer.parseInt(Entrada.readLine());

        char seleccionat = 'A';

        if (Math.abs(valor)<paraula.length()){

            analitzaCaracter(seleccionat,paraula,valor);
            
        }
        else{

            System.out.println("Fora de rang"); 

        }

    }
    public static void analitzaCaracter(char seleccionat,String paraula,int valor) {  
        if (valor<0){

            seleccionat = paraula.charAt(paraula.length() - Math.abs(valor));

        }
        else {

            seleccionat = paraula.charAt(valor);

        }

        if (Character.isLetter(seleccionat)){

            System.out.println("'"+seleccionat+"' és una lletra");

        }
        else if (Character.isDigit(seleccionat)){

            System.out.println("'"+seleccionat+"' és un nombre"); 

        }
        else{

            System.out.println("'"+seleccionat+"' és una altra cosa"); 

        }
    }
}
