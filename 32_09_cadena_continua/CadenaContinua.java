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

            if (nombre>0){

                mostraCadenaContinua(paraula, nombre);

            }

        }
        else {
            System.out.println("error");
        }
    }
    public static void mostraCadenaContinua(String paraula,int nombre) {  
        int reps = nombre;
        nombre = 1;

        for (int i = 0; nombre <= reps; i++,nombre++){

            if (i>paraula.length()-1){

                i = 0;

            }
                    
            System.out.print(paraula.charAt(i)); 

        }

        System.out.println();
               
    }
}

