/*Aquest programa demana un text i indica si el text és o no capicua. */
public class Capicua {
    public static void main(String[] args) {  

        System.out.println("Text?");
        String paraula = Entrada.readLine(); 

        boolean esCapicua = true;
        if (paraula.isEmpty()){
            esCapicua = false;
        }

        for (int i = 0; (i<=paraula.length()-1)&&(esCapicua); i++){
            for (int j = paraula.length()-i-1; j>=0; j--){

                if (paraula.charAt(j)!=paraula.charAt(i)){

                    esCapicua=false;

                }

                break;

            }
             
        }
        
        if (esCapicua){
            System.out.println("És capicua"); 
        }
        else{
            System.out.println("No és capicua"); 
        }
    }
}
