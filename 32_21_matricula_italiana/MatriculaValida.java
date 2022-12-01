// Aquest programa demana a l'usuari una matrícula i li digui si el que li ha introduït correspon a una matrícula italiana vàlida en el format vigent.

public class MatriculaValida {
    public static void main(String[] args) {  

        System.out.println("Introduïu una matrícula"); 
        String paraula = Entrada.readLine(); 

        if (paraula.length()==7){

            char lletra = paraula.charAt(0);
            boolean lletravalida = true;
            for (int i = 0; i<=1; i++){
                lletra = paraula.charAt(i);
                lletravalida = esLletraValidaPerMatriculaItaliana(lletra);
                if (lletravalida==false){
                    break;
                }
            }

            boolean tresNumeros = (paraula.charAt(2)>47 && paraula.charAt(2)<58) && (paraula.charAt(3)>47 && paraula.charAt(3)<58) && (paraula.charAt(4)>47 && paraula.charAt(4)<58);
            
            if (lletravalida){
            
                for (int i = 5; i<=6; i++){
                    lletra = paraula.charAt(i);
                    lletravalida = esLletraValidaPerMatriculaItaliana(lletra);
                    if (lletravalida==false){
                        break;
                    }
                }
            }

            if (lletravalida&&tresNumeros){

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
    public static boolean esLletraValidaPerMatriculaItaliana(char lletra) { 
        return ((lletra>64 && lletra<91)&&(!((lletra == 'I')||(lletra == 'O')||(lletra == 'U')||(lletra == 'Q'))));
    } 
}