// Aquest programa rep el color del semafor i et diu que fer 
public class Semafor {
    public static void main(String[] args) {
        System.out.println("Ets major d'edat?"); 
        String resposta = Entrada.readLine(); 

        boolean majorEdat = UtilitatsConfirmacio.respostaABoolean(resposta);

        if (majorEdat ==true){
            System.out.println("Color?");
            String color = Entrada.readLine();
            if (color.equals("groc")) {
            System.out.println("corre!");
            } else if (color.equals("verd")) {
                System.out.println("passa");
            } else if (color.equals("vermell")) {
                System.out.println("espera");
            } else {
            System.out.println("ves a l'oculista");
            }
        }
        else{
            System.out.println("No pots fer servir aquest programa sense supervisió"); 
        }
    }
}
