public class EndevinaNombre {
    public static void main(String[] args) {
        
        int nombre = 42;
        
        System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
        System.out.println("Introdueix un valor");
        
        int intent = Integer.parseInt(Entrada.readLine());
       
        
        while ((intent!=nombre)&&(intent.isBlank()==false)){
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
            intent = Integer.parseInt(Entrada.readLine());
        }
        
        if (intent.isBlank()==true){
            System.out.println("Cancel·lat!");
        }
        
        else{
            System.out.println("Has encertat!");
        }
        
        
     }
}
