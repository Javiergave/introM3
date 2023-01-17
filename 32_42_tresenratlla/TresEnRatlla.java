/*Aquest programa permet jugar al tres en ratlla introduint les posicions al taulell*/
public class TresEnRatlla {

    public static void main(String[] args) {

        char jugador = 'X';

        // declaració del taulell
        char[][] taulell = new char[3][3];

        // inicialització de les files
        taulell[0][0] = '·';
        taulell[0][1] = '·';
        taulell[0][2] = '·';

        taulell[1][0] = '·';
        taulell[1][1] = '·';
        taulell[1][2] = '·';
        
        taulell[2][0] = '·';
        taulell[2][1] = '·';
        taulell[2][2] = '·';

        System.out.println("Comença el joc");

        
        while (jugadorGuanya(taulell,jugador) == false||hiHaEmpat(taulell)==true) {

            mostraTaulell(taulell);

            System.out.println(jugador + "?");

            // obté el moviment del jugador actual
            String moviment = Entrada.readLine();

            // comprova abandonament
            if (UtilString.esEnter(moviment)==false||moviment.length()<=1||moviment.length()>2){
                if (moviment.equalsIgnoreCase("a")){
                    System.out.println(jugador+" abandona"); 
                    return;
                }
                else{
                    System.out.println("Error"); 
                }
            }else{
                // obté coordenades del moviment
                String num1 = ""+moviment.charAt(0);
                String num2 = ""+moviment.charAt(1);
                int fila = Integer.parseInt(num1);
                int col = Integer.parseInt(num2);

                if ((fila<=2&&fila>=0)&&(col<=2&&col>=0)){
                    // comprova si la casella està ocupada
                    boolean ocupada = casellaOcupada(taulell,fila,col);

                    // realitza el moviment
                    if (ocupada){
                        System.out.println("Ocupada");
                    }
                    else{
                        taulell[fila][col] = jugador;

                            // comprova jugador guanya
                        if (jugadorGuanya(taulell,jugador)){
                            mostraTaulell(taulell);
                            System.out.println(jugador+" guanya"); 
                            return;
                        }

                        // comprova empat
                        if (hiHaEmpat(taulell)){
                            System.out.println("Empat"); 
                            return;
                        }

                        // passa torn a l'altre jugador
                        if (jugador =='X'){
                            jugador = 'O';
                        }else {
                            jugador = 'X';
                        }
                    }
                }
                else{
                    System.out.println("Error");
                }
            }
        }
    }

    // mòduls de suport
    /*Mostra taulell */
    public static void mostraTaulell(char[][] taulell) {
        for (int fila = 0; fila<3; fila++){

            for (int col = 0; col<3; col++){
            System.out.print(taulell[fila][col]);
            }

            System.out.println();

        }
        
    }
    /*Comprova si la casella és ocupada */
    public static boolean casellaOcupada(char[][] taulell, int fila, int columna){
        if (taulell[fila][columna]=='·'){
            return false;
        }
        else{
            return true;
        }
    }
    /*Conté la condició de guanyar */
    public static boolean jugadorGuanya(char[][] taulell, char jugador){

        if ((taulell[0][0]==jugador)&&(taulell[0][1]==jugador)&&(taulell[0][2]==jugador)){
            return true;
        }
        if ((taulell[1][0]==jugador)&&(taulell[1][1]==jugador)&&(taulell[1][2]==jugador)){
            return true;
        }
        if ((taulell[2][0]==jugador)&&(taulell[2][1]==jugador)&&(taulell[2][2]==jugador)){
            return true;
        }
        if ((taulell[0][0]==jugador)&&(taulell[1][1]==jugador)&&(taulell[2][2]==jugador)){
            return true;
        }
        if ((taulell[0][2]==jugador)&&(taulell[1][1]==jugador)&&(taulell[2][0]==jugador)){
            return true;
        }
        if ((taulell[0][0]==jugador)&&(taulell[1][0]==jugador)&&(taulell[2][0]==jugador)){
            return true;
        }
        
        if ((taulell[0][1]==jugador)&&(taulell[1][1]==jugador)&&(taulell[2][1]==jugador)){
            return true;
        }
        if ((taulell[0][2]==jugador)&&(taulell[1][2]==jugador)&&(taulell[2][2]==jugador)){
            return true;
        }
        return false;

    }

    public static boolean hiHaEmpat(char[][] taulell) { 
        boolean totesOcupades = true;
        for(int i=0; i<3; i++){
            for (int j = 0; j<3; j++){
                if(casellaOcupada(taulell,i,j)==false){
                    totesOcupades =false;
                     
                }
            }
        }
        if(totesOcupades){
            return true;
        }
        else{
            return false;
        }
    }
}
   