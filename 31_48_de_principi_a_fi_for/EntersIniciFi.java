//Aquest programa demana tres nombres enters, i escriu els valors entre el 
//primer i el segon saltant d'un al següent amb el tercer.
public class EntersIniciFi { 
    public static void main(String[] args) {  

        System.out.println("Valor inicial?"); 
        int ini = Integer.parseInt(Entrada.readLine());

        System.out.println("Valor final?");
        int fi = Integer.parseInt(Entrada.readLine()); 

        System.out.println("Salt?"); 
        int salt = Integer.parseInt(Entrada.readLine());

        for (int i = ini; i <= fi; i = i + salt){
            System.out.println(i); 
        }
    }
}