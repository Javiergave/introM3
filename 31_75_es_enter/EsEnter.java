import javax.management.monitor.StringMonitorMBean;

/*vagi demanant texts fins rebre la cadena buida.Per 
cada text no buit que rebi, indicarà si correspon o no a 
un nombre enter escrit amb dígits. */

public class EsEnter {
    public static void main(String[] args) {  

        System.out.println("Introdueix texts (enter sol per finalitzar)"); 
        String paraula = "text";
        boolean esNombre = true;

        while (paraula.isEmpty()==false){

            paraula = Entrada.readLine();
            paraula = paraula.strip();

            if (paraula.isEmpty()){
             
                if (paraula.charAt(0)=='-'||paraula.charAt(0)=='+'||Character.isDigit(paraula.charAt(0))){

                    for (int i = 1; i <= paraula.length()-1; i++){

                        if (Character.isDigit(paraula.charAt(i))==false){

                            esNombre=false;

                        }                        
                    }

                }
                else{
                    esNombre = false;
                }

                

                if (esNombre = true){
                    System.out.println("És enter"); 
                }
                else{
                    System.out.println("No és enter"); 
                }

                

            }

            System.out.println("Adéu"); 

        }
    }

}
