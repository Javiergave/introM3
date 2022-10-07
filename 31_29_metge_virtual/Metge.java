//Aquest progrma és un metge virtual “especialista” en refredats.
public class Metge {
    public static void main(String[] args) {
        System.out.println("Quants anys tens?");
        int anys = Integer.parseInt(args[0]);
        System.out.println("Ara respon les preguntes amb si o no");
        System.out.println("Tens esternuts?");
        String esternuts = Entrada.readLine();
        System.out.println("Tens mal de cap?");
        String malDeCap = Entrada.readLine();
        System.out.println("Tens tos?");
        String tos = Entrada.readLine();
        System.out.println("Tens problemes d'estómac?");
        String problemesEstomac = Entrada.readLine();
        if (tos.equals("si"){
            if ((anys<12)&&(tos.equals("si"))) {
            System.out.println("Pre caramels de mel");
            } else {
            System.out.println("Pre caramels d'eucaliptus");
            }
        else { System.out.println("Vine a la meva consulta i t'examinaré");
        }
}
}
