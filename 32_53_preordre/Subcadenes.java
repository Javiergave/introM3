import java.util.concurrent.Flow.Subscriber;

import javax.swing.event.MouseInputListener;

/*Aquest programa mostra una string que rebi de manera recursiva de la seguent manera: 
Primer es mostra la cadena
Després es mostra les subcadenes corresponents a la primera meitat de la cadena
Finalment es mostra les subcadenes corresponents a la resta de la cadena
*/
public class Subcadenes {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        String senseEspais = "";
        char lletra = 'a';
        for (int i = 0; i<=text.length()-1;i++){
            lletra = text.charAt(i);
            if ((Character.isLetter(lletra)==false)){
                continue; 
            }else{
                senseEspais = senseEspais + text.charAt(i);
            }
            
        }
        mostraCadena(senseEspais);
    }
    
       // extrae los numeros y los suma entre ellos
    public static void mostraCadena(String text) {
        // cas base
        if (text.isEmpty()){ 
            return;
        }
    
        // tracta pas actual
        if (text.length()<10){
            System.out.println("   "+text.length()+": "+text); 
        }
        else{
            System.out.println("  "+text.length()+": "+text); 
        }
        String meitat = "";
        String meitatFinal = "";
        if (text.length()>3){
            meitat =  text.substring(0,(text.length()/2));
            meitatFinal = text.substring((text.length()/2),text.length()-1);
        }
        if (text.length()==2){
            meitat = ""+text.charAt(0);
            meitatFinal = ""+ text.charAt(1);
        }
        
        //System.out.println("les mitats son"+meitat +" i "+meitatfinal); 
        // tracta pas recursiu
        mostraCadena(meitat);     
        mostraCadena(meitatFinal); 
        // composa resultat
        return;
    }
}
