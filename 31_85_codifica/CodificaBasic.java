/*Aquest programa demana un text i el mostra codificat segons les següents instruccions: 
    només codificarem les lletres entre la a i la z minúscules de l'alfabet llatí. La resta d'elements que apareguin al text, es mantindran iguals.
    la lletra z serà substituïda per la a
*/
public class CodificaBasic {
    public static void main(String[] args) {  

        System.out.println("Text?"); 
        String paraula = Entrada.readLine(); 
        String codificat = "";
        for (int i = 0; i<=paraula.length()-1; i++){
            char lletra = paraula.charAt(i);
            if ((lletra>96)&&(lletra<=121)){
                lletra+=1;
                codificat = codificat + (lletra);
            }
            else if (lletra == 'z'){
                codificat = codificat + 'a';
            }
            else{
                codificat = codificat + lletra;
            }
            
        }

        System.out.println(codificat); 

    }    
}
