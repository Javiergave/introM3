/*Aquest programa demana un text i els torna a mostrar però invertint l'ordre dels caràcters 
que el composen. Els caracters resultants apareixeran separats per comes. */
public class TextReves {
    public static void main(String[] args) {  

        System.out.println("Text?");
        String paraula = Entrada.readLine(); 

        for (int i = paraula.length()-1; i >=0; i--){

            if (i==0){
                System.out.println(paraula.charAt(i)); 
            }
            else{
                System.out.print(+paraula.charAt(i)+", "); 
            }
        }
    }
}
