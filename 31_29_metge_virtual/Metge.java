//Aquest progrma és un metge virtual “especialista” en refredats.
public class Metge {
    public static void main(String[] args) {
        System.out.println("Quants anys tens?");
        int anys = Integer.parseInt(Entrada.readLine());
        System.out.println("Ara respon les preguntes amb si o no");
        System.out.println("Tens esternuts?");
        String esternuts = Entrada.readLine();
        System.out.println("Tens mal de cap?");
        String malDeCap = Entrada.readLine();
        System.out.println("Tens tos?");
        String tos = Entrada.readLine();
        System.out.println("Tens problemes d'estómac?");
        String problemesEstomac = Entrada.readLine();
        
        if ((esternuts.equals("si"))&&((malDeCap.equals("si")))){
            if (problemesEstomac.equals("si")){
            System.out.println("Pre paracetamol");
            } else {
            System.out.println("Pre àcid acetil salicílic (AAS)");
            }   
        }
        
        
        if (tos.equals("si")) {
            if (anys<12) {
            System.out.println("Pre caramels de mel");
            } else {
            System.out.println("Pre caramels d'eucaliptus");
            }
        }
        if (!(esternuts.equals(malDeCap))){
        System.out.println("Vine a la meva consulta i t'examinaré");
        }
        
        if ((tos.equals("no"))&&(esternuts.equals("no"))&&(malDeCap.equals("no"))) { System.out.println("Vine a la meva consulta i t'examinaré");
        }
        if (anys==96) {
        System.out.println("Tienes la misma edad que la reina de Inglaterra! Una pena que ella este... bueno ya sabes");
        }
        if (anys>96) {
        System.out.println("Has vivido más que la reina de Inglaterra! Larga vida a ti");
        }
}
}
