/* Aquest programa demana un text i mostra el valors numérics */
public class ExtreuNombres {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nombres = extreuNombres(text);
        System.out.println(nombres);
    }

   // extreu els nombres i els retorna concatenats
    public static String extreuNombres(String text) {
        
        // cas base
        if(text.isEmpty()){
            return text;
        }

        // tracta pas actual
        String nombres = "";
        
        char nombre = text.charAt(0);
        if (Character.isDigit(nombre)){
            nombres = nombres + nombre;
        }
        // tracta pas recursiu
        String resta = text.substring(1);
        nombres = nombres + extreuNombres(resta);
        // composa resultat
        return nombres;
    }
}