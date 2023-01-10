/*Aquest programa mostra el resultat de sumar els enters que rep per comandes.*/

public class SumaEnters {

    public static void main(String[] args) {

        if(args.length==0){
            System.out.println("Cap argument"); 
        }
        else{

            int resultat=0;

            int quantitatEnters = UtilString.quantsEnters(args);

            int[] numeros;

            numeros = new int[quantitatEnters];

            numeros = UtilString.filtraEnters(args);

            resultat = UtilString.sumaEnters(numeros);

            System.out.println(resultat); 
        }
        
    }
}