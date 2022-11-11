import javax.management.monitor.StringMonitorMBean;

/*vagi demanant texts fins rebre la cadena buida.Per 
cada text no buit que rebi, indicarà si correspon o no a 
un nombre enter escrit amb dígits. */

public class EsEnter {
    public static void main(String[] args) {  

        System.out.println("Introdueix texts (enter sol per finalitzar)"); 
        String paraula = Entrada.readLine();
        boolean esNombre = true;

        while (paraula.isEmpty()==false){

            paraula = paraula.strip();

            for (int i = 0; i == paraula.length(); i++){

                if (paraula.charAt(i)=='-'||paraula.charAt(i)=='+'){
                    i = i+1;
                }

                if (Character.isDigit(paraula.charAt(i))==false){

                esNombre = false;

                }

            }

            if (esNombre){
                System.out.println("És enter"); 
            }
            else{
                System.out.println("No és enter"); 
            }

            paraula = Entrada.readLine();

        }

        System.out.println("Adéu"); 

    }
}
