/*Aquest programa mostra el resultat de sumar els enters que rep per comandes.*/

public class SumaEnters {

    public static void main(String[] args) {

        int resultat=0;

        int[] numeros;

        numeros = new int[quantsEnters(args)];

        numeros = filtraEnters(args);

        resultat = sumaEnters(numeros);

        System.out.println(resultat); 
    }
    /*Aquest programa crea un valor amb la quantitar d'enters que hi ha */
    public static int quantsEnters(String[] valors) {
        int quantsEnters = 0;
    
        for (int i = 0;i<valors.length;i++){
            if (UtilString.esEnter(valors[i])){
                quantsEnters++;
            }
        }
        return quantsEnters;
    } 
    
    /*Aquest programa filtra els enters que hi ha a l'array rebut */
    public static int[] filtraEnters(String[] valors) { 
        int quantsEnters = quantsEnters(valors);

        int[] numeros;
    
        numeros = new int[quantsEnters];
    
        for (int i=0; i<numeros.length;i++){
            for (int j = 0; j<valors.length;j++){
                if (UtilString.esEnter(valors[j])){
                    numeros[i] = Integer.parseInt(valors[j]);
                    valors[j] = "a";
                    break;
                }
                
            }
        }
        return numeros;
    }
    
    /*Aquest programa suma un array d'enters */
    public static int sumaEnters(int[] valors) {
        int resultat = 0;
        for (int i = 0; i<valors.length;i++){
            resultat = resultat + valors[i];
        }
        return resultat;
    }
}
