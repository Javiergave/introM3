//Aquest programa pensarà un nombre enter entre el 1 i el 100, i reptarà els usuaris a que l'endevini. Per a cancel·lar el programa un enter buit servirá.

//Per simplicitat, el nombre pensat serà sempre el 42.
public class EndevinaNombre {
    public static void main(String[] args) {
        
        int nombre = 42;
        
        System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
        System.out.println("Introdueix un valor");
        
        String palabra = Entrada.readLine();
       
        
        while (!(palabra.equals(42))||(!(palabra.isEmpty()))){
            int intent = Integer.parseInt(palabra);
            if (intent<=0){
                System.out.println("Com a mínim 1");
            }
            else if (nombre>intent){
                System.out.println("És més gran que "+intent);
            }
            if (intent>100){
                System.out.println("Com a màxim 100");
            }
            else if (nombre<intent) {
                System.out.println("És més petit que "+intent);
            }
        
            
            System.out.println("Introdueix un valor");
            palabra = Entrada.readLine();
        }
        if (palabra.isEmpty()){
            System.out.println("Cancel·lat!");
        }
        else {
            System.out.println("Has encertat!");
        }
     }
}

