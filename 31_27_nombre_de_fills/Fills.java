//Aquest programa pregunta quants fills tends i respon segon el nombre
public class Fills {
    public static void main(String[] args) {
        System.out.println("Quants fills tens?");
        int fills = Integer.parseInt(Entrada.readLine());
            if (fills==0){
            System.out.println("Tot el que t'has estalviat en bolquers!");
            } else if (fills==1){
            System.out.println("Compte de no mimar-lo massa!");
            }
            else if ((fills>=2)&&(fills<5)){
            System.out.println("No t'avorreixes a casa, eh?");
            }
            else if (fills>4){
            System.out.println("Tu sí fas país!");
            }
         if (fills<0) {
        System.out.println("No pots tenir menys de 0 fills!");
        }
}
}
