/*Aquest programa mostra una string que rebi de manera recursiva de la seguent manera: 
Primer es mostra la cadena
Després es mostra les subcadenes corresponents a la primera meitat de la cadena
Finalment es mostra les subcadenes corresponents a la resta de la cadena
*/
public class Subcadenes {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        String senseEspais = senseEspais(text);
        
        mostraCadena(senseEspais);
    }

    public static String senseEspais(String text){
        
        if (text.length() == 0) {
            return "";            
        }

        if (Character.isLetter(text.charAt(0)) == false) {
            return senseEspais(text.substring(1));
        }
        return text.charAt(0) + senseEspais(text.substring(1));
        
    }
    
       // extrae los numeros y los suma entre ellos
    public static void mostraCadena(String text) {
        // cas base
        if (text.length()<=1){
            System.out.println("   "+text.length()+": "+text);
            return;
        }
    
        // tracta pas actual
        String meitat = "";
        String meitatFinal = "";
        if (text.length()==2){
            meitat = ""+text.charAt(0);
            meitatFinal = ""+text.charAt(1);
        }else {
            meitat =  text.substring(0,(text.length())/2);
            meitatFinal = text.substring(((text.length())/2));
        }

        
        

        // tracta pas recursiu
        mostraCadena(meitatFinal);
        mostraCadena(meitat);  
         
        
        // composa resultat
        if (text.length()<10){
            System.out.println("   "+text.length()+": "+text); 
        }
        else{
            System.out.println("  "+text.length()+": "+text); 
        }
        return;
    }
}
