/* demani un text i mostri només les lletres que conté. Cada lletra apareixerà 
separada per una coma en l'ordre en que apareixia al text original. La resta de 
caràcters no es mostraran. */

public class NomesLletres {
    public static void main(String[] args) {  

        System.out.println("Text?");
        String paraula = Entrada.readLine();

        String nomesLletres = UtilString.nomesLletres(paraula);

        String separades = UtilString.lletresSeparades(nomesLletres);
        
        System.out.println(separades);
    }
    
}
