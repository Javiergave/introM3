//Aquest programa nomes repeteix les paraules que comencin en vocal minuscula i s'atura quan l'input sigui buit
public class LloroVocalIniciFi { 
    public static void main(String[] args) {  

        System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
        String paraula = Entrada.readLine();
        boolean esVocal=false;
        boolean respostaBool = false;
        
        while (((paraula.isBlank()))==false) {  
                
            System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
            paraula = Entrada.readLine();
            paraula = paraula.trim();
            if (paraula.isEmpty()){
                System.out.println("El lloro demana confirmació per finalitzar");
                String resposta = Entrada.readLine();  
                respostaBool = UtilitatsConfirmacio.respostaABoolean(resposta);
                if (respostaBool){
                    break;
                }
            }
            esVocal = ((UtilString.esVocal(paraula.charAt(0)))&&(UtilString.esVocal(paraula.charAt(paraula.length()-1))));
            if (esVocal){
                System.out.println("El lloro diu: "+paraula);
            } 
        }

        System.out.println("Adéu");
    }
}