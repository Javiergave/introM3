    //Aquest programa demana text i indica si la segona lletra és igual a la penúltima i s'atura quan l'input sigui buit

public class SegonaIgualPenultima {
    public static void main(String[] args) {  

        System.out.println("Ves introduïnt texts (finalitza amb enter sol)");
        String paraula = Entrada.readLine();
        
        boolean segonaIgualPenultima = true;
        

        while (!(paraula.isBlank())) {
                
            if (paraula.length()>3){

                paraula = paraula.trim();
    
                segonaIgualPenultima = (paraula.charAt(paraula.length()-2) == paraula.charAt(1));
            
            }

            if (segonaIgualPenultima){

                System.out.println("Segona igual a penúltima");

            }   
            else {

                System.out.println("Segona diferent de penúltima"); 

            }
                
            System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
            paraula = Entrada.readLine();
            paraula = paraula.trim();
            
        }

        System.out.println("Adéu");
    }
}
    

