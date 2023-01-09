/*Aquest programa mostra tres enters separats per comes tenint en 
comptes que els tres valors es troben emmagatzemats en un array 
d'enters. */

public class EntersEntreComes {

    public static void main(String[] args) {

        System.out.println("Quants?");
        String paraula = Entrada.readLine();

        if(UtilString.esEnter(paraula)==false){ 
            while (UtilString.esEnter(paraula)==false){
                System.out.println("Per favor, un valor enter"); 
                paraula = Entrada.readLine(); 
            }
        }

        int valor = Integer.parseInt(paraula); 
        if (valor<=-1){
            System.out.println("Res a fer");
        }
        else{
            char separador = ',';
            System.out.println("Separador?");
            String text = Entrada.readLine();

            if(text.isEmpty()==false){
                separador = text.charAt(0);
            }
            

            int[] numeros;

            numeros = new int[valor];

            for (int i = 1; i<=valor; i++){
                System.out.println("Valor "+i+"?"); 

                String nombre = Entrada.readLine(); 
            
                if(UtilString.esEnter(nombre)){
                    numeros [i-1] = Integer.parseInt(nombre);
                }
                else{
                    while(UtilString.esEnter(nombre)==false){
                        System.out.println("Per favor, un valor enter"); 
                        nombre = Entrada.readLine(); 
                    }
                    numeros [i-1] = Integer.parseInt(nombre);
                }
            }

            String textFinal = UtilString.entreComes(numeros, separador);

            System.out.println(textFinal);
        }
        
    }
}