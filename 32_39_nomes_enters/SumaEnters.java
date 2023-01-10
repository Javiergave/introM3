/*Aquest programa mostra el resultat de sumar els enters que rep per comandes.*/

public class SumaEnters {

    public static void main(String[] args) {

        int resultat=0;

        int[] numeros;

        numeros = new int[UtilString.quantsEnters(args)];

        numeros = UtilString.filtraEnters(args);

        resultat = UtilString.sumaEnters(numeros);

        System.out.println(resultat); 
    }
        
}
