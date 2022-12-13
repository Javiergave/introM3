
/*vagi demanant texts fins rebre la cadena buida.Per 
cada text no buit que rebi, indicarà si correspon o no a 
un nombre enter escrit amb dígits. */

public class EsEnter {
    public static void main(String[] args) {  

        System.out.println("Introdueix texts (enter sol per finalitzar)"); 
        String paraula = "text";
        boolean esEnter = true;
        boolean estricte = false;
        while (paraula.isEmpty()==false){

            paraula = Entrada.readLine();
            paraula = paraula.strip();
            esEnter = true;
            

            if(paraula.isEmpty()==false){
                
                esEnter = UtilString.esEnter(paraula);

                if (esEnter){
                    System.out.println("És enter"); 
                }
                else{
                    System.out.println("No és enter"); 
                } 
            }
            else {
                break;
            }
        }
        System.out.println("Adéu");
    }

}
