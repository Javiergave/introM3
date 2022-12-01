//Aquest programa nomes repeteix les paraules que comencin o acabin en vocal minuscula i s'atura quan l'input sigui buit
public class LloroVocalIniciFi { 
    public static void main(String[] args) {  
        
        String paraula = "a";
        boolean esVocal=false;
        while (true) {  
                
            System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
            paraula = Entrada.readLine();
            paraula = paraula.trim();

            if (paraula.isEmpty()){
                System.out.println("El lloro demana confirmació per finalitzar");
                String resposta = Entrada.readLine();  
                boolean respostaExit = UtilitatsConfirmacio.respostaABoolean(resposta);
                if (respostaExit){
                    break;
                }
            }
            else{
                esVocal = ((UtilString.esVocal(paraula.charAt(0)))||(UtilString.esVocal(paraula.charAt(paraula.length()-1))));
                if (esVocal){
                    System.out.println("El lloro diu: "+paraula);
                }
            }
        }

        System.out.println("Adéu");
    }
}