/*Aquest programa  permet construir taules de multiplicar personalitzades. */
public class TaulaMultiplicar { 
    public static void main(String[] args) {  

        int valor1 = Integer.parseInt(args[0]); 
        int valor2 = Integer.parseInt(args[1]);
        int valor3 = Integer.parseInt(args[2]);
        int valor4 = Integer.parseInt(args[3]);

        for (int i = valor1; i <= valor2; i++){
            for (int j = valor3; j<= valor4; j++){
                System.out.println(i+ " x " +j+ " = " +i*j); 
            }
        }

    }
}        