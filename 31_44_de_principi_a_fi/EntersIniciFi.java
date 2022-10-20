/*Aquest programa demana tres nombres enters, i escriu els valors entre 
el primer i el segon saltant d'un al següent amb el tercer.*/
public class EntersIniciFi{
    public static void main(String[] args) {

        int inicial;
        int fin;
        int n;
        int salt;
        System.out.println("Valor inicial?");
        inicial = Integer.parseInt(Entrada.readLine());
        n = inicial;

        System.out.println("Valor final?");
        fin = Integer.parseInt(Entrada.readLine());

        System.out.println("Salt?");
        salt = Integer.parseInt(Entrada.readLine());

        while (n<=fin) {
            System.out.println(n);
            n = n+salt;
        }
    }
}