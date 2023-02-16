//Un rellotge que es pot incrementar i decrementar la hora
/**

 * Compara dues hores i retorna l'operador corresponent

 * Per exemple, si hora1 és menor que hora2, l'operador serà "<". Els

 * altres dos valors possibles són ">" i "=="

 * @param hora1: primera hora a comparar

 * @param hora2: segona hora a comparar

 * @return operador resultant

 */
public class Hora {
    private int hores=0;
    private int minuts=0;
    private int segons=0;
    public Hora(int hora,int minut,int segon){
        
    }
    public void incrementa(){

    }
    public void incrementa(int increment){

    }
    public void decrementa(){

    }
    public void decrementa(int decrementa){

    }
    public int compareTo(int Hora){

    }
    public String toString(){

    }
    private static String composaOperadorComparacio(Hora hora1, Hora hora2) {

        int comparacio = hora1.compareTo(hora2);
    
        if (comparacio < 0) {
    
            return "<";
    
        } else if (comparacio > 0) {
    
            return ">";
    
        } else {
    
            return "==";
    
        }
    
    }
    
    
    public static void main(String[] args) {
    
        Hora hora1 = new Hora();
    
        Hora hora2 = new Hora(0, 0, 2);
    
        System.out.printf("Inicialment hora1: %s %s hora2: %s%n",
    
                hora1,
    
                composaOperadorComparacio(hora1, hora2),
    
                hora2);
    
        System.out.println("Incrementem 1 segon a la primera i decrementem 1 segon a la segona");
    
        hora1.incrementa();
    
        hora2.decrementa();
    
        System.out.printf("Finalment hora1: %s %s hora2: %s%n",
    
                hora1,
    
                composaOperadorComparacio(hora1, hora2),
    
                hora2);
    }
}
