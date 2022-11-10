// Aquest programa demana a l'usuari una matrícula i li digui si el que li ha introduït correspon a una matrícula italiana vàlida en el format vigent.

public class MatriculaValida {
    public static void main(String[] args) {  

        System.out.println("Introduïu una matrícula"); 
        String paraula = Entrada.readLine(); 

        if (paraula.length()==8){

            boolean caracterInvalid = true;

            for (int i = 0; i<=8; i++){

                if (paraula.charAt(i)=='I'||paraula.charAt(i)=='O'||paraula.charAt(i)=='Q'||paraula.charAt(i)=='U'){

                    caracterInvalid = false;
                    break;

                }

            }

            boolean primeresLletres = (paraula.charAt(0)>64 && paraula.charAt(0)<91) && (paraula.charAt(1)>64 && paraula.charAt(1)<91);
            boolean tresNumeros = (paraula.charAt(2)>47 && paraula.charAt(2)<58) && (paraula.charAt(3)>47 && paraula.charAt(3)<58) && (paraula.charAt(4)>47 && paraula.charAt(4)<58);
            boolean ultimesLletres = (paraula.charAt(5)>64 && paraula.charAt(5)<91) && (paraula.charAt(6)>64 && paraula.charAt(6)<91);

            if (((primeresLletres && tresNumeros) && ultimesLletres) && caracterInvalid){

                System.out.println("És una matrícula italiana vàlida"); 

            }
            else{

                System.out.println("No és una matrícula italiana vàlida"); 

            }

        }
        else{

            System.out.println("No és una matrícula italiana vàlida"); 

        }
        

    }
}