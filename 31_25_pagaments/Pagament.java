//Aquest programa simula una transacció amb la quantitat a pagar i la pagada, de manera que el programa indiqui si sobren o falten diners.//
public class Pagament{
public static void main(String[] args) {
    System.out.println("Preu?");
        int preu = Integer.parseInt(Entrada.readLine());
    System.out.println("Paga?");
        int paga = Integer.parseInt(Entrada.readLine());
if (paga>preu){
int sobra = paga - preu;
 System.out.println("Sobren "+sobra+"€");
} else if (paga<preu){
int falta = preu-paga;
 System.out.println("Falten "+falta+"€");
 } else {
 System.out.println("No sobra ni falta res");
 }
}
}
