public class QuantsParells {
    public static void main(String[] args) {

        // creem la variable on guardarem el resultat de sumar
        int parells = 0;   // inicialment no hem sumat res i per tant és 0

        // demanem valors

        // declarem la variable que contindrà els valors llegits
        int valor;

        // recollim primera nota
        System.out.println("Introdueix un valor");
        valor = Integer.parseInt(Entrada.readLine());
        while (valor >= 0) {
            if ( valor % 2 == 0){
            parells = parells + 1;
            }
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            
            
       }    
                

        // mostrem el resultat
        System.out.println("Nombre de parells introduïts: " + parells);
    }
}
