//Aquest programa pensarà un nombre enter entre el 1 i el 100, i reptarà els usuaris a que l'endevini. Per a cancel·lar el programa un enter buit servirá.
// A mes aquest programa comprova si poses valors enters o no
//Per simplicitat, el nombre pensat serà sempre el 42.
public class Endevina {
    public static void main(String[] args) {
        
        int nombre = 42;        
        String palabra = "123";
        boolean nomesInts = true;
        int intent = 3348;
        
        while (!(palabra.equals("42"))&&(!(palabra.isEmpty()))){
            
            System.out.println("Nombre?");
            palabra = Entrada.readLine();
            nomesInts = true;

            for (int i = 0; i <= palabra.length()-1; i++){

                if (palabra.charAt(0)=='-'){
                    i = i + 1;
                }

                if ((Character.isDigit(palabra.charAt(i))==false)){

                    nomesInts = false;

                }
                else{

                    intent = Integer.parseInt(palabra);

                }
            }
            
            if (palabra.isEmpty()){

                break;
            }
            if (nomesInts){
                
                if ((intent>100)||(intent <= 0)){
                    System.out.println("Fora de rang");
                }
                else if (nombre>intent){
                    System.out.println("Massa petit");
                }
                else if (nombre<intent) {
                    System.out.println("Massa gran");
                }
            }
                else{

                    System.out.println("Només nombres"); 

                }
        }
        if (palabra.isEmpty()){
            System.out.println("Cancel·lat!");
        }
        else {
            System.out.println("Encertat!");
        }
     }
}

