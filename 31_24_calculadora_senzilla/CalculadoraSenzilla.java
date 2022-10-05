/*
 * Aquest programa implementa una calculadora bàsica
 *
 * Demana dos nombres per entrada estàndard i un operand i mostra el
 * resultat de la operació.
 *
 * El programa no controla valors no adequats d'entrada
 */
public class CalculadoraSenzilla {
    public static void main(String[] args) {

        // obté operands d'entrada
        System.out.println("Operand1?");
        double Operand1 =Double.parseDouble(Entrada.readLine());
        System.out.println("Operador?");       
        char operador =Entrada.readLine().charAt(0);
        System.out.println("Operand2?");
        double Operand2 =Double.parseDouble(Entrada.readLine());
        
        // operacio
        switch (operador){
        case "+":
        double resultat = Operand1 + Operand2;
        break;
        case "-":
        double resultat = Operand1 - Operand2;
        break;
        case "*":
        double resultat = Operand1 * Operand2;
        break;
        case "/":
        double resultat = Operand1 / Operand2;
        break;
        case "%":
        double resultat = Operand1 % Operand2;
        break;
        }


        // mostra resultat
        System.out.println(primerOperand + ""+operador+""+segonOperand + " = " + resultat);

    }
}
