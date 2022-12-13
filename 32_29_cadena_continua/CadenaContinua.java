/*  demani un text i un nombre enter, i mostri tants 
caràcters del text com indiqui el nombre enters, començant 
pel primer. En cas que en faltin, el programa tornarà a 
mostrar el text a partir del primer caràcter fins que hagi 
aconseguit tots els caràcters demanats.*/

public class CadenaContinua {
    public static void main(String[] args) {  

        System.out.println("Text?"); 
        String paraula = Entrada.readLine();

        if (paraula.isEmpty()==false){

            System.out.println("Nombre?"); 
            int nombre = Integer.parseInt(Entrada.readLine());

            System.out.println(UtilString.cadenaContinua(paraula,nombre)); 

        }
        else{
        System.out.println("error"); 
        }

    }
}
