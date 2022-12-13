/*  demani un text i un nombre enter, i mostri tants 
caràcters del text com indiqui el nombre enters, començant 
pel primer. En cas que en faltin, el programa tornarà a 
mostrar el text a partir del primer caràcter fins que hagi 
aconseguit tots els caràcters demanats.*/

public class CadenaContinua {
    public static void main(String[] args) {  

        System.out.println("Text?"); 
        String paraula1 = Entrada.readLine();

        if (paraula1.isEmpty()==false){

            System.out.println("Nombre?"); 
            String paraula = Entrada.readLine(); 
            if(UtilString.esEnter(paraula)){
                int nombre = Integer.parseInt(paraula);
                System.out.println(UtilString.cadenaContinua(paraula1,nombre)); 
            }



        }
        else{
        System.out.println("error"); 
        }

    }
}
