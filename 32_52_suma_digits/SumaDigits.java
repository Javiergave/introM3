/* Aquest programa demana un text i mostra la suma dels digits que conté */
public class SumaDigits {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        int nombres = sumaDigits(text);
        System.out.println(nombres);
    }

       // extrae los numeros y los suma entre ellos
    public static int sumaDigits(String text) {
        // cas base
        if (text.isEmpty()){
            return 0;
        }

        // tracta pas actual
        char numero = text.charAt(0);
        int total = 0;
        if (Character.isDigit(text.charAt(0))){
            int nombre = Integer.parseInt(String.valueOf(numero));

            total = total + nombre;
        }

        // tracta pas recursiu
        String resta = text.substring(1);
        total = total + sumaDigits(resta);

        // composa resultat
        return total;
    }
}
   
   