public class TrobaMaxim {
    public static void main(String[] args) {

        // creem la variable on guardarem el resultat de sumar
        int maxim = 0;   // inicialment no hem sumat res i per tant és 0

        // demanem valors

        // declarem la variable que contindrà els valors llegits
        int valor;
        // processem el primer valor
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            while (valor >= 0) {
                if (maxim<valor){
                maxim = valor;
                }
        
            System.out.println("Introdueix una nota");
            valor = Integer.parseInt(Entrada.readLine());
            
           }    

        // mostrem el resultat
        System.out.println("El màxim és " + maxim);
    }
}
