/*Aquest programa mostra tres enters separats per comes tenint en 
comptes que els tres valors es troben emmagatzemats en un array 
d'enters. */

public class Arguments {

    public static void main(String[] args) {

        if(args.length==0){
            System.out.println("Cap argument"); 
        }
        else{
            for (int i=0; i<args.length; i++){
                if (UtilString.esEnter(args[i])){
                    System.out.println("["+i+"]: és enter"); 
                }
                else{
                    System.out.println("["+i+"]: no és enter"); 
                }
            }
        }
        
    }
}