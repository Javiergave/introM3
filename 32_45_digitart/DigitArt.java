 /* Aquest programa recull les dades introduides per l'usuari filtrant els nombres i si apareix un nombre de l'1 al 3 mostra un pixelArt d'aquest */

 public class DigitArt {

    public static char[][] construeix1() {

        return new char[][] {

            {'·', '·', '·', '·', '·'},

                {'·', 'X', 'X', '·', '·'},

                {'·', '·', 'X', '·', '·'},

                {'·', '·', 'X', '·', '·'},

                {'·', '·', 'X', '·', '·'},

                {'·', 'X', 'X', 'X', '·'},

                {'·', '·', '·', '·', '·'}

        };

    }


    public static char[][] construeix2() {

        return new char[][] {

                {'·', '·', '·', '·', '·', '·'},

                {'·', 'X', 'X', 'X', 'X', '·'},

                {'·', '·', '·', '·', 'X', '·'},

                {'·', 'X', 'X', 'X', 'X', '·'},

                {'·', 'X', '·', '·', '·', '·'},

                {'·', 'X', 'X', 'X', 'X', '·'},

                {'·', '·', '·', '·', '·', '·'},

        };

    }


    public static char[][] construeix3() {

        return new char[][] {

            {'·', '·', '·', '·', '·', '·'},

            {'·', 'X', 'X', 'X', 'X', '·'},

            {'·', '·', '·', '·', 'X', '·'},

            {'·', 'X', 'X', 'X', 'X', '·'},

            {'·', '·', '·', '·', 'X', '·'},

            {'·', 'X', 'X', 'X', 'X', '·'},

            {'·', '·', '·', '·', '·', '·'},

    };

    }

    public static void mostraResultat(char[][] origen, char[][] resultat) {

        for (int i = 0; i<= origen.length-1;i++){
            for (int j = 0; j<=origen.length-1; i++){
                System.out.println(origen[i][j]); 
            }
        }

    }

    public static void processaCaracter(char ch) {

        char[][] origen;

        switch (ch) {

            case '1': origen = construeix1();

                      break;

            case '2': origen = construeix2();

                      break;

            case '3': origen = construeix3();

                      break;

            default: return;    // no conec aquest caràcter

        }

        char[][] desti = UtilTaula.substitueix(origen, 'X', ch);

        mostraResultat(origen, desti);

        System.out.println();

    }

    public static void processaArgument(String arg) {

        /* XXX crida a processaCaracter() per cada caracter de arg */
        for (int i = 0; i<=arg.length()-1; i++){
            processaCaracter(arg.charAt(i));
        }

    }

    public static void main(String[] args){

        // comprova que com a mínim hi hagi un argument

        if (args.length==0){
            return;
        }

        // processa cada argument

        /* XXX crida a processaArgument() per cada argument */
        for (int i = 0; i<= args.length-1; i++){
            processaArgument(args[i]);
        }

    }

}