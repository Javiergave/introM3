/* programa que mostra la quantitat de vegades que apareixen les vocals */


public class ComptaVocals {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String paraula = Entrada.readLine(); 
        String vocals = "aàeèéiíïoóòuüú";
        char lletra = paraula.charAt(0);
        for (int i = 0; i<=vocals.length()-1;i++){
            lletra = vocals.charAt(i);
            int quantes = quantesOcurrencies(paraula,lletra);
            mostraOcurrencies (lletra,quantes);
        }
    }
    public static void mostraOcurrencies(char lletra, int quantes) {
        System.out.println("Nombre de '" + lletra + "'s: " + quantes);
    }
    public static int quantesOcurrencies(String paraula, char lletra) {
        int comptador = 0;
        for (int i=0; i < paraula.length(); i++) {
            if (paraula.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        return comptador;
    }
}
