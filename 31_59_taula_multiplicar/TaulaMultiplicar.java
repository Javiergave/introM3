public class TaulaMultiplicar { 
    public static void main(String[] args) {  

        int valor1 = Integer.parseInt(args[0]); 
        int valor2 = Integer.parseInt(args[1]);
        int valor3 = Integer.parseInt(args[2]);
        int valor4 = Integer.parseInt(args[3]);

        System.out.println( valor1 + " x " + valor4 + " = "+ valor1*valor4);
        System.out.println("El segon argument és  " + args[1]);
        System.out.println("El tercer argument és " + args[2]);
        System.out.println("El quart argument és  " + args[3]);
        
    }
}        