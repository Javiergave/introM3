/*Aquest programa demana un text i el mostra codificat segons les següents instruccions: 
    només codificarem les lletres entre la a i la z minúscules de l'alfabet llatí. La resta d'elements que apareguin al text, es mantindran iguals.
    la lletra z serà substituïda per la a
*/
public class CodificaBasic {
    public static void main(String[] args) {  

        System.out.println("Text?"); 
        String paraula = Entrada.readLine(); 
        System.out.println("Quants?"); 
        int valor = Integer.parseInt(Entrada.readLine()); 
        if (valor<0){
            System.out.println("No s'accepten números negatius"); 
        }
        else{
            codifica(paraula,valor);
        } 

    }    
    public static void codifica(String paraula, int valor) {  
        String codificat = "";
        for (int i = 0; i<=paraula.length()-1; i++){
            char lletra = paraula.charAt(i);
            if ((lletra>96)&&(lletra<=121)){
                lletra+=valor;
                codificat = codificat + (lletra);
            }
            else if (lletra=='z'){
                if (valor>=1){
                    lletra='`';
                }
                else{
                    lletra = 'a';
                }

                lletra += valor;
                codificat = codificat + lletra;
            }
            else{
                codificat = codificat + lletra;
            }
            
        }

        System.out.println(codificat);

    }
}
