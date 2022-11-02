/*Aquest programa  permet construir taules de multiplicar personalitzades. */
public class TaulaMultiplicar { 
    public static void main(String[] args) {  

        int valor1 = Integer.parseInt(args[0]); 
        int valor2 = Integer.parseInt(args[1]);
        int valor3 = Integer.parseInt(args[2]);
        int valor4 = Integer.parseInt(args[3]);

        for (int i = valor1, j = valor3; i <= valor2 && j<=valor4; i++, j++){
            System.out.println(i+ " x " +valor3+ " = " +i*valor3);

            if (valor1!= valor2){
                System.out.println(i+ " x " +valor4+ " = " +i*valor4);  
            }
        }

    }
}        